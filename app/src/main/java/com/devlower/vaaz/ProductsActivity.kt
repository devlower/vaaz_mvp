package com.devlower.vaaz

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.devlower.vaaz.databinding.ActivityProductsBinding

class ProductsActivity : AppCompatActivity() {
    private var binding: ActivityProductsBinding? = null

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityProductsBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.icBackArrow?.setOnClickListener {
            finish()
        }

        val recyclerView = findViewById<RecyclerView>(R.id.rv_product_cards)
        val layoutManager = LinearLayoutManager(this)

        val adapter = ProductAdapter(DataSourceProducts.allProducts)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = layoutManager
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}