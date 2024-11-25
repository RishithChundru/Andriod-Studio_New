package com.example.andriodstudio

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class relative_layout : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)
        val a=findViewById<EditText>(R.id.textView19)
        val btn=findViewById<Button>(R.id.button38)
        btn.setOnClickListener{
            val enteredtext=a.text.toString()
            if(enteredtext.isNotEmpty()){
                btn.text="Hello $enteredtext"
                Toast.makeText(this,btn.text,Toast.LENGTH_SHORT).show()
            }
            else{
                btn.text="Please enter a valid name"
                Toast.makeText(this,btn.text,Toast.LENGTH_SHORT).show()
            }
        }

    }
}