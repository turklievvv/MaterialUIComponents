package com.example.materialcomposedesigh.Tabs

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.marginStart
import com.example.materialcomposedesigh.R
import com.google.android.material.tabs.TabLayout

class FancyTabs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fancy_tabs)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tabLayout = findViewById<TabLayout>(R.id.TabLayout)
        val textTab = findViewById<TextView>(R.id.textTab)
        val arrow = findViewById<ImageView>(R.id.arrow)
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {

            override fun onTabSelected(tab: TabLayout.Tab?) {
                when(tab?.position){
                    0 -> {textTab.text = "Selected tab 1"
                        val layoutParams = arrow.layoutParams as ConstraintLayout.LayoutParams
                        layoutParams.marginStart = 280  // если это в пикселях
                        arrow.layoutParams = layoutParams}
                    1 -> {textTab.text = "Selected tab 2"
                        val layoutParams = arrow.layoutParams as ConstraintLayout.LayoutParams
                        layoutParams.marginStart = 0  // если это в пикселях
                        arrow.layoutParams = layoutParams}
                    2 -> {textTab.text = "Selected tab 3"
                        val layoutParams = arrow.layoutParams as ConstraintLayout.LayoutParams
                        layoutParams.marginEnd = 280  // если это в пикселях
                        arrow.layoutParams = layoutParams}
                }
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                // Handle tab reselect
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                // Handle tab unselect
            }
        })
    }
}