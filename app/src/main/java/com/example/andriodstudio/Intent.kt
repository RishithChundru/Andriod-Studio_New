package com.example.andriodstudio

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Intent(actionPick: Any?, externalContentUri: Any) : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intent)
        var a=findViewById<TextView>(R.id.textView2) // username is Rishith
        var b=findViewById<TextView>(R.id.textView3)
        var c=findViewById<Button>(R.id.button2)
        c.setOnClickListener {
            val intent = Intent(this, Second::class.java)
            intent.putExtra("Extra Message", "Hello from MainActivity!")
            startActivity(intent)
        }
    }
}