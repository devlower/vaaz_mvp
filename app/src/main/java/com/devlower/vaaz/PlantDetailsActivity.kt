package com.devlower.vaaz

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.devlower.vaaz.databinding.ActivityPlantDetailsBinding

class PlantDetailsActivity : AppCompatActivity() {
    private var binding: ActivityPlantDetailsBinding? = null

    @SuppressLint("ClickableViewAccessibility", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlantDetailsBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        
        val plant = intent.getSerializableExtra("plant") as Plant

        val tvPlantName: TextView = findViewById(R.id.tv_plant_name)
        val tvPlantDescription: TextView = findViewById(R.id.tv_plant_description)
        val ivPlantImg: ImageView = findViewById(R.id.iv_plant_img)

        tvPlantName.text = plant.name + " (" + plant.sciName + ")"
        tvPlantDescription.text = plant.description

        Glide.with(this).load(plant.linkImg).into(ivPlantImg)

        binding?.icBackArrow?.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }
    }
}