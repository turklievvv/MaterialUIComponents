package com.example.materialcomposedesigh.menus

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.R
import com.example.materialcomposedesigh.databinding.ActivityExposedDropdownMenuSampleBinding
import com.example.materialcomposedesigh.databinding.ActivitySimpleBottomSheetScaffoldSampleBinding
import com.google.android.material.textfield.MaterialAutoCompleteTextView

class ExposedDropdownMenuSample : AppCompatActivity() {
    lateinit var binding: ActivityExposedDropdownMenuSampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityExposedDropdownMenuSampleBinding.inflate(layoutInflater)
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