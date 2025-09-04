package com.example.materialcomposedesigh

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.RadioButton.RadioButtonSample
import com.example.materialcomposedesigh.RadioButton.RadioGroupSample
import com.example.materialcomposedesigh.Switches.SwitchSample
import com.example.materialcomposedesigh.Switches.SwitchWithThumblIconSample
import com.example.materialcomposedesigh.databinding.ActivityRadioButtonsBinding
import com.example.materialcomposedesigh.databinding.ActivitySwtichesBinding

class RadioButtonsActivity : AppCompatActivity() {
    lateinit var binding: ActivityRadioButtonsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityRadioButtonsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.RadioButtonSample.setOnClickListener { onRadioButtonSamplePressed() }
        binding.RadioGroupSample.setOnClickListener { onRadioGroupSamplePressed() }

    }

    private fun onRadioButtonSamplePressed(){
        val intent = Intent(this, RadioButtonSample::class.java)
        startActivity(intent)
    }
    private fun onRadioGroupSamplePressed(){
        val intent = Intent(this, RadioGroupSample::class.java)
        startActivity(intent)
    }

}