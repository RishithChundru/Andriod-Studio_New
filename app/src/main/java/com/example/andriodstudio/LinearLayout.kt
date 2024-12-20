package com.example.andriodstudio

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LinearLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout)
        val a=findViewById<TextView>(R.id.textView12)
        val btn1=findViewById<Button>(R.id.button36)
        val btn2=findViewById<Button>(R.id.button37)
        btn1.setOnClickListener{
            a.setTextColor(Color.RED)
            Toast.makeText(this,"button 1 is clicked and color changed to red",Toast.LENGTH_SHORT).show()
        }
        btn2.setOnClickListener{
            a.setTextColor(Color.BLUE)
            Toast.makeText(this,"button 2 is clicked and color changed to blue",Toast.LENGTH_SHORT).show()
        }
    }
}