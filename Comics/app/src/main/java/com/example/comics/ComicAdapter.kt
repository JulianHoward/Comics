package com.example.comics

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ComicAdapter(
    var objects: ArrayList<Comic>,
    val listener: ComicClickListener) :
    RecyclerView.Adapter<ComicAdapter.ComicViewHolder>() {

    class ComicViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val comicName: TextView
        val btnGo: Button
        init{
            comicName = itemView.findViewById(R.id.txtName)
            btnGo = itemView.findViewById(R.id.btnIr)
        }
    }

    interface ComicClickListener {
        fun onEditClick(comic: Comic)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComicViewHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.comic_item_layout, parent, false)
        return ComicViewHolder(view)
    }

    override fun onBindViewHolder(holder: ComicViewHolder, position: Int) {
        val comic = objects[position]
        holder.comicName.text = comic.nombre
        holder.btnGo.setOnClickListener { listener.onEditClick(comic) }
    }

    override fun getItemCount(): Int {
        return objects.size
    }
}