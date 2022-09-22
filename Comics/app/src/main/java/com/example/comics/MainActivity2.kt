package com.example.comics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity2 : AppCompatActivity() {

    lateinit var comic: Comic
    lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        viewPager = findViewById(R.id.viewPager)
        comic = intent.getSerializableExtra("historieta") as Comic

        viewPager.adapter = ImagenAdapter(comic.listaFotos)
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
    }
}