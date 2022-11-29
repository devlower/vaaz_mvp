package com.devlower.vaaz

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity
import com.devlower.vaaz.databinding.ActivitySearchBinding


class SearchActivity : AppCompatActivity() {
    private var binding: ActivitySearchBinding? = null

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.icBackArrow?.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val plantsAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, DataSource.allPlantsToArray()
        )

        binding?.plantList?.setOnItemClickListener { _, _, i, _ ->
            val intent = Intent(this, PlantDetailsActivity::class.java)

            intent.putExtra("plant", DataSource.allPlants[i])

            startActivity(intent)
        }
        binding?.plantList?.adapter = plantsAdapter

        binding?.svSearch?.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                binding?.svSearch?.clearFocus()
                if (DataSource.allPlantsToArray().contains(query)) {
                    plantsAdapter.filter.filter(query)
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                plantsAdapter.filter.filter(newText)
                return false
            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}