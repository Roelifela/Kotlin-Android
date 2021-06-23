package br.com.digitalhouse.layouts01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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