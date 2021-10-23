package com.example.traplo

import androidx.appcompat.app.AppCompatActivity
import com.example.traplo.databinding.SplashBinding
import android.content.Intent
import android.os.Bundle
import android.os.Handler

class Splash : AppCompatActivity() {
    val binding by lazy { SplashBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Handler().postDelayed({
            val intent = Intent(this, MainHome::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            finish()
        },DURATION)

    }
    companion object {
        private const val DURATION : Long = 3000
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}