package com.example.comics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), ComicAdapter.ComicClickListener {

    private lateinit var lstComics: RecyclerView
    private lateinit var comics: ArrayList<Comic>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lstComics = findViewById(R.id.lstComics)
        setupListView()
    }

    private fun setupListView() {
        val nameComics = arrayOf(
            "Batman",
            "Watchmen",
            "Enigma",
            "Wonder Woman",
            "Generation X"
        )
        comics = arrayListOf<Comic>(
            Comic(1,"The Sandman", arrayListOf(R.drawable.sandmancover, R.drawable.sandmanuno, R.drawable.sandmandos, R.drawable.sandmantres, R.drawable.sandmancuatro, R.drawable.sandmancinco, R.drawable.sandmanseis, R.drawable.sandmansiete, R.drawable.sandmanocho)),
            Comic(2,"Batman",arrayListOf(R.drawable.batmancover, R.drawable.batman, R.drawable.batmanuno,R.drawable.batmandos, R.drawable.batmantres, R.drawable.batmancuatro, R.drawable.batmancinco, R.drawable.batmanseis, R.drawable.batmansiete, R.drawable.batmanocho)),
            Comic(3,"Maus",arrayListOf(R.drawable.mauscover, R.drawable.mausuno, R.drawable.mausdos, R.drawable.maustres, R.drawable.mauscuatro, R.drawable.mauscinco, R.drawable.mausseis, R.drawable.maussiete, R.drawable.mausocho)),
            Comic(4,"Joker",arrayListOf(R.drawable.jokercover, R.drawable.jokeruno, R.drawable.jokerdos, R.drawable.jokertres, R.drawable.jokercuatro, R.drawable.jokercinco, R.drawable.jokersiete, R.drawable.jokerocho)),
            Comic(5,"Star Wars",arrayListOf(R.drawable.stcover, R.drawable.stuno, R.drawable.stdos, R.drawable.sttres, R.drawable.stcuatro, R.drawable.stcinco, R.drawable.stseis, R.drawable.stsiete, R.drawable.stocho))
        )

        val adapter = ComicAdapter(comics, this)
        lstComics.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        lstComics.adapter = adapter
    }

    override fun onEditClick(comic: Comic) {
        val intent = Intent(this, MainActivity2:: class.java)
        intent.putExtra("historieta", comic)
        startActivity(intent)
    }
}