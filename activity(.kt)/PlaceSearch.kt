package com.example.traplo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.traplo.databinding.MainHomeBinding
import com.example.traplo.databinding.PlaceSearchBinding

class PlaceSearch : AppCompatActivity() {
    private var mBinding: PlaceSearchBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = PlaceSearchBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}