package com.devlower.vaaz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devlower.vaaz.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private var binding: ActivitySignUpBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.icBackArrow?.setOnClickListener {
            var intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding?.tvSkip?.setOnClickListener {
            intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        binding?.tvSignUp?.setOnClickListener {
            intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}