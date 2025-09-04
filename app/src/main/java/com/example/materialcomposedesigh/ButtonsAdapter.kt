package com.example.materialcomposedesigh

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.materialcomposedesigh.Buttons.ElevatedButtonSample
import com.example.materialcomposedesigh.Buttons.FilledTonalButton
import com.example.materialcomposedesigh.Buttons.OutlinedButton
import com.example.materialcomposedesigh.Buttons.SampleButton
import com.example.materialcomposedesigh.Buttons.TextButtonSample
import com.example.materialcomposedesigh.Buttons.TextWithIcon
import com.example.materialcomposedesigh.Module.ButtonsItem

class ButtonsAdapter(private val buttons: MutableList<ButtonsItem>, private val context: Context) :
    RecyclerView.Adapter<ButtonsAdapter.ButtonsViewHolder>() {

    class ButtonsViewHolder(buttonsView: View) : RecyclerView.ViewHolder(buttonsView) {
        val buttonsName: TextView = buttonsView.findViewById(R.id.nameButtonInRecyclerView)
        val buttonsDescription: TextView =
            buttonsView.findViewById(R.id.buttonDescriptionInRecyclerView)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ButtonsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.buttons_card, parent, false)
        return ButtonsViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ButtonsViewHolder,
        position: Int
    ) {
        val currentButton = buttons[position]
        holder.buttonsName.text = currentButton.nameButton
        holder.buttonsDescription.text = currentButton.descrpitionButton

        holder.itemView.setOnClickListener {
            when (currentButton.nameButton) {
                "ButtonSample" -> context.startActivity(
                    Intent(
                        context,
                        SampleButton::class.java
                    )

                )
                "ElevatedButtonSample" -> context.startActivity(
                    Intent(
                        context, ElevatedButtonSample::class.java
                    )
                )
                "FilledTonalButton" -> context.startActivity(
                    Intent(
                        context, FilledTonalButton::class.java
                    )
                )
                "OutlinedButtonSample" -> context.startActivity(
                    Intent(
                        context, OutlinedButton::class.java
                    )
                )

                    "TextButtonSample" -> context.startActivity(
                Intent(
                    context, TextButtonSample::class.java
                )
            )
                "ButtonWithIconSample" -> context.startActivity(
                    Intent(
                        context, TextWithIcon::class.java
                    )
                )

            }
        }
    }

    override fun getItemCount(): Int {
        return buttons.size
    }


}