package com.example.materialcomposedesigh

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.materialcomposedesigh.Module.CheckBoxItem
import com.example.materialcomposedesigh.databinding.ActivityCheckBoxBinding

class CheckBoxActivity : AppCompatActivity() {
    lateinit var binding: ActivityCheckBoxBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCheckBoxBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val checkBoxList = mutableListOf<CheckBoxItem>(
            CheckBoxItem("CheckBoxSample","Описание чекбокса"),
            CheckBoxItem("CheckBoxWithTextSample","Описание чекбокса"),
            CheckBoxItem("TriStateCheckBoxSample","Описание чекбокса")
        )

        val recyclerView = binding.recyclerViewCheckBox
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CheckBoxAdapter(checkBoxList,this)
    }
}