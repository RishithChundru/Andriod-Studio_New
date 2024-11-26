package com.example.andriodstudio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Intent_class : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intent_class)
        var a=findViewById<EditText>(R.id.etInput)
        var b=findViewById<Button>(R.id.btnSend)
        b.setOnClickListener{
            val input=a.text.toString()
            val intent= Intent(this,Intent_class_2::class.java)
            intent.putExtra("Extra Message",input)
            startActivity(intent)
        }
    }
}