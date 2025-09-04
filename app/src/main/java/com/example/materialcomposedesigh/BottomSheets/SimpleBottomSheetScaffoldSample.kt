package com.example.materialcomposedesigh.BottomSheets

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.BottomSheetsActivity
import com.example.materialcomposedesigh.R
import com.example.materialcomposedesigh.databinding.ActivitySimpleBottomSheetScaffoldSampleBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class SimpleBottomSheetScaffoldSample : AppCompatActivity() {
    private lateinit var bottomSheet: View
    private lateinit var bottomSheetBehavior: BottomSheetBehavior<View>
    private lateinit var buttonHide: Button
    lateinit var binding: ActivitySimpleBottomSheetScaffoldSampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySimpleBottomSheetScaffoldSampleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.coordinator) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        bottomSheet = binding.standardBottomSheet
        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)
        buttonHide = binding.buttonHideBottomSheet
        bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
        bottomSheetBehavior.peekHeight = (resources.displayMetrics.heightPixels * 0.17).toInt()
        bottomSheetBehavior.maxHeight = (resources.displayMetrics.heightPixels * 0.4).toInt()

        buttonHide.setOnClickListener {
            // Кнопка будет "сворачивать", но не убирать совсем
            bottomSheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED

        }
    }

}