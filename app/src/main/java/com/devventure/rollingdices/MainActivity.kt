package com.devventure.rollingdices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dice01 = findViewById<TextView>(R.id.dice01)
        val dice02 = findViewById<TextView>(R.id.dice02)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener{
            dice01.text = randomNumber().toString()
            dice02.text = randomNumber().toString()
        }
    }

    private fun randomNumber() : Int {
        return (1..6).random()
    }
}