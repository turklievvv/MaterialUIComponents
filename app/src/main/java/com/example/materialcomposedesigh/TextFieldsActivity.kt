package com.example.materialcomposedesigh

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.materialcomposedesigh.Module.TextFieldItem
import com.example.materialcomposedesigh.databinding.ActivityTextFieldsBinding

class TextFieldsActivity : AppCompatActivity() {
    lateinit var binding: ActivityTextFieldsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityTextFieldsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val textFieldsList = mutableListOf<TextFieldItem>(
            TextFieldItem("SimpleTextFieldSample","Text fields examples"),
            TextFieldItem("TextFieldSample","Text fields examples"),
            TextFieldItem("SimpleOutlinedTextFieldSample","Text fields examples"),
            TextFieldItem("OutlinedTextFieldSample","Text fields examples"),
            TextFieldItem("TextFieldWithIcons","Text fields examples"),
            TextFieldItem("TextFieldWithPlaceHolder","Text fields examples"),
            TextFieldItem("TextFieldWithPrefixAndSuffix","Text fields examples"),
            TextFieldItem("TextFieldWithErrorState","Text fields examples"),
            TextFieldItem("TextFieldWithSupportingText","Text fields examples"),
            TextFieldItem("PasswordTextField","Text fields examples"),
            TextFieldItem("TextFieldWithHideKeyboardOnLmeAction","Text fields examples"),
            TextFieldItem("TextArea","Text fields examples"),

            )


        val recyclerView = binding.recyclerViewTextFiedls
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = TextFieldsAdapter(textFieldsList, this)
    }
}