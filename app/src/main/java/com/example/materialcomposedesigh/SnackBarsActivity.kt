package com.example.materialcomposedesigh

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.Snackbars.ScaffordWithCoroutineSnackbar
import com.example.materialcomposedesigh.Snackbars.ScaffordWithCustomSnackbar
import com.example.materialcomposedesigh.Snackbars.ScaffordWithIdefiniteSnackbar
import com.example.materialcomposedesigh.Snackbars.ScaffordWithMultilineSnackbar
import com.example.materialcomposedesigh.Snackbars.ScaffordWithSimpleSnackbar
import com.example.materialcomposedesigh.databinding.ActivityNavigationBarBinding
import com.example.materialcomposedesigh.databinding.ActivitySnackBarsBinding

class SnackBarsActivity : AppCompatActivity() {
    lateinit var binding: ActivitySnackBarsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySnackBarsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.ScaffordWithSimpleSnackbar.setOnClickListener { onScaffordWithSimpleSnackbarPressed() }
        binding.ScaffordWithIdefiniteSnackbar.setOnClickListener { onScaffordWithIndefiniteSnackbarPressed() }
        binding.ScaffordWithCustomSnackbar.setOnClickListener { onScaffordWithCustomSnackbarPressed() }
        binding.ScaffordWithCoroutinesSnackbar.setOnClickListener { onScaffordWithCoroutineSnackbarPressed() }
        binding.ScaffordWithMultilineSnackbar.setOnClickListener { onScaffordWithMultilineSnackbarPressed() }
    }
    private fun onScaffordWithSimpleSnackbarPressed(){
        val intent = Intent(this,ScaffordWithSimpleSnackbar::class.java)
        startActivity(intent)
    }
    private fun onScaffordWithIndefiniteSnackbarPressed(){
        val intent = Intent(this, ScaffordWithIdefiniteSnackbar::class.java)
        startActivity(intent)
    }
    private fun onScaffordWithCustomSnackbarPressed(){
        val intent = Intent(this, ScaffordWithCustomSnackbar::class.java)
        startActivity(intent)
    }
    private fun onScaffordWithCoroutineSnackbarPressed(){
        val intent = Intent(this, ScaffordWithCoroutineSnackbar::class.java)
        startActivity(intent)
    }
    private fun onScaffordWithMultilineSnackbarPressed(){
        val intent = Intent(this, ScaffordWithMultilineSnackbar::class.java)
        startActivity(intent)
    }

}