package com.example.materialcomposedesigh

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.materialcomposedesigh.Module.ButtonsItem
import com.example.materialcomposedesigh.databinding.ActivityButtonsBinding

private lateinit var binding : ActivityButtonsBinding
class ButtonsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityButtonsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val buttonsItemsList = mutableListOf<ButtonsItem>(
            ButtonsItem("ButtonSample","Описание кнопки"),
            ButtonsItem("ElevatedButtonSample","Описание кнопки"),
            ButtonsItem("FilledTonalButton","Описание кнопки"),
            ButtonsItem("OutlinedButtonSample","Описание кнопки"),
            ButtonsItem("TextButtonSample","Описание кнопки"),
            ButtonsItem("ButtonWithIconSample","Описание кнопки")
        )
        val recyclerView = binding.recyclerViewButtons
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ButtonsAdapter(buttonsItemsList,this)
    }
}