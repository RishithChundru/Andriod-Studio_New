package com.example.andriodstudio

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class Second : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second2)
        val a = findViewById<TextView>(R.id.textView5)
        var btn=findViewById<Button>(R.id.button13)
        val message = intent.getStringExtra("EXTRA_MESSAGE")
        btn.setOnClickListener {
            view -> Snackbar.make(view, "Welcome to Activity", Snackbar.LENGTH_LONG).setAction("undo"){
            Toast.makeText(this, "User Verified", Toast.LENGTH_LONG).show()
            btn.text="Snack Activated"
        }.show()
        }
    }
}