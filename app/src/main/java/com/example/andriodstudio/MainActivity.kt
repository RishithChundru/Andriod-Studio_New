package com.example.snackbar

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.andriodstudio.R
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bsnack = findViewById<Button>(R.id.button3)
        bsnack.setOnClickListener { view ->
            Snackbar.make(view, "This is snackbar", Snackbar.LENGTH_LONG)
                .setAction("Undo") {
                    Toast.makeText(this, "hello i am toast", Toast.LENGTH_LONG).show()
                }
                .show()
        }
    }
}
