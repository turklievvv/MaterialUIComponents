package com.example.materialcomposedesigh.BottomSheets

import MyBottomSheetFragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.materialcomposedesigh.R
import com.example.materialcomposedesigh.databinding.ActivityBottomSheetsBinding
import com.example.materialcomposedesigh.databinding.ActivityModalBottomSheetSampleBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class ModalBottomSheetSample : AppCompatActivity() {
    lateinit var binding: ActivityModalBottomSheetSampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityModalBottomSheetSampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }



        binding.buttonShowBottomSheet.setOnClickListener {
            val bottomSheet = MyBottomSheetFragment.newInstance(binding.checkboxSkipPartiallyExpanded.isChecked)
            bottomSheet.show(supportFragmentManager, "MyBottomSheet")        }
    }


}
