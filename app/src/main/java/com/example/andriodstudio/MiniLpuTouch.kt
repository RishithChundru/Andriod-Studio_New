package com.example.andriodstudio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MiniLpuTouch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mini_lpu_touch)
        val name=findViewById<EditText>(R.id.editTextText)
        val password=findViewById<EditText>(R.id.editTextText2)
        val enter=findViewById<Button>(R.id.button4)
        enter.setOnClickListener {
            val i= Intent(this,intentrr::class.java)
            var z=name.text.toString()
            var y=password.text.toString()
            i.putExtra("key",z)
            i.putExtra("key1",y)
            startActivity(i)
        }
    }
}