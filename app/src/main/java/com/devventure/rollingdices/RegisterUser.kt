package com.devventure.rollingdices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class RegisterUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)

        val playerName = findViewById<EditText>(R.id.playerName)
        val playButton = findViewById<Button>(R.id.playButton)

        playButton.setOnClickListener {
            var player = playerName.text.toString()
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("playername",player)
            startActivity(intent)
        }
    }
}