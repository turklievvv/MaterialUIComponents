package com.example.materialcomposedesigh.menus

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.R
import com.example.materialcomposedesigh.databinding.ActivityEditableExposedDropdownMenuSampleBinding
import com.google.android.material.textfield.MaterialAutoCompleteTextView

class EditableExposedDropdownMenuSample : AppCompatActivity() {
    lateinit var binding: ActivityEditableExposedDropdownMenuSampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityEditableExposedDropdownMenuSampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val items = arrayOf("Item 1", "Item 2", "Item 3", "Item 4")
        (binding.menu.editText as? MaterialAutoCompleteTextView)?.setSimpleItems(items)
    }
}