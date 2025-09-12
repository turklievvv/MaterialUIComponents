package com.example.materialcomposedesigh

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.graphics.Interval
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.Sliders.RangeSliderSample
import com.example.materialcomposedesigh.Sliders.RangeSliderWithCustomComponents
import com.example.materialcomposedesigh.Sliders.SliderSample
import com.example.materialcomposedesigh.Sliders.SliderWithCustomThumbSample
import com.example.materialcomposedesigh.Sliders.SliderWithCustomTrackAndThumb
import com.example.materialcomposedesigh.Sliders.StepRangeSliderSample
import com.example.materialcomposedesigh.Sliders.StepSliderSample
import com.example.materialcomposedesigh.databinding.ActivitySlidersBinding

class SlidersActivity : AppCompatActivity() {
    lateinit var binding: ActivitySlidersBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivitySlidersBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.SlidersSample.setOnClickListener { onSliderSamplePressed() }
        binding.StepSliderSample.setOnClickListener { onStepSliderSamplePressed() }
        binding.SliderWithCustomThumbSample.setOnClickListener { onSliderSampleCustomThumbPressed() }
        binding.SliderWithCustomTrackAndThumb.setOnClickListener { onSliderSampleCustomThumbAndTruckPressed() }
        binding.RangeSliderSample.setOnClickListener { onRangeSliderSample() }
        binding.StepRangeSliderSample.setOnClickListener { onStepRangeSample() }
        binding.RangeSliderWithCustomComponents.setOnClickListener { onRangeWithCustom() }

    }
    private fun onSliderSamplePressed(){
        startActivity(Intent(this, SliderSample::class.java))
    }
    private fun onStepSliderSamplePressed(){
        startActivity(Intent(this, StepSliderSample::class.java))
    }
    private fun onSliderSampleCustomThumbPressed(){
        startActivity(Intent(this, SliderWithCustomThumbSample::class.java))
    }
    private fun onSliderSampleCustomThumbAndTruckPressed(){
        startActivity(Intent(this, SliderWithCustomTrackAndThumb::class.java))
    }
    private fun onRangeSliderSample(){
        startActivity(Intent(this, RangeSliderSample::class.java))
    }
    private fun onStepRangeSample(){
        startActivity(Intent(this, StepRangeSliderSample::class.java))
    }
    private fun onRangeWithCustom(){
        startActivity(Intent(this, RangeSliderWithCustomComponents::class.java))
    }

}