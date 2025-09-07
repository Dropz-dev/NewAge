package com.newage.gymapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.newage.gymapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.message.text = "NewAge Gym App - Ready to build"
    }
}


