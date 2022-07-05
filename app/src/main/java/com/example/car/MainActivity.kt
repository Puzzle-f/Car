package com.example.car

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.car.view.CarFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, CarFragment.newInstance())
            .commitNow()
    }

}