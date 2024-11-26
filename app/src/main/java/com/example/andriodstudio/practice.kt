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
            var y=a.text.toString()
            var z=b.text.toString()
            var x= Intent(this,Teacher::class.java)
            if(y=="Rishith"&& z=="Rishith" ){
                x.putExtra("key",y)
                startActivity(x);
                Toast.makeText(this,"Login successfully!",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Wrong credentials!!\n Try Again",Toast.LENGTH_SHORT).show()
            }
        }
    }
}