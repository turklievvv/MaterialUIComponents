package com.example.materialcomposedesigh

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.BottomAppBars.BottomAppBarWithFAB
import com.example.materialcomposedesigh.BottomAppBars.ExitAlwaysBottomAppBar
import com.example.materialcomposedesigh.BottomAppBars.SimpleBottomAppBar
import com.example.materialcomposedesigh.databinding.ActivityBottomAppBarBinding

class BottomAppBarActivity : AppCompatActivity() {
    lateinit var binding: ActivityBottomAppBarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityBottomAppBarBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.SimpleBottomAppBar.setOnClickListener { onBottomAppBarSimplePressed() }
        binding.BottomAppBarWithFAB.setOnClickListener { onBottomAppBarWithFABPressed() }
        binding.ExitAlwaysBottomAppBar.setOnClickListener { onBottomAppBarExitPressed() }
    }
    private fun onBottomAppBarSimplePressed(){
        startActivity(Intent(this, SimpleBottomAppBar::class.java))
    }
    private fun onBottomAppBarWithFABPressed(){
        startActivity(Intent(this, BottomAppBarWithFAB::class.java))
    }
    private fun onBottomAppBarExitPressed(){
        startActivity(Intent(this, ExitAlwaysBottomAppBar::class.java))
    }
}