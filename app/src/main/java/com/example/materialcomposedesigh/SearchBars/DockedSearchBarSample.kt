package com.example.materialcomposedesigh.SearchBars

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.R
import com.google.android.material.search.SearchBar
import com.google.android.material.search.SearchView



class DockedSearchBarSample : AppCompatActivity() {
    private lateinit var searchBar: SearchBar
    private lateinit var searchView: SearchView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_docked_search_bar_sample)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        searchBar = findViewById(R.id.searchBar)
        searchView = findViewById(R.id.searchView)

        searchBar.setOnClickListener {
            searchView.show()
        }
    }
}