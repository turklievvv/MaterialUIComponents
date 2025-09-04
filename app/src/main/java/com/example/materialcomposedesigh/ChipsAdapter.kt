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
import com.example.materialcomposedesigh.Chipses.AssistChipSample
import com.example.materialcomposedesigh.Chipses.ChipGroupReflowSample
import com.example.materialcomposedesigh.Chipses.ChipGroupSingleLineSample
import com.example.materialcomposedesigh.Chipses.ElevatedAssistChipSample
import com.example.materialcomposedesigh.Chipses.ElevatedFilterChipSample
import com.example.materialcomposedesigh.Chipses.ElevatedSuggestionChipSample
import com.example.materialcomposedesigh.Chipses.FilterChipSample
import com.example.materialcomposedesigh.Chipses.FilterChipWithLeadingIconSample
import com.example.materialcomposedesigh.Chipses.InputChipSample
import com.example.materialcomposedesigh.Chipses.InputChipWithAvatarSample
import com.example.materialcomposedesigh.Chipses.SuggestionChipSample
import com.example.materialcomposedesigh.Module.ChipsItem

class ChipsAdapter(val chipList: List<ChipsItem>, val context: Context) :
    RecyclerView.Adapter<ChipsAdapter.ChipViewHolder>() {

    class ChipViewHolder(chipsView: View) : RecyclerView.ViewHolder(chipsView) {
        val titleCheckBox: TextView = chipsView.findViewById(R.id.nameChipsInRecyclerView)
        val descriptionText: TextView =
            chipsView.findViewById(R.id.chipsDescriptionInRecyclerView)
    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ChipViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.chips_card, parent, false)
        return ChipViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ChipViewHolder,
        position: Int
    ) {
        val currentChip = chipList[position]
        holder.titleCheckBox.text = currentChip.chipName
        holder.descriptionText.text = currentChip.chipDescrip

        holder.itemView.setOnClickListener {
            when (currentChip.chipName) {
                "AssistChipSample" -> context.startActivity(
                    Intent(
                        context,
                        AssistChipSample::class.java
                    )

                )

                "ElevatedAssistChipSample" -> context.startActivity(
                    Intent(
                        context,
                        ElevatedAssistChipSample::class.java
                    )


                )

                "FilterChipSample" -> context.startActivity(
                    Intent(
                        context,
                        FilterChipSample::class.java
                    )
                )
                "ElevatedFilterChipSample" -> context.startActivity(
                    Intent(
                        context,
                        ElevatedFilterChipSample::class.java
                    )
                )
                "FilterChipWithLeadingIconSample" -> context.startActivity(
                    Intent(
                        context,
                        FilterChipWithLeadingIconSample::class.java
                    )
                )
                "InputChipSample" -> context.startActivity(
                    Intent(
                        context,
                        InputChipSample::class.java
                    )
                )
                "InputChipWithAvatarSample" -> context.startActivity(
                    Intent(
                        context,
                        InputChipWithAvatarSample::class.java
                    )
                )
                "SuggestionChipSample" -> context.startActivity(
                    Intent(
                        context,
                        SuggestionChipSample::class.java
                    )
                )
                "ElevatedSuggestionChipSample" -> context.startActivity(
                    Intent(
                        context,
                        ElevatedSuggestionChipSample::class.java
                    )
                )
                "ChipGroupSingleLineSample" -> context.startActivity(
                    Intent(
                        context,
                        ChipGroupSingleLineSample::class.java
                    )
                )
                "ChipGroupReflowSample" -> context.startActivity(
                    Intent(
                        context,
                        ChipGroupReflowSample::class.java
                    )
                )
            }
        }
    }

    override fun getItemCount(): Int {
        return chipList.size
    }


}