package com.example.fragmentsapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentsapp.R

class SimpleAdapter(val list: List<String>): RecyclerView.Adapter<SimpleAdapter.SimpleAdapterViewHolder>() {
    class SimpleAdapterViewHolder(item: View) : RecyclerView.ViewHolder(item){
        val textView: TextView = item.findViewById(R.id.textItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SimpleAdapterViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.simple_item_list, parent, false)
        return SimpleAdapterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: SimpleAdapterViewHolder, position: Int) {
        val item = list[position]
        holder.textView.text = item
    }
}