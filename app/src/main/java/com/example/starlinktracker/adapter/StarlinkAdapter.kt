package com.example.starlinktracker.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.starlinktracker.R
import com.example.starlinktracker.retrofit.Results
import com.example.starlinktracker.retrofit.SateliteResults
import kotlinx.android.synthetic.main.item_starlink.view.*

class StarlinkAdapter : RecyclerView.Adapter<StarlinkAdapter.StarlinkViewHolder>() {

    inner class StarlinkViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    private val listDifferCallback = object : DiffUtil.ItemCallback<SateliteResults>() {
        override fun areItemsTheSame(oldItem: SateliteResults, newItem: SateliteResults): Boolean {
            return oldItem.sateliteId == newItem.sateliteId
        }

        override fun areContentsTheSame(oldItem: SateliteResults, newItem: SateliteResults): Boolean {
            val id = oldItem.sateliteId == newItem.sateliteId
            val name = oldItem.sateliteName == newItem.sateliteName
            val latitude = oldItem.latitude == newItem.longitude
            val longitude = oldItem.longitude == newItem.longitude

            return (id && name && latitude && longitude)
        }
    }
    
    val differList = AsyncListDiffer(this, listDifferCallback)

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
        holder.itemView.apply {
            starlink_id.text = starlinkObject.sateliteId.toString()
            starlink_name.text = starlinkObject.sateliteName
            starlink_latitude.text = starlinkObject.latitude.toString()
            starlink_longitude.text = starlinkObject.longitude.toString()
        }
    }

    override fun getItemCount() = differList.currentList.size


}