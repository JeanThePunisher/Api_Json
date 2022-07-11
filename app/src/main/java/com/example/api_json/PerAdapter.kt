package com.example.api_json

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_list_item.view.*

class PerAdapter:RecyclerView.Adapter<PerAdapter.PerViewHolder>() {
    private var repos:List<PersonResponse> = emptyList()

    fun setNameList (repos: List<PersonResponse>)
    {
        this.repos = repos
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType:Int):PerViewHolder {
        return PerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.activity_list_item,parent, false))
    }

    override fun onBindViewHolder(holder: PerViewHolder, position: Int) {
        val repo = repos[position]
        holder.itemView.idTextView.text = repo.id.toString()
        holder.itemView.nameTextView.text = repo.name
        holder.itemView.nameTextView1.text = repo.email
        holder.itemView.nameTextView2.text = repo.gender
        holder.itemView.nameTextView3.text = repo.status
    }

    override fun getItemCount(): Int {
        return repos.size
    }
    class PerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}