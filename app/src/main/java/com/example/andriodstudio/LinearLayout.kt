package com.example.andriodstudio

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LinearLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)
        val btn1=findViewById<Button>(R.id.button36)
        val btn2=findViewById<Button>(R.id.button37)
        btn1.setOnClickListener{
            Toast.makeText(this,"button 1 is clicked",Toast.LENGTH_SHORT).show()
        }
        btn2.setOnClickListener{
            Toast.makeText(this,"button 2 is clicked",Toast.LENGTH_SHORT).show()
        }
    }
}