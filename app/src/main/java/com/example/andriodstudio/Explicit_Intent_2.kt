package com.example.andriodstudio

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Explicit_Intent_2 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explicit_intent2)

        val button: Button = findViewById(R.id.button)

        // Set a click listener on the button to start SecondActivity
        button.setOnClickListener {
            // Create an explicit intent to start SecondActivity
            val intent = Intent(this, SecondActivity::class.java)
            // Optionally, add data to pass to the second activity
            intent.putExtra("EXTRA_MESSAGE", "Hello from MainActivity!")
            startActivity(intent)
        }
    }
}