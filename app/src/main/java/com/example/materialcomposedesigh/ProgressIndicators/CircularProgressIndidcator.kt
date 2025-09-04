package com.example.materialcomposedesigh.ProgressIndicators

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.animation.DecelerateInterpolator
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.R
import com.google.android.material.progressindicator.CircularProgressIndicator
import com.google.android.material.progressindicator.LinearProgressIndicator
import com.google.android.material.slider.Slider

class CircularProgressIndidcator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_circular_progress_indidcator)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val progressIndicator = findViewById<CircularProgressIndicator>(R.id.progressIndicator1)
        val slider = findViewById<Slider>(R.id.slider1)

        slider.addOnChangeListener { _, value, _ ->
            animateProgress(progressIndicator, value.toInt())
        }



    }
    fun animateProgress(indicator: CircularProgressIndicator, to: Int) {
        val animator = ObjectAnimator.ofInt(indicator, "progress", indicator.progress, to)
        animator.duration = 300 // миллисекунды
        animator.interpolator = DecelerateInterpolator()
        animator.start()
    }
}