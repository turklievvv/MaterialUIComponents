package com.example.materialcomposedesigh

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.ExtendedFABs.AnimatedExtendedFloatingActionButtonSample
import com.example.materialcomposedesigh.ExtendedFABs.ExtendedFloatingActionButtonSample
import com.example.materialcomposedesigh.ExtendedFABs.ExtendedFloatingActionButtonTextSample
import com.example.materialcomposedesigh.RadioButton.RadioButtonSample
import com.example.materialcomposedesigh.databinding.ActivityExtendedFabactivityBinding

class ExtendedFABActivity : AppCompatActivity() {
    lateinit var binding: ActivityExtendedFabactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityExtendedFabactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.ExtendedFloatingActionButtonSample.setOnClickListener { onFABPressed() }
        binding.ExtendedFloatingActionButtonTextSample.setOnClickListener { onFABTextPressed() }
        binding.AnimatedExtendedFloatingActionButtonSample.setOnClickListener { onAnimatedFABPressed() }
    }
    private fun onFABPressed(){
        val intent = Intent(this, ExtendedFloatingActionButtonSample::class.java)
        startActivity(intent)
    }
    private fun onFABTextPressed(){
        val intent = Intent(this, ExtendedFloatingActionButtonTextSample::class.java)
        startActivity(intent)
    }
    private fun onAnimatedFABPressed(){
        val intent = Intent(this, AnimatedExtendedFloatingActionButtonSample::class.java)
        startActivity(intent)
    }
}