package com.example.materialcomposedesigh.Sliders

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.R
import com.google.android.material.slider.Slider

class SliderWithCustomThumbSample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_slider_with_custom_thumb_sample)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val slider = findViewById<Slider>(R.id.slider)

// Заменить иконку ползунка на сердце
        val heartDrawable = ContextCompat.getDrawable(this, R.drawable.like)
        slider.setCustomThumbDrawable(heartDrawable)
    }
}