package br.com.digitalhouse.layouts01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import br.com.digitalhouse.layouts01.databinding.ActivityMainBinding
import br.com.digitalhouse.layouts01.databinding.FragmentHomeBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.i("Teste", "OnCreate")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Teste", "OnResume")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Teste", "OnStart")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Teste", "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Teste", "OnDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Teste", "OnPause")

    }


}