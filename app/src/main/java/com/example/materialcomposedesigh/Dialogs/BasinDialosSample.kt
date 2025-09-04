package com.example.materialcomposedesigh.Dialogs

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.R
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class BasinDialosSample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_basin_dialos_sample)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        MaterialAlertDialogBuilder(this)
            .setMessage("Тут должно быть какое то информативное сообщение , но его тут нету и вы попросту потеряли время на прочтение этого сообшения")
            .setPositiveButton("Принять") { dialog, which ->
                // Respond to positive button press
            }
            .show()
    }
}