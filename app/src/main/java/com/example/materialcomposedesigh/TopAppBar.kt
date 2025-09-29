package com.example.materialcomposedesigh

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.TopAppBars.EnterAlwaysTopAppBar
import com.example.materialcomposedesigh.TopAppBars.ExitUntilCollapsedMediumTopAppBar
import com.example.materialcomposedesigh.TopAppBars.PinnedTopAppBar
import com.example.materialcomposedesigh.TopAppBars.SimpleCenterAlignedTopAppBar
import com.example.materialcomposedesigh.TopAppBars.SimpleTopAppBar
import com.example.materialcomposedesigh.databinding.ActivityTopAppBarBinding

class TopAppBar : AppCompatActivity() {
    lateinit var binding: ActivityTopAppBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTopAppBarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.SimpleTopAppBar.setOnClickListener { onSimpleTopAppbarPressed() }
        binding.SimpleCenterAlignedTopAppBar.setOnClickListener { onSimpleCenterTopAppbarPressed() }
        binding.PinnedTopAppBar.setOnClickListener { onPinnedTopAppbarPressed() }
        binding.EnterAlwaysTopAppBar.setOnClickListener { onEnterAlwaysTopAppbarPressed() }
        binding.ExitUntilCollapsedMediumTopAppBar.setOnClickListener { onCollapseMediumTopAppbarPressed() }
    }
    fun onSimpleTopAppbarPressed(){
        startActivity(Intent(this, SimpleTopAppBar::class.java))
    }
    fun onSimpleCenterTopAppbarPressed(){
        startActivity(Intent(this, SimpleCenterAlignedTopAppBar::class.java))
    }
    fun onPinnedTopAppbarPressed(){
        startActivity(Intent(this, PinnedTopAppBar::class.java))
    }
    fun onEnterAlwaysTopAppbarPressed(){
        startActivity(Intent(this, EnterAlwaysTopAppBar::class.java))
    }
    fun onCollapseMediumTopAppbarPressed(){
        startActivity(Intent(this, ExitUntilCollapsedMediumTopAppBar::class.java))
    }

}