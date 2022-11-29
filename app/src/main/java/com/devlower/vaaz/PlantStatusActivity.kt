package com.devlower.vaaz

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.devlower.vaaz.databinding.ActivityPlantStatusBinding

class PlantStatusActivity : AppCompatActivity() {
    private var binding: ActivityPlantStatusBinding? = null

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPlantStatusBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val plant = intent.getSerializableExtra("plant") as Plant

        val tvPlantName: TextView = findViewById(R.id.tv_plant_name)
        val ivPlantImg: ImageView = findViewById(R.id.iv_plant_img)

        tvPlantName.text = plant.name
        Glide.with(this).load(plant.linkImg).into(ivPlantImg)

        binding?.icBackArrow?.setOnClickListener {
            val intent = Intent(this, MyPlantsActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}