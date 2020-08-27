package com.catfacts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_splash_screen.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        catFactStartBtn.setOnClickListener {
            val factIntent = Intent(this, NavigationActivity::class.java)
            startActivity(factIntent)
        }
    }
}