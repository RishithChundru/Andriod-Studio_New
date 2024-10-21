package com.example.myapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.andriodstudio.R

class RelativeLayout : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Access the views from XML layout=
        val editText: EditText = findViewById<EditText>(R.id.editText)
        val button: Button = findViewById<Button>(R.id.button)

        // Set a click listener for the button
        button.setOnClickListener {
            // Get the text from the EditText and display it in the TextView
            val enteredText = editText.text.toString()
            if (enteredText.isNotEmpty()) {
                button.text = "Hello, $enteredText!"
            } else {
                button.text = "Please enter your name."
            }
        }
    }
}
