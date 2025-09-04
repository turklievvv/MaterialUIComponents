package com.example.materialcomposedesigh

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.materialcomposedesigh.IconButton.FilledIconButtonSample
import com.example.materialcomposedesigh.IconButton.FilledIconToggleButtonSample
import com.example.materialcomposedesigh.IconButton.FilledTonalIconButtonSample
import com.example.materialcomposedesigh.IconButton.FilledTonalIconToggleButtonSample
import com.example.materialcomposedesigh.IconButton.IconButtonSample
import com.example.materialcomposedesigh.IconButton.OutlinedIconButtonSample
import com.example.materialcomposedesigh.IconButton.OutlinedIconToggleButtonSample
import com.example.materialcomposedesigh.IconButton.TintedIconButtonSample
import com.example.materialcomposedesigh.IconButton.iconToggleButtonSample
import com.example.materialcomposedesigh.Module.TextFieldItem
import com.example.materialcomposedesigh.textFields.OutlinedTextFieldSample
import com.example.materialcomposedesigh.textFields.PasswordTextField
import com.example.materialcomposedesigh.textFields.SimpleOutlinedTextFieldSample
import com.example.materialcomposedesigh.textFields.SimpleTextFieldSample
import com.example.materialcomposedesigh.textFields.TextArea
import com.example.materialcomposedesigh.textFields.TextFieldSample
import com.example.materialcomposedesigh.textFields.TextFieldWithErrorState
import com.example.materialcomposedesigh.textFields.TextFieldWithIcons
import com.example.materialcomposedesigh.textFields.TextFieldWithPlaceHolder
import com.example.materialcomposedesigh.textFields.TextFieldWithPrefixAndSuffix
import com.example.materialcomposedesigh.textFields.TextFieldWithSupportingText
import kotlin.jvm.java

class TextFieldsAdapter(
    private val textFiledsList: List<TextFieldItem>, private val context: Context
) : RecyclerView.Adapter<TextFieldsAdapter.TextFieldsViewHolder>() {



    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): TextFieldsViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.icon_buttons_card, parent, false)
        return TextFieldsViewHolder(view)
    }


    override fun onBindViewHolder(
        holder: TextFieldsViewHolder, position: Int
    ) {
        val currentIconButton = textFiledsList[position]
        holder.titleText.text = currentIconButton.name
        holder.descriptionText.text = currentIconButton.descrpiion

        holder.itemView.setOnClickListener {
            when (currentIconButton.name) {
                "SimpleTextFieldSample" -> context.startActivity(
                    Intent(
                        context, SimpleTextFieldSample::class.java
                    )

                )

                "TextFieldSample" -> context.startActivity(
                    Intent(
                        context, TextFieldSample::class.java
                    )


                )

                "SimpleOutlinedTextFieldSample" -> context.startActivity(
                    Intent(
                        context, SimpleOutlinedTextFieldSample::class.java
                    )
                )

                "OutlinedTextFieldSample" -> context.startActivity(
                    Intent(
                        context, OutlinedTextFieldSample::class.java
                    )
                )

                "TextFieldWithIcons" -> context.startActivity(
                    Intent(
                        context, TextFieldWithIcons::class.java
                    )
                )

                "TextFieldWithPlaceHolder" -> context.startActivity(
                    Intent(
                        context, TextFieldWithPlaceHolder::class.java
                    )
                )

                "TextFieldWithPrefixAndSuffix" -> context.startActivity(
                    Intent(
                        context, TextFieldWithPrefixAndSuffix::class.java
                    )
                )

                "TextFieldWithErrorState" -> context.startActivity(
                    Intent(
                        context, TextFieldWithErrorState::class.java
                    )
                )

                "TextFieldWithSupportingText" -> context.startActivity(
                    Intent(
                        context, TextFieldWithSupportingText::class.java
                    )
                )
                "PasswordTextField" -> context.startActivity(
                    Intent(
                        context, PasswordTextField::class.java
                    )
                )
                "TextFieldWithHideKeyboardOnLmeAction" -> context.startActivity(
                    Intent(
                        context, TextFieldSample::class.java
                    )
                )
                "TextArea" -> context.startActivity(
                    Intent(
                        context, TextArea::class.java
                    )
                )
            }


        }
    }

    override fun getItemCount(): Int {
        return textFiledsList.size
    }


    class TextFieldsViewHolder(textFieldsView: View) : RecyclerView.ViewHolder(textFieldsView) {
        val titleText: TextView = textFieldsView.findViewById(R.id.titleTextIconButtons)
        val descriptionText: TextView = textFieldsView.findViewById(R.id.descriptionTextIconButtons)
    }
}