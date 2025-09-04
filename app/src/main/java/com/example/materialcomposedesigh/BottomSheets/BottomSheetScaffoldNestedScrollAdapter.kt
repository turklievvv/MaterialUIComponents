package com.example.materialcomposedesigh.BottomSheets

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.materialcomposedesigh.R

class BottomSheetScaffoldNestedScrollAdapter(val list: List<Int>):
    RecyclerView.Adapter<BottomSheetScaffoldNestedScrollAdapter.BottomSheetViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BottomSheetViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(
        holder: BottomSheetViewHolder,
        position: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


    class BottomSheetViewHolder(bottomView:View): RecyclerView.ViewHolder(bottomView){
        val colorStolbik: View = bottomView.findViewById(R.id.colorCard)
    }
}