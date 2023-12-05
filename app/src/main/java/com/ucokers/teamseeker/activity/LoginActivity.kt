package com.ucokers.teamseeker.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ucokers.teamseeker.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding : ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signinbtn.setOnClickListener{
            var i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

        binding.signuptextbtn.setOnClickListener{
            var i = Intent(this, RegisterActivity::class.java)
            startActivity(i)
        }
    }
}