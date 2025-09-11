package com.example.materialcomposedesigh

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.Lists.OneLineListItem
import com.example.materialcomposedesigh.Lists.ThreeLineListItemWithExtendedSupporting
import com.example.materialcomposedesigh.Lists.ThreeLineListItemWithOverlineAndSupporting
import com.example.materialcomposedesigh.Lists.TwoLineListItem
import com.example.materialcomposedesigh.databinding.ActivityListsBinding

class ListsActivity : AppCompatActivity() {
    lateinit var binding: ActivityListsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityListsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.OneLineListItem.setOnClickListener { onOneLinePressed() }
        binding.TwoListItem.setOnClickListener { onTwoLinePressed() }
        binding.ThreeLineListItemWithOverlineAndSupporting.setOnClickListener { onThreeLinePressed() }
        binding.ThreeLineListWithExtendedSupporting.setOnClickListener { onThreeExtendedLinePressed() }
    }
    private fun onOneLinePressed(){
        startActivity(Intent(this, OneLineListItem::class.java))
    }
    private fun onTwoLinePressed(){
        startActivity(Intent(this, TwoLineListItem::class.java))
    }
    private fun onThreeLinePressed(){
        startActivity(Intent(this, ThreeLineListItemWithOverlineAndSupporting::class.java))

    }
    private fun onThreeExtendedLinePressed(){
        startActivity(Intent(this, ThreeLineListItemWithExtendedSupporting::class.java))
    }
}