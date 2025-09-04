package com.example.materialcomposedesigh

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.materialcomposedesigh.Module.IconButtonsItem
import com.example.materialcomposedesigh.databinding.ActivityIconButtonsBinding

class IconButtons : AppCompatActivity() {
    lateinit var binding: ActivityIconButtonsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityIconButtonsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val iconButtonsList = mutableListOf<IconButtonsItem>(
            IconButtonsItem("IconButtonSample", "IconButton Example"),
            IconButtonsItem("TintedIconButtonSample", "IconButton Example"),
            IconButtonsItem("IconToggleButtonSample", "IconButton Example"),
            IconButtonsItem("FilledIconButtonSample", "IconButton Example"),
            IconButtonsItem("FilledToggleButtonSample", "IconButton Example"),
            IconButtonsItem("FilledTonalIconToggleButtonSample", "IconButton Example"),
            IconButtonsItem("FilledTonalIconButtonSample", "IconButton Example"),
            IconButtonsItem("OutlinedIconButtonSample", "IconButton Example"),
            IconButtonsItem("OutlinedIconToggleButtonSample", "IconButton Example"),
        )

        val recyclerView = binding.recyclerViewIconButtons
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = IconButtonsAdapter(iconButtonsList, this)
    }
}