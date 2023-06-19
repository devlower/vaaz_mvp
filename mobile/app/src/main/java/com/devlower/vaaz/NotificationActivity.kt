package com.devlower.vaaz

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.devlower.vaaz.databinding.ActivityNotificationBinding

class NotificationActivity : AppCompatActivity() {
    private var binding: ActivityNotificationBinding? = null

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNotificationBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.icBackArrow?.setOnClickListener {
            finish()
        }

        if (DataSource.allNotifications.isNotEmpty()) {
            val tvNoNotifications = findViewById<TextView>(R.id.tv_no_notifications)
            val ivNoNotifications = findViewById<ImageView>(R.id.iv_no_notifications)
            tvNoNotifications.visibility = View.GONE
            ivNoNotifications.visibility = View.GONE

            val recyclerView = findViewById<RecyclerView>(R.id.rv_notification_cards)
            recyclerView.visibility = View.VISIBLE
            val layoutManager = LinearLayoutManager(this)
            val adapter = NotificationAdapter(DataSource.allNotifications)

            recyclerView.adapter = adapter
            recyclerView.layoutManager = layoutManager
        }
    }
}