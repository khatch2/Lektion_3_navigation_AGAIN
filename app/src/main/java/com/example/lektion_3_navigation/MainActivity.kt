package com.example.lektion_3_navigation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val displayUsername: TextView = findViewById(R.id.textView_username)
        val btnNavigate : Button = findViewById(R.id.btn_navigateToAbout)       // Button
        val inputUsernameText: EditText = findViewById(R.id.editText_username)  // Input

        // Submit
        btnNavigate.setOnClickListener {

            // Prepare Data
            val intentNavigate = Intent(this, AboutActivity().javaClass).apply {
                putExtra("key_username", inputUsernameText.text.toString()) // Spannable to string without toString()
            }

            startActivity(intentNavigate)   // Send Data and Navigate
        }

    }
}

