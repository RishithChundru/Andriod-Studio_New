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

class Intent_login_1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intent_login1)
        var a=findViewById<EditText>(R.id.editTextText9)
        var b=findViewById<EditText>(R.id.editTextText10)
        var c=findViewById<Button>(R.id.button42)
        c.setOnClickListener{
            var uname=a.text.toString()
            var pass=b.text.toString()
            if(uname=="Rishith" && pass=="Rishith2005"){
                val intent= Intent(this,Intent_login_2::class.java)
                intent.putExtra("Extra message",uname)
                startActivity(intent)
                Toast.makeText(this,"Login successfully",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Login credentials are wrong",Toast.LENGTH_SHORT).show()
            }
        }
    }
}