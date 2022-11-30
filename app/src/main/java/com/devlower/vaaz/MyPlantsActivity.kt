package com.devlower.vaaz

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.devlower.vaaz.databinding.ActivityMyPlantsBinding

class MyPlantsActivity : AppCompatActivity() {
    private var binding: ActivityMyPlantsBinding? = null

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMyPlantsBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.icBackArrow?.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        if (DataSource.plants.isNotEmpty()) {
            val tvNoPlants = findViewById<TextView>(R.id.tv_no_plants)
            tvNoPlants.visibility = View.GONE
            val ivNoPlants = findViewById<ImageView>(R.id.iv_no_plants)
            ivNoPlants.visibility = View.GONE

            val recyclerView = findViewById<RecyclerView>(R.id.rv_plant_cards)
            recyclerView.visibility = View.VISIBLE
            val layoutManager = GridLayoutManager(this, 3)

            val adapter = PlantAdapter(DataSource.plants)
            recyclerView.adapter = adapter
            adapter.onItemClick = {
                val intent = Intent(this, PlantStatusActivity::class.java)
                intent.putExtra("plant", it)
                startActivity(intent)
            }
            recyclerView.layoutManager = layoutManager
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}