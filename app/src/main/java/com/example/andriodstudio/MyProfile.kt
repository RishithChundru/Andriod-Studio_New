package com.example.andriodstudioedit

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.andriodstudio.Intent
import com.example.andriodstudio.R
import com.example.andriodstudio.Second
import com.example.andriodstudio.profile

import com.example.snackbar.MainActivity

class MyProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_my_profile)
        val a=findViewById<EditText>(R.id.editTextUsername)
        val b=findViewById<EditText>(R.id.editTextPassword)
        val btn=findViewById<Button>(R.id.loginButton)
        btn.setOnClickListener{
            val name=a.getText().toString()
            val password=b.getText().toString()
            if(a.equals("Rishith") && b.equals("Rishith")){
                val intent= android.content.Intent(this, profile::class.java)
                intent.putExtra("Username",a)
                startActivity(intent)

            }
            else{
                Toast.makeText(this, "Invalid Username or Password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

private fun Any.putExtra(s: String, a: EditText?) {

}





