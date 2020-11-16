package com.example.starlinktracker.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
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
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: StarlinkViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}