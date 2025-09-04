package com.example.materialcomposedesigh

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.materialcomposedesigh.CheckBoxAdapter.CheckBoxViewHolder
import com.example.materialcomposedesigh.CheckBoxes.CheckBoxSample
import com.example.materialcomposedesigh.CheckBoxes.CheckBoxWithTextSample
import com.example.materialcomposedesigh.CheckBoxes.TriStateCheckBoxSample
import com.example.materialcomposedesigh.IconButton.FilledIconButtonSample
import com.example.materialcomposedesigh.IconButton.FilledIconToggleButtonSample
import com.example.materialcomposedesigh.IconButton.FilledTonalIconButtonSample
import com.example.materialcomposedesigh.IconButton.FilledTonalIconToggleButtonSample
import com.example.materialcomposedesigh.IconButton.IconButtonSample
import com.example.materialcomposedesigh.IconButton.OutlinedIconButtonSample
import com.example.materialcomposedesigh.IconButton.OutlinedIconToggleButtonSample
import com.example.materialcomposedesigh.IconButton.TintedIconButtonSample
import com.example.materialcomposedesigh.IconButton.iconToggleButtonSample
import com.example.materialcomposedesigh.Module.IconButtonsItem
import kotlin.jvm.java

class IconButtonsAdapter(private val iconButtonsList: List<IconButtonsItem>, private val context: Context):
    RecyclerView.Adapter<IconButtonsAdapter.IconButtonsViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): IconButtonsViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.icon_buttons_card, parent, false)
        return IconButtonsViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: IconButtonsViewHolder,
        position: Int
    ) {
        val currentIconButton = iconButtonsList[position]
        holder.titleText.text = currentIconButton.title
        holder.descriptionText.text = currentIconButton.description

        holder.itemView.setOnClickListener {
            when (currentIconButton.title) {
                "IconButtonSample" -> context.startActivity(
                    Intent(
                        context,
                        IconButtonSample::class.java
                    )

                )
                "IconToggleButtonSample" -> context.startActivity(
                    Intent(
                        context,
                        iconToggleButtonSample::class.java
                    )



                )
                "TintedIconButtonSample" -> context.startActivity(
                    Intent(
                        context,
                        TintedIconButtonSample::class.java
                    )
                )
                "FilledIconButtonSample" -> context.startActivity(
                    Intent(
                        context,
                        FilledIconButtonSample::class.java
                    )
                )
                "FilledToggleButtonSample" -> context.startActivity(
                    Intent(
                        context,
                        FilledIconToggleButtonSample::class.java
                    )
                )
                "FilledTonalIconButtonSample" -> context.startActivity(
                    Intent(
                        context,
                        FilledTonalIconButtonSample::class.java
                    )
                )
                "FilledTonalIconToggleButtonSample" -> context.startActivity(
                    Intent(
                        context,
                        FilledTonalIconToggleButtonSample::class.java
                    )
                )

                "OutlinedIconButtonSample" -> context.startActivity(
                    Intent(
                        context,
                        OutlinedIconButtonSample::class.java
                    )
                )
                "OutlinedIconToggleButtonSample" -> context.startActivity(
                    Intent(
                        context,
                        OutlinedIconToggleButtonSample::class.java
                    )
                )




            }
        }
    }

    override fun getItemCount(): Int {
        return iconButtonsList.size
    }


    class IconButtonsViewHolder(IconButtonsView: View) : RecyclerView.ViewHolder(IconButtonsView){
        val titleText: TextView = IconButtonsView.findViewById(R.id.titleTextIconButtons)
        val descriptionText: TextView = IconButtonsView.findViewById(R.id.descriptionTextIconButtons)
    }
}