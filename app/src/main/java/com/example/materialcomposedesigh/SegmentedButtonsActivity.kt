package com.example.materialcomposedesigh

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.RadioButton.RadioButtonSample
import com.example.materialcomposedesigh.RadioButton.RadioGroupSample
import com.example.materialcomposedesigh.SegmentetButtons.SegmentedButtonMultiSelectSample
import com.example.materialcomposedesigh.SegmentetButtons.SegmentedButtonSingleSelectSample
import com.example.materialcomposedesigh.databinding.ActivitySegmentedButtonsBinding

class SegmentedButtonsActivity : AppCompatActivity() {
    lateinit var binding: ActivitySegmentedButtonsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySegmentedButtonsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.SegmentedButtonSingleSelectSample.setOnClickListener { onSingleSelectPressed() }
        binding.SegmentedButtonMultiSelectSample.setOnClickListener { onMultiSelectPressed() }
    }
    private fun onMultiSelectPressed(){
        val intent = Intent(this, SegmentedButtonMultiSelectSample::class.java)
        startActivity(intent)
    }
    private fun onSingleSelectPressed(){
        val intent = Intent(this, SegmentedButtonSingleSelectSample::class.java)
        startActivity(intent)
    }
}