package com.example.materialcomposedesigh

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.RadioButton.RadioButtonSample
import com.example.materialcomposedesigh.TimePickers.TimeInputSample
import com.example.materialcomposedesigh.TimePickers.TimePickerSample
import com.example.materialcomposedesigh.databinding.ActivityTimePickerBinding

class TimePickerActivity : AppCompatActivity() {
    lateinit var binding: ActivityTimePickerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTimePickerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.TimePickerSample.setOnClickListener { onTimePickerSamplePressed() }
        binding.TimeInputSample.setOnClickListener { onTimeInputSamplePressed() }
        binding.TimePickerSwitchableSample.setOnClickListener { onTimePickerSamplePressed() }
    }

    private fun onTimePickerSamplePressed(){
        val intent = Intent(this, TimePickerSample::class.java)
        startActivity(intent)
    }
    private fun onTimeInputSamplePressed(){
        val intent = Intent(this, TimeInputSample::class.java)
        startActivity(intent)
    }
}