package com.example.materialcomposedesigh.Snackbars

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.materialcomposedesigh.R
import com.google.android.material.snackbar.Snackbar

class ScaffordWithIdefiniteSnackbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_scafford_with_idefinite_snackbar)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button = findViewById<Button?>(R.id.showSnackbarButton1)
        val rootLayout = findViewById<CoordinatorLayout?>(R.id.coordinates1)

        button.setOnClickListener(View.OnClickListener { v: View? ->
            Snackbar.make(rootLayout, "Это Snackbar", Snackbar.LENGTH_INDEFINITE)
                .setAction ("Отмена"){
                    v ->
                }
                .setAnchorView(findViewById<Button>(R.id.showSnackbarButton1))
                .show()
        })
    }
}