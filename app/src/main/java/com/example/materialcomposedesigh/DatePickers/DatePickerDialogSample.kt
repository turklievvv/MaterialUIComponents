package com.example.materialcomposedesigh.DatePickers

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.R
import com.example.materialcomposedesigh.databinding.ActivityDatePickerSampleBinding
import com.google.android.material.datepicker.MaterialDatePicker
import java.text.SimpleDateFormat
import java.util.*

class DatePickerDialogSample : AppCompatActivity() {
    lateinit var binding: ActivityDatePickerSampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDatePickerSampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val datePickerBuilder = MaterialDatePicker.Builder.datePicker()
        datePickerBuilder.setTitleText("Select Date")

        binding.bookingDateEditText.setOnClickListener { datePickerBuilder.build().show(supportFragmentManager, "DATE_PICKER") }

        if (binding.bookingDateEditText.toString().isNotEmpty()) {
            try {

                val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                dateFormat.timeZone = TimeZone.getTimeZone("UTC")
                val parsedDate = dateFormat.parse(binding.bookingDateEditText.text.toString())
                parsedDate?.let {
                    datePickerBuilder.setSelection(it.time)
                }
            } catch (e: Exception) {
                e.printStackTrace()

            }
        }
        val datePicker = datePickerBuilder.build()

        datePicker.addOnPositiveButtonClickListener { selection ->
            val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
            dateFormat.timeZone = TimeZone.getTimeZone("UTC")
            val formattedDate = dateFormat.format(Date(selection))
            binding.bookingDateEditText.setText(formattedDate)
        }

        datePicker.addOnNegativeButtonClickListener {
            binding.bookingDateEditText.clearFocus()
        }

        datePicker.addOnDismissListener {
            binding.bookingDateEditText.clearFocus()
        }

        datePicker.show(supportFragmentManager, "DATE_PICKER")


    }


}