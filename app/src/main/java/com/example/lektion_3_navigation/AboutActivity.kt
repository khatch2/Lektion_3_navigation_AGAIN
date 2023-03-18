package com.example.lektion_3_navigation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")      // ???
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val displayUsername: TextView = findViewById(R.id.textView_displayUsername) // TextView
        displayUsername.text = intent.getStringExtra("key_username")          // Load Data

    }
}

