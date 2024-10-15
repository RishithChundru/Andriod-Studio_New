package com.example.andriodstudio

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Intentrr : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intentrr)
        var t1=findViewById<TextView>(R.id.editTextText4)
        var t2=findViewById<TextView>(R.id.editTextText5)
        var a=intent.getStringExtra("key")
        var b=intent.getStringExtra("key1")
        t2.text=b
        t1.text=a
    }
}