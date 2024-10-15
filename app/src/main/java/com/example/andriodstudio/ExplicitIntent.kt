package com.example.andriodstudio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ExplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_explicit_intent)
        val name=findViewById<EditText>(R.id.editTextText4)
        val password=findViewById<EditText>(R.id.editTextTextPassword2)
        val enter=findViewById<Button>(R.id.button11)
        enter.setOnClickListener {
            val i=Intent(this,intentrr::class.java)
            var z=name.text.toString()
            var y=password.text.toString()
            i.putExtra("key",z)
            i.putExtra("key1",y)
            startActivity(i)
        }
    }
}

class intentrr {

}

