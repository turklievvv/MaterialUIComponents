package com.example.materialcomposedesigh

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.ProgressIndicators.CircularProgressIndidcator
import com.example.materialcomposedesigh.ProgressIndicators.IndeterminateCircularProgressIndicator
import com.example.materialcomposedesigh.ProgressIndicators.IndeterminateLinearProgressIndicatorSample
import com.example.materialcomposedesigh.ProgressIndicators.LinearProgressIndicatorSample
import com.example.materialcomposedesigh.RadioButton.RadioButtonSample
import com.example.materialcomposedesigh.databinding.ActivityDatePickersBinding
import com.example.materialcomposedesigh.databinding.ActivityProgressIndicatorsBinding

class ProgressIndicatorsActivity : AppCompatActivity() {
    lateinit var binding: ActivityProgressIndicatorsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityProgressIndicatorsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.LinearProgressIndicatorSample.setOnClickListener { onLinearProgressPressed() }
        binding.indeterminateLinearProgressIndicatorSample.setOnClickListener { onIndeterminateLinearProgressPressed() }
        binding.circularProgressIndicator.setOnClickListener { onCircularProgressPressed() }
        binding.IndeterminateCircularProgressIndicator.setOnClickListener { onIndeterminateCircularProgressPressed() }
    }
    private fun onLinearProgressPressed(){
        val intent = Intent(this, LinearProgressIndicatorSample::class.java)
        startActivity(intent)
    }
    private fun onIndeterminateLinearProgressPressed(){
        val intent = Intent(this, IndeterminateLinearProgressIndicatorSample::class.java)
        startActivity(intent)
    }
    private fun onCircularProgressPressed(){
        val intent = Intent(this, CircularProgressIndidcator::class.java)
        startActivity(intent)
    }
    private fun onIndeterminateCircularProgressPressed(){
        val intent = Intent(this, IndeterminateCircularProgressIndicator::class.java)
        startActivity(intent)
    }
}