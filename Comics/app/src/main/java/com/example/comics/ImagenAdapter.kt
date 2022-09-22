package com.example.comics

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ImagenAdapter (
    var objects: ArrayList<Int>):
    RecyclerView.Adapter<ImagenAdapter.ComicViewHolder>() {

    class ComicViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val img: ImageView
        init{
            img = itemView.findViewById(R.id.imageView)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComicViewHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.imagenes_comic_layout, parent, false)
        return ComicViewHolder(view)
    }

    override fun onBindViewHolder(holder: ComicViewHolder, position: Int) {
        val img = objects[position]
        holder.itemView.setBackgroundResource(img)
    }

    override fun getItemCount(): Int {
        return objects.size
    }
}