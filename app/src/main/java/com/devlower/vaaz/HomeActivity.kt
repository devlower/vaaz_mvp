package com.devlower.vaaz

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.devlower.vaaz.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private var binding: ActivityHomeBinding? = null

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DataSource.allPlants.forEach {
            Log.i(TAG, it.name)
        }

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.icBackArrow?.setOnClickListener {
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding?.cardMyPlants?.setOnClickListener {
            var intent = Intent(this, MyPlantsActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}