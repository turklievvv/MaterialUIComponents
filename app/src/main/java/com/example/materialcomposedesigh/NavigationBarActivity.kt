package com.example.materialcomposedesigh

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.NavigationBar.NavigationBarOnlySelectedLabelsSample
import com.example.materialcomposedesigh.NavigationBar.NavigationBarSample
import com.example.materialcomposedesigh.RadioButton.RadioButtonSample
import com.example.materialcomposedesigh.RadioButton.RadioGroupSample
import com.example.materialcomposedesigh.databinding.ActivityNavigationBarBinding

class NavigationBarActivity : AppCompatActivity() {
    lateinit var binding: ActivityNavigationBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityNavigationBarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.NavigationBarSample.setOnClickListener { onNavigationBarSamplePressed() }
        binding.NavigationBarWithOnlySelectedLabelsSample.setOnClickListener { onNavigationBarWithOnlySelectedLablesSamplePressed() }
    }
    private fun onNavigationBarSamplePressed(){
        val intent = Intent(this, NavigationBarSample::class.java)
        startActivity(intent)
    }
    private fun onNavigationBarWithOnlySelectedLablesSamplePressed(){
        val intent = Intent(this, NavigationBarOnlySelectedLabelsSample::class.java)
        startActivity(intent)
    }
}