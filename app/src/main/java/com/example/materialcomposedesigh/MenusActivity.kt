package com.example.materialcomposedesigh

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.databinding.ActivityBottomSheetsBinding
import com.example.materialcomposedesigh.databinding.ActivityMenusBinding
import com.example.materialcomposedesigh.menus.EditableExposedDropdownMenuSample
import com.example.materialcomposedesigh.menus.ExposedDropdownMenuSample
import com.example.materialcomposedesigh.menus.MenuSample
import com.example.materialcomposedesigh.menus.MenuWithScrollStateSample

class MenusActivity : AppCompatActivity() {
    lateinit var binding: ActivityMenusBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMenusBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.MenuSample.setOnClickListener { onMenuSamplePressed() }
        binding.MenuWithScrollStateSample.setOnClickListener { onScrollMenuSamplePressed() }
        binding.ExprosedDropdownMenuSample.setOnClickListener { onDropdownMenuSamplePressed() }
        binding.EditableExprosedDropdownMenuSample.setOnClickListener { onEditableMenuPressed() }
    }
    fun onMenuSamplePressed(){
        startActivity(Intent(this, MenuSample::class.java))
    }
    fun onScrollMenuSamplePressed(){
        startActivity(Intent(this, MenuWithScrollStateSample::class.java))
    }
    fun onDropdownMenuSamplePressed(){
        startActivity(Intent(this, ExposedDropdownMenuSample::class.java))
    }
    fun onEditableMenuPressed(){
        startActivity(Intent(this, EditableExposedDropdownMenuSample::class.java))
    }
}