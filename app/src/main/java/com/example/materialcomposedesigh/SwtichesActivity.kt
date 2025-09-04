package com.example.materialcomposedesigh

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.Switches.SwitchSample
import com.example.materialcomposedesigh.Switches.SwitchWithThumblIconSample
import com.example.materialcomposedesigh.databinding.ActivitySwtichesBinding


class SwtichesActivity : AppCompatActivity() {
    lateinit var binding: ActivitySwtichesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySwtichesBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.SwitchSample.setOnClickListener { onSwitchSamplePressed() }
        binding.SwitchWithThumblIconSample.setOnClickListener { onSwitchWithThumblIconSamplePressed() }
    }

    private fun onSwitchSamplePressed(){
        val intent = Intent(this, SwitchSample::class.java)
        startActivity(intent)
    }
    private fun onSwitchWithThumblIconSamplePressed(){
        val intent = Intent(this, SwitchWithThumblIconSample::class.java)
        startActivity(intent)
    }


}