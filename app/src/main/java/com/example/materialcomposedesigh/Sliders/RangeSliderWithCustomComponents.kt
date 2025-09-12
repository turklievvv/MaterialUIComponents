package com.example.materialcomposedesigh.Sliders


import android.content.res.ColorStateList
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.R
import com.google.android.material.slider.RangeSlider

class RangeSliderWithCustomComponents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_range_slider_with_custom_components)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val rangeSlider = findViewById<RangeSlider>(R.id.slider)
        rangeSlider.values = listOf(0f, 100f)
        rangeSlider.trackActiveTintList = ColorStateList.valueOf(Color.BLACK)
        rangeSlider.haloTintList = ColorStateList.valueOf(Color.parseColor("#80FF4081"))
        rangeSlider.thumbStrokeColor = ColorStateList.valueOf(Color.RED)
    }
}