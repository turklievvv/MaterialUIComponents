package com.example.materialcomposedesigh.Tabs

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.R
import com.google.android.material.tabs.TabLayout

class ScrollinsPrimaryTextTab : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_scrollins_primary_text_tab)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tabLayout = findViewById<TabLayout>(R.id.TabLayout)
        val textTab = findViewById<TextView>(R.id.textTab)
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {

            override fun onTabSelected(tab: TabLayout.Tab?) {
                when(tab?.position){
                    0 -> textTab.text = "Selected tab 1"
                    1 -> textTab.text = "Selected tab 2"
                    2 -> textTab.text = "Selected tab 3"
                    3 -> textTab.text = "Selected tab 4"
                    4 -> textTab.text = "Selected tab 5"
                    5 -> textTab.text = "Selected tab 6"
                    6 -> textTab.text = "Selected tab 7"
                    7 -> textTab.text = "Selected tab 8"
                    8 -> textTab.text = "Selected tab 9"
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