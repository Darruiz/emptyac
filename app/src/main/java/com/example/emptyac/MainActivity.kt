package com.example.emptyac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.emptyac.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.convertButton.setOnClickListener {
     
            val euroAmount = binding.euroInput.text.toString().toDoubleOrNull()

            if (euroAmount != null) {
              
                val conversionRate = 1.18 

              
                val usdAmount = euroAmount * conversionRate

               
                binding.result.text = String.format("%.2f Euros = %.2f Dólares", euroAmount, usdAmount)
            } else {
                binding.result.text = "Valor em euros inválido"
            }
        }
    }
}
