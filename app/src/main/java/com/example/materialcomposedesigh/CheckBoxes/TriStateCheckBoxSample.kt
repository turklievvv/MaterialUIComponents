package com.example.materialcomposedesigh.CheckBoxes

import android.os.Bundle
import android.provider.ContactsContract
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.R


private var isUpdating = false

class TriStateCheckBoxSample : AppCompatActivity() {

    private lateinit var receiveEmails: CheckBox
    private lateinit var daily: CheckBox
    private lateinit var weekly: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tri_state_check_box_sample)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        receiveEmails = findViewById<CheckBox>(R.id.checkbox_receive_emails)
        daily = findViewById<CheckBox>(R.id.checkbox_daily)
        weekly = findViewById<CheckBox>(R.id.checkbox_weekly)

        // Инициализация: дочерние активны, если родитель включён
        updateChildren(receiveEmails.isChecked)

        receiveEmails.setOnCheckedChangeListener { _, isChecked ->
            if (!isUpdating) {
                isUpdating = true
                updateChildren(isChecked)
                isUpdating = false
            }
        }

        val childListener = { _: android.widget.CompoundButton, _: Boolean ->
            if (!isUpdating) {
                isUpdating = true
                val allChecked = daily.isChecked && weekly.isChecked
                receiveEmails.isChecked = allChecked
                isUpdating = false
            }
        }

        daily.setOnCheckedChangeListener(childListener)
        weekly.setOnCheckedChangeListener(childListener)


    }

    private fun updateChildren(enabled: Boolean) {
        daily.isEnabled = enabled
        weekly.isEnabled = enabled

        if (enabled) {
            daily.isChecked = true
            weekly.isChecked = true
        } else {
            daily.isChecked = false
            weekly.isChecked = false
        }
    }

}
