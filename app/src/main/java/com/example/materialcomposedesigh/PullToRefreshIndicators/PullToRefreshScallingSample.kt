package com.example.materialcomposedesigh.PullToRefreshIndicators

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.materialcomposedesigh.R

class PullToRefreshScallingSample : AppCompatActivity() {
    private lateinit var swipeRefreshLayout: SwipeRefreshLayout
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: YourAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pull_to_refresh_scalling_sample)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var itemList = (1..20).map { "Item $it" }
        swipeRefreshLayout = findViewById(R.id.swipeRefreshLayout1)
        recyclerView = findViewById(R.id.recyclerView12334)
        adapter = YourAdapter(itemList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        val button = findViewById<Button>(R.id.refreshButton1)
        button.setOnClickListener {
            swipeRefreshLayout.isRefreshing = true
            refreshData(itemList)
        }
        swipeRefreshLayout.setOnRefreshListener {
            refreshData(itemList)
        }
    }

    private fun refreshData(list: List<String>) {
        // Симуляция задержки для обновления данных
        adapter.updateData(emptyList())
        swipeRefreshLayout.isRefreshing = true
        Handler(Looper.getMainLooper()).postDelayed({
            val newData = list.shuffled()
            adapter.updateData(emptyList())
            adapter.updateData(newData)
            swipeRefreshLayout.isRefreshing = false
        }, 2000)
    }
}