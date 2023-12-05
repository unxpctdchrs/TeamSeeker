package com.ucokers.teamseeker.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ucokers.teamseeker.R
import com.ucokers.teamseeker.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.applicantbtn.setOnClickListener{
            var i = Intent(this, ApplicantCreationActivity::class.java)
            startActivity(i)
        }

        binding.recruiterbtn.setOnClickListener{
            var i = Intent(this, RecruiterCreationActivity::class.java)
            startActivity(i)
        }
    }
}