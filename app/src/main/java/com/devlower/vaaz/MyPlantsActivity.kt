package com.devlower.vaaz

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
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

        val plant = intent.getSerializableExtra("plant") as Plant
        
        SplashActivity.plants += plant

        val recyclerView = findViewById<RecyclerView>(R.id.rv_plant_cards)
        val layoutManager = GridLayoutManager(this, 3)

        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = PlantAdapter(SplashActivity.plants)
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}