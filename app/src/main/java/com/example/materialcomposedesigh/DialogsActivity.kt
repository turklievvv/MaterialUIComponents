package com.example.materialcomposedesigh

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.Dialogs.AlertDialogSample
import com.example.materialcomposedesigh.Dialogs.AlertDialogWithIconSample
import com.example.materialcomposedesigh.Dialogs.BasinDialosSample
import com.example.materialcomposedesigh.databinding.ActivityDialogsBinding
import com.example.materialcomposedesigh.databinding.ActivitySimpleBottomSheetScaffoldSampleBinding

class DialogsActivity : AppCompatActivity() {
    lateinit var binding: ActivityDialogsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDialogsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.AlertDialogSample.setOnClickListener { onAlertDialogSamplePressed() }
        binding.AlertDialogWithIconSample.setOnClickListener { onAlertDialogWithIconSamplePressed() }
        binding.BasicAlertDialogSample.setOnClickListener { onBasicDialogPressed() }
    }
    private fun onAlertDialogSamplePressed(){
        startActivity(Intent(this, AlertDialogSample::class.java))
    }
    private fun onAlertDialogWithIconSamplePressed(){
        startActivity(Intent(this, AlertDialogWithIconSample::class.java))
    }
    private fun onBasicDialogPressed(){
        startActivity(Intent(this, BasinDialosSample::class.java))
    }
}