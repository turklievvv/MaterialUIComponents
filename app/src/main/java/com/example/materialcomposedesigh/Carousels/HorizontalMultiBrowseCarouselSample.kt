package com.example.materialcomposedesigh.Carousels

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.materialcomposedesigh.R

import com.example.materialcomposedesigh.databinding.ActivityHorizontalMultiBrowseCarouselSampleBinding
import com.google.android.material.carousel.CarouselLayoutManager
import com.google.android.material.carousel.CarouselSnapHelper
import com.google.android.material.carousel.MultiBrowseCarouselStrategy

class HorizontalMultiBrowseCarouselSample : AppCompatActivity() {
    private lateinit var imageList: List<Int>
    lateinit var binding: ActivityHorizontalMultiBrowseCarouselSampleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityHorizontalMultiBrowseCarouselSampleBinding.inflate(layoutInflater)
        setContentView(binding.root)
        imageList = listOf(R.drawable.photo1, R.drawable.photo2, R.drawable.photo3,R.drawable.photo4,R.drawable.photo1, R.drawable.photo2, R.drawable.photo3,R.drawable.photo4 /* … */)

        val rv = findViewById<RecyclerView>(R.id.carousel_recycler_view)
        val layoutManager = CarouselLayoutManager().apply {
            setCarouselStrategy(MultiBrowseCarouselStrategy())
            setCarouselAlignment(CarouselLayoutManager.ALIGNMENT_CENTER)
        }

        rv.layoutManager = layoutManager

        val snapHelper = CarouselSnapHelper()
        snapHelper.attachToRecyclerView(rv)

        rv.adapter = object : RecyclerView.Adapter<ImageViewHolder>() {
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_carousel_image, parent, false)
                return ImageViewHolder(view)
            }

            override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
                // загрузка картинки
                holder.imageView.setImageResource(imageList[position])
                // или Glide/Coil для URL
            }

            override fun getItemCount() = imageList.size
        }
    }

}
class ImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView = itemView.findViewById(R.id.carousel_image_view)
}
