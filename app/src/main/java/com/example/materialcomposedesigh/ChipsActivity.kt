package com.example.materialcomposedesigh

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.materialcomposedesigh.Module.ChipsItem
import com.example.materialcomposedesigh.databinding.ActivityChipsBinding

class ChipsActivity : AppCompatActivity() {
    lateinit var binding: ActivityChipsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityChipsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val chipsList = mutableListOf<ChipsItem>(
            ChipsItem("AssistChipSample", "Chips example"),
            ChipsItem("ElevatedAssistChipSample", "Chips example"),
            ChipsItem("FilterChipSample", "Chips example"),
            ChipsItem("ElevatedFilterChipSample", "Chips example"),
            ChipsItem("FilterChipWithLeadingIconSample", "Chips example"),
            ChipsItem("InputChipSample", "Chips example"),
            ChipsItem("InputChipWithAvatarSample", "Chips example"),
            ChipsItem("SuggestionChipSample", "Chips example"),
            ChipsItem("ElevatedSuggestionChipSample", "Chips example"),
            ChipsItem("ChipGroupSingleLineSample", "Chips example"),
            ChipsItem("ChipGroupReflowSample", "Chips example")
        )

        val recyclerView = binding.recyclerViewChips
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ChipsAdapter(chipsList,this)
    }
}