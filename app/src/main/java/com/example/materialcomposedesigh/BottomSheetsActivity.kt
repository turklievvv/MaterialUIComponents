package com.example.materialcomposedesigh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.materialcomposedesigh.BottomSheets.ModalBottomSheetSample
import com.example.materialcomposedesigh.BottomSheets.SimpleBottomSheetScaffoldSample
import com.example.materialcomposedesigh.databinding.ActivityBottomSheetsBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class BottomSheetsActivity : AppCompatActivity() {
    lateinit var binding: ActivityBottomSheetsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityBottomSheetsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.ModalBottomSheetSample.setOnClickListener { onModalBottomSheetPressed() }
        binding.SimpleBottomSheetScaffoldSample.setOnClickListener { onScaffordBottomSheetPressed() }
    }
    private fun onModalBottomSheetPressed(){
        val intent = Intent(this, ModalBottomSheetSample::class.java)
        startActivity(intent)
    }
    private fun onScaffordBottomSheetPressed(){
        val intent = Intent(this, SimpleBottomSheetScaffoldSample::class.java)
        startActivity(intent)
    }

}
