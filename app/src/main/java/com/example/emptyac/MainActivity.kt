package com.example.emptyac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.emptyac.databinding.ActivityMainBinding


class  MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
            binding.btnname.setOnClickListener {

                val nvm = binding.nameput.text.toString()

                binding.tview.text = "Olá, ${nvm}"

            }
        }
    }
