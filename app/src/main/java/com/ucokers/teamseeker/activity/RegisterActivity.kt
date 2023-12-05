package com.ucokers.teamseeker.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ucokers.teamseeker.R
import com.ucokers.teamseeker.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signupbtn.setOnClickListener{
            var i = Intent(this, MenuActivity::class.java)
            startActivity(i)
        }

        binding.signintextbtn.setOnClickListener{
            var i = Intent(this, LoginActivity::class.java)
            startActivity(i)
        }
    }
}