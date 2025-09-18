package com.example.materialcomposedesigh

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.Carousels.FadingHorizontalStrategy
import com.example.materialcomposedesigh.Carousels.HorizontalMultiBrowseCarouselSample
import com.example.materialcomposedesigh.Carousels.HorizontalUncontainedCarouselSample
import com.example.materialcomposedesigh.databinding.ActivityCarouselBinding

class Carousel : AppCompatActivity() {
    lateinit var binding: ActivityCarouselBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCarouselBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.HorizontalMultiBrowseCarouselSample.setOnClickListener { onMultiBrowsePressed() }
        binding.HorizontalUncontainedCarouselSample.setOnClickListener { onUncotainedBrowsePressed() }
        binding.FadingHorizontalMultiBrowseCarouselSample.setOnClickListener { onFadingPressed() }
    }
    fun onMultiBrowsePressed(){
        startActivity(Intent(this, HorizontalMultiBrowseCarouselSample::class.java))
    }
    fun onUncotainedBrowsePressed(){
        startActivity(Intent(this, HorizontalUncontainedCarouselSample::class.java))
    }
    fun onFadingPressed(){
        startActivity(Intent(this, FadingHorizontalStrategy::class.java))
    }

}