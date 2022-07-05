package com.example.api_json

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.api_json.databinding.ItemPersonBinding
import com.squareup.picasso.Picasso

class PerViewHolder (view:View):RecyclerView.ViewHolder(view) {
    private val binding = ItemPersonBinding.bind(view)

    fun bind (image:String)
    {
        Picasso.get().load(image).into(binding.ivperson)
        binding.ivperson
    }
}