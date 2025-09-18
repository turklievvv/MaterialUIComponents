package com.example.materialcomposedesigh

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.PullToRefreshIndicators.PullToRefreshSample
import com.example.materialcomposedesigh.PullToRefreshIndicators.PullToRefreshScallingSample
import com.example.materialcomposedesigh.PullToRefreshIndicators.PullToRefreshViewModelSample
import com.example.materialcomposedesigh.databinding.ActivityPullToRefreshSampleBinding

class PullToRefreshSample : AppCompatActivity() {
    lateinit var binding: ActivityPullToRefreshSampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityPullToRefreshSampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.PullToRefreshSample.setOnClickListener { onPullToRefreshSamplePressed() }
        binding.PullToRefreshScalingSample.setOnClickListener { onPullToRefreshScallingSamplePressed() }
        binding.PullToRefreshSampleCustomState.setOnClickListener { onPullToRefreshScallingSamplePressed() }
        binding.PullToRefreshViewModelSample.setOnClickListener { onPullToRefreshViewModelPressed() }
    }
    private fun onPullToRefreshSamplePressed(){
        startActivity(Intent(this, PullToRefreshSample::class.java))
    }
    private fun onPullToRefreshScallingSamplePressed(){
        startActivity(Intent(this, PullToRefreshScallingSample::class.java))
    }
    private fun onPullToRefreshViewModelPressed(){
        startActivity(Intent(this, PullToRefreshViewModelSample::class.java))
    }
}