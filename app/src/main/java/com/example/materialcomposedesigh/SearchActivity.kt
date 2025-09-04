package com.example.materialcomposedesigh

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.RadioButton.RadioButtonSample
import com.example.materialcomposedesigh.SearchBars.DockedSearchBarSample
import com.example.materialcomposedesigh.SearchBars.SearchBarSample
import com.example.materialcomposedesigh.databinding.ActivitySeachrBinding

class SearchActivity : AppCompatActivity() {
    lateinit var binding: ActivitySeachrBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySeachrBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.SearchBarSample.setOnClickListener { onSearchBarSamplePressed() }
        binding.DockedSearchBarSample.setOnClickListener { onDockedSearchSamplePressed() }
    }
    private fun onSearchBarSamplePressed(){
        val intent = Intent(this, SearchBarSample::class.java)
        startActivity(intent)
    }
    private fun onDockedSearchSamplePressed(){
        val intent = Intent(this, DockedSearchBarSample::class.java)
        startActivity(intent)
    }
}