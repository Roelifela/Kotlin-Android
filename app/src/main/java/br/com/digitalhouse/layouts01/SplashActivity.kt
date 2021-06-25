package br.com.digitalhouse.layouts01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.digitalhouse.layouts01.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}