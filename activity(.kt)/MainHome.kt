package com.example.traplo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.traplo.databinding.ActivityMainBinding
import com.example.traplo.databinding.MainHomeBinding

class MainHome : AppCompatActivity() {
    private var mBinding: MainHomeBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MainHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mapGo.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.placeSearch.setOnClickListener{
            val intent = Intent(this, PlaceSearch::class.java)
            startActivity(intent)
        }
    }
}