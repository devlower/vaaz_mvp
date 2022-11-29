package com.devlower.vaaz

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}