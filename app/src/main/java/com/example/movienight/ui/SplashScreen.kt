package com.example.movienight.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.movienight.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val backGround=object:Thread(){
            override fun run() {
                Thread.sleep(3000)
                val intent= Intent(baseContext,
                    MainActivity::class.java)
                startActivity(intent)
            }
        }
        backGround.start()

    }
}