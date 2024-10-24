package com.example.andriodstudio

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profile : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        val username = getIntent().getStringExtra("Username");
        val a=findViewById<TextView>(R.id.TextView)
        val b=findViewById<Button>(R.id.Button)
        val c=findViewById<Button>(R.id.Button1)
        val d=findViewById<Button>(R.id.Button2)
        val e=findViewById<Button>(R.id.Button3)
        a.setText("Welcome, " + username + "!");


    }
}