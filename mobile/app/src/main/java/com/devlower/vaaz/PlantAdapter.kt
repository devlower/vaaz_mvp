package com.devlower.vaaz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PlantAdapter(private var items: List<Plant>) :
    RecyclerView.Adapter<PlantAdapter.ViewHolder>() {

    var onItemClick: ((Plant) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.plant_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        holder.bindView(item)
        holder.itemView.setOnClickListener {
            onItemClick?.invoke(item)
        }
    }

    override fun getItemCount() = items.size

    class ViewHolder(plantItem: View) : RecyclerView.ViewHolder(plantItem) {
        fun bindView(item: Plant) = with(itemView) {
            val ivPlantImg = findViewById<ImageView>(R.id.iv_plant_img)
            val tvPlantName = findViewById<TextView>(R.id.tv_title)

            Glide.with(this).load(item.linkImg).into(ivPlantImg)

            tvPlantName.text = item.name
        }
    }
}
