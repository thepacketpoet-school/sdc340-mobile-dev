package com.example.photogallery

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

//Haley Archer
//Photo Gallery Performance Assessment
//02/23/2026

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setIcon(R.mipmap.ic_launcher)
        
        val imgLarge = findViewById<ImageView>(R.id.imgLarge)
        val photos = listOf(R.drawable.photo1, R.drawable.photo2, R.drawable.photo3,
                           R.drawable.photo4, R.drawable.photo5, R.drawable.photo6)
        val thumbs = listOf(R.id.img1, R.id.img2, R.id.img3, R.id.img4, R.id.img5, R.id.img6)
        
        thumbs.forEachIndexed { index, id ->
            findViewById<ImageView>(id).setOnClickListener {
                imgLarge.setImageResource(photos[index])
                imgLarge.visibility = View.VISIBLE
            }
        }
        
        imgLarge.setOnClickListener {
            imgLarge.visibility = View.GONE
        }
    }
}
