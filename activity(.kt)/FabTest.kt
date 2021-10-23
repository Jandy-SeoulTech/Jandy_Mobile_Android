package com.example.traplo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.traplo.databinding.FabTestBinding

class FabTest : AppCompatActivity() {
    val binding by lazy { FabTestBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}