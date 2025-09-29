package com.example.materialcomposedesigh

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.Tabs.FancyTabs
import com.example.materialcomposedesigh.Tabs.LeadingIconTabs
import com.example.materialcomposedesigh.Tabs.PrimaryIconTabs
import com.example.materialcomposedesigh.Tabs.PrimaryTextTabs
import com.example.materialcomposedesigh.Tabs.ScrollingSecondaryTextTabs
import com.example.materialcomposedesigh.Tabs.ScrollinsPrimaryTextTab
import com.example.materialcomposedesigh.Tabs.SecondaryIconTabs
import com.example.materialcomposedesigh.Tabs.SecondaryTextTabs
import com.example.materialcomposedesigh.Tabs.TextAndIconTabs
import com.example.materialcomposedesigh.databinding.ActivityTabsBinding

class TabsActivity : AppCompatActivity() {
    lateinit var binding: ActivityTabsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTabsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.PrimaryTextTabs.setOnClickListener { onPrimaryTextTabsPressed() }
        binding.PrimaryIconTabs.setOnClickListener { onPrimaryIconTabsPressed() }
        binding.SecondaryTextTabs.setOnClickListener { onSecondaryTextTabsPressed() }
        binding.SecondaryIconTabs.setOnClickListener { onSecondaryIconTextTabsPressed() }
        binding.TextAndIconTabs.setOnClickListener { onTextAndIconTabsPressed() }
        binding.LeadingIconTabs.setOnClickListener { onLeadingIconPressed() }
        binding.ScrollingPrimaryTextTabs.setOnClickListener { ScrollingPrimaryTextTabsPressed() }
        binding.ScrollingSecondaryTextTabs.setOnClickListener { ScrollingSecondaryTextTabsPressed() }
        binding.FancyTabs.setOnClickListener { onFancyTabsPressed() }
    }
    fun onPrimaryTextTabsPressed(){
        startActivity(Intent(this, PrimaryTextTabs::class.java))
    }
    fun onPrimaryIconTabsPressed(){
        startActivity(Intent(this, PrimaryIconTabs::class.java))
    }
    fun onSecondaryTextTabsPressed(){
        startActivity(Intent(this, SecondaryTextTabs::class.java))
    }
    fun onSecondaryIconTextTabsPressed(){
        startActivity(Intent(this, SecondaryIconTabs::class.java))
    }
    fun onTextAndIconTabsPressed(){
        startActivity(Intent(this, TextAndIconTabs::class.java))
    }
    fun onLeadingIconPressed(){
        startActivity(Intent(this, LeadingIconTabs::class.java))
    }
    fun ScrollingPrimaryTextTabsPressed(){
        startActivity(Intent(this, ScrollinsPrimaryTextTab::class.java))
    }
    fun ScrollingSecondaryTextTabsPressed(){
        startActivity(Intent(this, ScrollingSecondaryTextTabs::class.java))
    }
    fun onFancyTabsPressed(){
        startActivity(Intent(this, FancyTabs::class.java))
    }
}