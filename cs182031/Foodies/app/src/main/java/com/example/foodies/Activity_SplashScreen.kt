package com.example.foodies

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

public const val time = 3000L

class Activity_SplashScreen : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        supportActionBar?.hide()

        Handler(Looper.myLooper()!!).postDelayed({

           val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

        }, time)



    }
}