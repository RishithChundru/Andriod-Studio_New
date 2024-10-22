package com.example.andriodstudio

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Localization_2 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_localization2)

        val textView: TextView = findViewById(R.id.textView)
        val englishButton: Button = findViewById(R.id.englishButton)
        val spanishButton: Button = findViewById(R.id.spanishButton)

        // Define translations
        val translations = mapOf(
            "English" to "Hello, World!",
            "Spanish" to "¡Hola, Mundo!"
        )

        // Set up button click listeners
        englishButton.setOnClickListener {
            textView.text = translations["English"]
        }

        spanishButton.setOnClickListener {
            textView.text = translations["Spanish"]
        }
    }
}