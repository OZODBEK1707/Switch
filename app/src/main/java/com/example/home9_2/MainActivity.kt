package com.example.home9_2

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.home9_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    private lateinit var preferences: SharedPreferences
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        preferences=getSharedPreferences("homework9_2", Context.MODE_PRIVATE)
        if (preferences.getBoolean("state",false)){
            binding.layout.setBackgroundColor(Color.GREEN)
        }else{
            binding.layout.setBackgroundColor(Color.YELLOW)
        }
        binding.btn1.setOnClickListener() {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }

    @SuppressLint("ResourceAsColor")
    override fun onResume() {
        super.onResume()
        preferences=getSharedPreferences("homework9_2", Context.MODE_PRIVATE)
        if (preferences.getBoolean("state",false)){
            binding.layout.setBackgroundColor(Color.BLUE)
        }else{
            binding.layout.setBackgroundColor(Color.YELLOW)
        }
    }
}