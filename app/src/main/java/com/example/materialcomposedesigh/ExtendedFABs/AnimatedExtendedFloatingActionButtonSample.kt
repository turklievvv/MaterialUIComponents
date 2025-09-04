package com.example.materialcomposedesigh.ExtendedFABs

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.R
import com.example.materialcomposedesigh.databinding.ActivityAnimatedExtendedFloatingActionButtonSampleBinding

class AnimatedExtendedFloatingActionButtonSample : AppCompatActivity() {
    lateinit var binding : ActivityAnimatedExtendedFloatingActionButtonSampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityAnimatedExtendedFloatingActionButtonSampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.extendFAB.setOnClickListener { binding.extendedFab.extend() }
        binding.shrinkFAB.setOnClickListener { binding.extendedFab.shrink() }
    }
}