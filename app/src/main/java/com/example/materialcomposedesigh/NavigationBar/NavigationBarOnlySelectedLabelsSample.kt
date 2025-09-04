package com.example.materialcomposedesigh.NavigationBar

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.R
import com.example.materialcomposedesigh.databinding.ActivityNavigationBarBinding
import com.example.materialcomposedesigh.databinding.ActivityNavigationBarOnlySelectedLabelsSampleBinding
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView

class NavigationBarOnlySelectedLabelsSample : AppCompatActivity() {
    lateinit var binding: ActivityNavigationBarOnlySelectedLabelsSampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityNavigationBarOnlySelectedLabelsSampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

    val bottomNav = binding.bottomNav

    @SuppressLint("RestrictedApi")
    fun updateMenuLabels(selectedId: Int) {
        val menu = bottomNav.menu
        for (i in 0 until menu.size()) {
            val menuItem = menu.getItem(i)
            // Здесь мы используем reflection, чтобы скрыть подписи у невыбранных
            val menuView = bottomNav.getChildAt(0) as BottomNavigationMenuView
            val itemView = menuView.getChildAt(i) as BottomNavigationItemView
            itemView.setShifting(false) // отключаем сдвиг, чтобы текст не прыгал
            itemView.setChecked(menuItem.itemId == selectedId)

            // Скрыть текст, если не выбран
            val smallLabel =
                itemView.findViewById<View>(com.google.android.material.R.id.navigation_bar_item_small_label_view)
            val largeLabel =
                itemView.findViewById<View>(com.google.android.material.R.id.navigation_bar_item_large_label_view)
            if (menuItem.itemId == selectedId) {
                smallLabel?.visibility = View.VISIBLE
                largeLabel?.visibility = View.VISIBLE
            } else {
                smallLabel?.visibility = View.INVISIBLE
                largeLabel?.visibility = View.INVISIBLE
            }
        }
        bottomNav.setOnItemSelectedListener { item ->
            updateMenuLabels(item.itemId)
            true

        }

// Инициализация
        updateMenuLabels(bottomNav.selectedItemId)
    }
}


