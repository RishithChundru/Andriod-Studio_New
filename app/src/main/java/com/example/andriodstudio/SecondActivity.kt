package com.example.andriodstudio

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Get the message passed from MainActivity
        val message = intent.getStringExtra("EXTRA_MESSAGE")

        // Display the message in a TextView
        val textView: TextView = findViewById(R.id.textView)
        textView.text = message
    }
}