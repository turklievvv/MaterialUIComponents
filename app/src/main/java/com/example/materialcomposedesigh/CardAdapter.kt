package com.example.materialcomposedesigh

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.materialcomposedesigh.Module.CardItem
import com.example.materialcomposedesigh.NavigationBarActivity

class CardAdapter(
    private val items: List<CardItem>, private val context: Context
) : RecyclerView.Adapter<CardAdapter.CardViewHolder>() {


    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val iconImage: ImageView = itemView.findViewById(R.id.iconImage)
        val titleText: TextView = itemView.findViewById(R.id.titleText)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: CardViewHolder,
        position: Int
    ) {
        val currentItem = items[position]
        holder.iconImage.setImageResource(currentItem.iconResId)
        holder.titleText.text = currentItem.name

        holder.itemView.setOnClickListener {
            when (currentItem.name) {
                "Buttons" -> context.startActivity(Intent(context, ButtonsActivity::class.java))
                "CheckBox" -> context.startActivity(Intent(context, CheckBoxActivity::class.java))
                "Switches" -> context.startActivity(Intent(context, SwtichesActivity::class.java))
                "RadioButtons" -> context.startActivity(
                    Intent(
                        context,
                        RadioButtonsActivity::class.java
                    )
                )

                "IconButtons" -> context.startActivity(Intent(context, IconButtons::class.java))
                "Navigation Bar" -> context.startActivity(
                    Intent(
                        context,
                        NavigationBarActivity::class.java
                    )
                )

                "Chips" -> context.startActivity(Intent(context, ChipsActivity::class.java))
                "Segmented Buttons" -> context.startActivity(
                    Intent(
                        context,
                        SegmentedButtonsActivity::class.java
                    )
                )

                "Date Pickers" -> context.startActivity(
                    Intent(
                        context,
                        DatePickersActivity::class.java
                    )
                )

                "Time Picker" -> context.startActivity(
                    Intent(
                        context,
                        TimePickerActivity::class.java
                    )
                )

                "Search Bar" -> context.startActivity(Intent(context, SearchActivity::class.java))
                "Progress Indicator" -> context.startActivity(
                    Intent(
                        context,
                        ProgressIndicatorsActivity::class.java
                    )
                )

                "Text Fields" -> context.startActivity(
                    Intent(
                        context,
                        TextFieldsActivity::class.java
                    )
                )

                "Snackbars" -> context.startActivity(Intent(context, SnackBarsActivity::class.java))
                "Extended FAB" -> context.startActivity(
                    Intent(
                        context,
                        ExtendedFABActivity::class.java
                    )
                )

                "Bottom Sheet" -> context.startActivity(
                    Intent(
                        context,
                        BottomSheetsActivity::class.java
                    )
                )
                "Dialogs"-> context.startActivity(Intent(context, DialogsActivity::class.java))
                "Menus"->context.startActivity(Intent(context, MenusActivity::class.java))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }


}
