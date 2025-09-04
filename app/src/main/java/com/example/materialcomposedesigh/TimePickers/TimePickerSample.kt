package com.example.materialcomposedesigh.TimePickers

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.R
import com.example.materialcomposedesigh.databinding.ActivityTimePickerSampleBinding
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.MaterialTimePicker.INPUT_MODE_CLOCK
import com.google.android.material.timepicker.TimeFormat

@Suppress("DEPRECATION")
class TimePickerSample : AppCompatActivity() {
    lateinit var binding: ActivityTimePickerSampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTimePickerSampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.setTimeButton.setOnClickListener {
            onSetTimePressed()
        }


    }
    val picker =
        MaterialTimePicker.Builder()
            .setTimeFormat(TimeFormat.CLOCK_24H)
            .setHour(12)
            .setMinute(10)
            .setTitleText("Select Appointment time")
            .setInputMode(INPUT_MODE_CLOCK)
            .build()
    fun onSetTimePressed(){
        picker.show(supportFragmentManager, "tag");
    }
}