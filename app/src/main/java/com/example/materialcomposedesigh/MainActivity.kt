package com.example.materialcomposedesigh

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Card
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.materialcomposedesigh.Module.CardItem
import com.example.materialcomposedesigh.databinding.ActivityMainBinding

private lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val cardItemsList = mutableListOf<CardItem>(
            CardItem("Buttons", R.drawable.icon_buttons),
            CardItem("CheckBox",R.drawable.outline_check_24),
            CardItem("Switches",R.drawable.ic_switch),
            CardItem("RadioButtons",R.drawable.ic_radio),
            CardItem("IconButtons",R.drawable.ik_add_circle),
            CardItem("Navigation Bar", R.drawable.bottom_navigation_ik),
            CardItem("Chips",R.drawable.chips_svg),
            CardItem("Segmented Buttons",R.drawable.segmented_buttons_ik),
            CardItem("Date Pickers",R.drawable.outline_date_range_24),
            CardItem("Time Picker",R.drawable.time_picker_vector),
            CardItem("Search Bar",R.drawable.search_ik),
            CardItem("Progress Indicator",R.drawable.chips_svg),
            CardItem("Text Fields",R.drawable.chips_svg),
            CardItem("Snackbars",R.drawable.bottom_navigation_ik),
            CardItem("Extended FAB",R.drawable.chips_svg),
            CardItem("Bottom Sheet",R.drawable.bottom_navigation_ik),
            CardItem("Dialogs",R.drawable.chips_svg),
            CardItem("Menus",R.drawable.chips_svg),
            CardItem("Bottom app bar",R.drawable.bottom_navigation_ik),
            CardItem("Lists",R.drawable.bottom_navigation_ik),
            CardItem("Sliders",R.drawable.bottom_navigation_ik),
            CardItem("Carousel",R.drawable.bottom_navigation_ik),
            CardItem("Pull to refresh indicator",R.drawable.bottom_navigation_ik),
            CardItem("Navigation Drawer",R.drawable.bottom_navigation_ik),
            CardItem("Tabs",R.drawable.bottom_navigation_ik),
            CardItem("Top app bar",R.drawable.bottom_navigation_ik)


        )

        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = GridLayoutManager(this,2)
        recyclerView.adapter = CardAdapter(cardItemsList, this)
    }
}