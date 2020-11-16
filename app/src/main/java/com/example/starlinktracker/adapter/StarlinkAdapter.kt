package com.example.starlinktracker.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.starlinktracker.R
import com.example.starlinktracker.retrofit.Results

class StarlinkAdapter : RecyclerView.Adapter<StarlinkAdapter.StarlinkViewHolder>() {

    inner class StarlinkViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    val differList = AsyncListDiffer(this, listDifferCallback)

    private val listDifferCallback = object : DiffUtil.ItemCallback<Results>() {
        override fun areItemsTheSame(oldItem: Results, newItem: Results): Boolean {
            //no results yet
        }

        override fun areContentsTheSame(oldItem: Results, newItem: Results): Boolean {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StarlinkViewHolder {
        return StarlinkViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_starlink,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: StarlinkViewHolder, position: Int) {
        val starlinkObject = differList.currentList[position]
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}