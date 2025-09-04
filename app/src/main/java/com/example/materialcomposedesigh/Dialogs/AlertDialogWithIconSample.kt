package com.example.materialcomposedesigh.Dialogs

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class AlertDialogWithIconSample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_alert_dialog_with_icon_sample)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        MaterialAlertDialogBuilder(this)
            .setTitle("Титульное сообщение")
            .setMessage("Какое то сообщение")
            .setNeutralButton("Нейтрал") { dialog, which ->
                // Respond to neutral button press
            }
            .setNegativeButton("Отмена") { dialog, which ->
                // Respond to negative button press
            }
            .setPositiveButton("Принять") { dialog, which ->
                // Respond to positive button press
            }
            .setIcon(R.drawable.like)
            .show()
    }
}