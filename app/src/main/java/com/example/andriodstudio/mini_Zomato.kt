package com.example.andriodstudio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class mini_Zomato : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mini_zomato)
        var a=findViewById<Button>(R.id.button21)
        var b=findViewById<Button>(R.id.button22)
        var c=findViewById<Button>(R.id.button23)
        a.setOnClickListener{
            val i1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.zomato.com/phagwara/delivery?dishv2_id=2840&category=1"))
            startActivity(i1)
        }
        b.setOnClickListener{
            val i2 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.zomato.com/phagwara/delivery?dishv2_id=53385&category=1"))
            startActivity(i2)
        }
        c.setOnClickListener{
            val i3 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.zomato.com/phagwara/delivery/dish-tea"))
            startActivity(i3)
        }
    }
}