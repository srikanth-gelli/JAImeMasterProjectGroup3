package com.example.jaimegroup3.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jaimegroup3.R

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    private var evTitle = arrayOf("Ev Title 1", "Ev title 2")
    private var uuid = arrayOf("uuid1", "uuid2")
    private var evDescription = arrayOf("This is an examplke of 1", "This is an example of 2")
    private var evDate = arrayOf("01.02.2022", "05.06.2001")


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemPOI.text = uuid[position]
        holder.itemDate.text = evDate[position]
        holder.itemEvTitle.text = evTitle[position]
        holder.itemEvDesc.text = evDescription[position]
    }

    override fun getItemCount(): Int {
        return evTitle.size
    }

    inner class ViewHolder(itemView:  View): RecyclerView.ViewHolder(itemView){
        var itemPOI: TextView
        var itemDate:TextView
        var itemEvTitle: TextView
        var itemEvDesc : TextView

        init{
            itemPOI = itemView.findViewById(R.id.poiName)
            itemDate = itemView.findViewById(R.id.date)
            itemEvTitle = itemView.findViewById(R.id.evTitle)
            itemEvDesc = itemView.findViewById(R.id.evDescription)
        }

    }


}