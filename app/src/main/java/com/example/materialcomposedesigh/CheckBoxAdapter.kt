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
import com.example.materialcomposedesigh.CheckBoxes.CheckBoxSample
import com.example.materialcomposedesigh.CheckBoxes.CheckBoxWithTextSample
import com.example.materialcomposedesigh.CheckBoxes.TriStateCheckBoxSample
import com.example.materialcomposedesigh.Module.CheckBoxItem

class CheckBoxAdapter(private val checkBoxList: List<CheckBoxItem>, private val context: Context) :
    RecyclerView.Adapter<CheckBoxAdapter.CheckBoxViewHolder>() {


    class CheckBoxViewHolder(checkBoxView: View) : RecyclerView.ViewHolder(checkBoxView) {
        val titleCheckBox: TextView = checkBoxView.findViewById(R.id.nameCheckBoxInRecyclerView)
        val descriptionText: TextView =
            checkBoxView.findViewById(R.id.checkBoxDescriptionInRecyclerView)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CheckBoxViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.checkbox_card, parent, false)
        return CheckBoxViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: CheckBoxViewHolder,
        position: Int
    ) {
        val currentCheckBox = checkBoxList[position]
        holder.titleCheckBox.text = currentCheckBox.title
        holder.descriptionText.text = currentCheckBox.description

        holder.itemView.setOnClickListener {
            when (currentCheckBox.title) {
                "CheckBoxSample" -> context.startActivity(
                    Intent(
                        context,
                        CheckBoxSample::class.java
                    )

                )
                "CheckBoxWithTextSample" -> context.startActivity(
                    Intent(
                        context,
                        CheckBoxWithTextSample::class.java
                    )



                )
                "TriStateCheckBoxSample" -> context.startActivity(
                    Intent(
                        context,
                        TriStateCheckBoxSample::class.java
                    )



                )


            }
        }
    }

    override fun getItemCount(): Int {
        return checkBoxList.size
    }

}

