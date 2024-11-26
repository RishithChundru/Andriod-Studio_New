package com.example.andriodstudio

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Intent_class_2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intent_class2)
        var a=findViewById<TextView>(R.id.textView20)
        val msg=intent.getStringExtra("Extra Message")
        a.text="welcome to activity $msg"
        Toast.makeText(this,"welcome to other activity $msg",Toast.LENGTH_SHORT).show()
    }
}