package com.example.api_json

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PerAdapter (val images:List<String>):RecyclerView.Adapter<PerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PerViewHolder {
        val layoutInflater= LayoutInflater.from(parent.context)
        return PerViewHolder(layoutInflater.inflate(R.layout.item_person, parent, false))
    }

    override fun onBindViewHolder(holder: PerViewHolder, position: Int) {
        val item = images[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = images.size
}