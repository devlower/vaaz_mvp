package com.devlower.vaaz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class NotificationAdapter(
    private var items: List<Notification>
) : RecyclerView.Adapter<NotificationAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.notification_item, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]

        holder.bindView(item)
    }

    override fun getItemCount() = items.size

    class ViewHolder(notificationItem: View) : RecyclerView.ViewHolder(notificationItem) {
        fun bindView(item: Notification) = with(itemView) {
            val ivPlantImg = findViewById<ImageView>(R.id.iv_plant_img)
            val tvPlantName = findViewById<TextView>(R.id.tv_plant_name)
            val tvNotificationMessage = findViewById<TextView>(R.id.tv_notification_message)

            Glide.with(this).load(item.plant.linkImg).into(ivPlantImg)
            tvPlantName.text = item.plant.name
            tvNotificationMessage.text = item.message
        }
    }
}


