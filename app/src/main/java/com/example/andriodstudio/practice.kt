package com.example.andriodstudio

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class practice : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practice)
        var a=findViewById<EditText>(R.id.editTextText6)
        var b=findViewById<EditText>(R.id.editTextText7)
        var btn=findViewById<Button>(R.id.button29)
        btn.setOnClickListener{
            var x= Intent(this,Teacher::class.java)
            var y=a.text.toString()
            var z=b.text.toString()
            if(a.equals("Rishith")&& b.equals("Rishith")){
                x.putExtra("key",y)
                x.putExtra("key1",z)
                startActivity(x);
            }
            else{
                Toast.makeText(this,"Wrong credentials!!\n Try Again",Toast.LENGTH_SHORT).show()
            }
        }
    }
}