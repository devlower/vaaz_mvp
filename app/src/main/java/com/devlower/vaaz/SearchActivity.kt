package com.devlower.vaaz

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.SearchView
import android.widget.Toast
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
//            var intent = Intent(this, HomeActivity::class.java)
//            intent.putExtra("a", 123)
//            intent.putExtra("pranta", Plant("a", "", "", "", 0.00, 0.00))
//            startActivity(intent)
            finish()
        }

        val plantsAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, DataSource.allPlantsToArray()
        )

        binding?.plantList?.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, DataSource.allPlants.firstOrNull { it.name == DataSource.allPlantsToArray()[i] }.toString(), Toast.LENGTH_LONG).show()
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
}