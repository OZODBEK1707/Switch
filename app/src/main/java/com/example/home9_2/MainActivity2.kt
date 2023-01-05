package com.example.home9_2

import android.content.Context
import android.content.SharedPreferences
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.home9_2.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    private lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        preferences = getSharedPreferences("homework9_2", Context.MODE_PRIVATE)
        val editor = preferences.edit()

        binding.switch1.isChecked = preferences.getBoolean("state",false)
        binding.switch1.setOnCheckedChangeListener{_,onSwitch->
            editor.putBoolean("state",onSwitch)
            editor.apply()
        }
    }

}