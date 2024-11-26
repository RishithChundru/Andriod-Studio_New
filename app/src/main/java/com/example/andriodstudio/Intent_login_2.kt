package com.example.andriodstudio

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Intent_login_2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intent_login2)
        var a=findViewById<TextView>(R.id.textView21)
        var msg=intent.getStringExtra("Extra message")
        a.text="Welcome to page $msg"
        Toast.makeText(this,"use the app",Toast.LENGTH_SHORT).show()
    }
}