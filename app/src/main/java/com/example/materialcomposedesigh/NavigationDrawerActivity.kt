package com.example.materialcomposedesigh

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.NavigationDrawers.DismissibleNavigationDrawerSample
import com.example.materialcomposedesigh.NavigationDrawers.ModalNavigationDrawerSample
import com.example.materialcomposedesigh.NavigationDrawers.PermanentNavigationDrawerSample
import com.example.materialcomposedesigh.databinding.ActivityNavigationDrawerBinding

class NavigationDrawerActivity : AppCompatActivity() {
    lateinit var binding: ActivityNavigationDrawerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityNavigationDrawerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.ModalNavigationDrawerSample.setOnClickListener { onModalDrawerPressed() }
        binding.PermanentNAvigationDrawerSample.setOnClickListener { onPermanentDrawerPressed() }
        binding.DismissibleNavigationDrawerSample.setOnClickListener { onDissmisibleDrawerPressed() }
    }
    private fun onModalDrawerPressed(){
        startActivity(Intent(this, ModalNavigationDrawerSample::class.java))
    }
    private fun onPermanentDrawerPressed(){
        startActivity(Intent(this, PermanentNavigationDrawerSample::class.java))
    }
    private fun onDissmisibleDrawerPressed(){
        startActivity(Intent(this, DismissibleNavigationDrawerSample::class.java))
    }

}