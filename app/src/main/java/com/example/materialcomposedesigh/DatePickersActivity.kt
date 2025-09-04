package com.example.materialcomposedesigh

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.DatePickers.DateInputSample
import com.example.materialcomposedesigh.DatePickers.DatePickerDialogSample
import com.example.materialcomposedesigh.DatePickers.DatePickerSample
import com.example.materialcomposedesigh.DatePickers.DatePickerWithDateSelectableDatesSample
import com.example.materialcomposedesigh.DatePickers.DateRangePickerSample
import com.example.materialcomposedesigh.databinding.ActivityDatePickersBinding

class DatePickersActivity : AppCompatActivity() {
    lateinit var binding: ActivityDatePickersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDatePickersBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.DatePickerDialogSample.setOnClickListener { onDatePickerDialogSamplePressed() }
        binding.DatePickerSampleCV.setOnClickListener { onDatePickerSamplePressed() }
        binding.DatePickerWithDateSelectableDatesSampleCV.setOnClickListener { onDatePickerWithDateSelectableDatesSamplePressed() }
        binding.DateinputSample.setOnClickListener { onDateInputSamplePressed() }
        binding.DateRangePickerSample.setOnClickListener { onDateRangePickerSamplePressed() }
    }
    private fun onDatePickerDialogSamplePressed(){
        val intent = Intent(this, DatePickerDialogSample::class.java)
        startActivity(intent)
    }
    private fun onDatePickerSamplePressed(){
        val intent = Intent(this, DatePickerSample::class.java)
        startActivity(intent)
    }
    private fun onDatePickerWithDateSelectableDatesSamplePressed(){
        val intent = Intent(this, DatePickerWithDateSelectableDatesSample::class.java)
        startActivity(intent)
    }
    private fun onDateInputSamplePressed(){
        val intent = Intent(this, DateInputSample::class.java)
        startActivity(intent)
    }
    private fun onDateRangePickerSamplePressed(){
        val intent = Intent(this, DateRangePickerSample::class.java)
        startActivity(intent)
    }

}