package com.example.materialcomposedesigh.ProgressIndicators

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.animation.DecelerateInterpolator
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.R
import com.google.android.material.progressindicator.LinearProgressIndicator
import com.google.android.material.slider.Slider

class LinearProgressIndicatorSample : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_linear_progress_indicator_sample)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val progressIndicator = findViewById<LinearProgressIndicator>(R.id.progressIndicator)
        val slider = findViewById<Slider>(R.id.slider)

        slider.addOnChangeListener { _, value, _ ->
            animateProgress(progressIndicator, value.toInt())
        }



    }
    fun animateProgress(indicator: LinearProgressIndicator, to: Int) {
        val animator = ObjectAnimator.ofInt(indicator, "progress", indicator.progress, to)
        animator.duration = 300 // миллисекунды
        animator.interpolator = DecelerateInterpolator()
        animator.start()
    }
}