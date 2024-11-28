package com.example.andriodstudio

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class grid_layout_33 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_grid_layout33)
        var a=findViewById<ImageButton>(R.id.imagebutton3);
        var b=findViewById<ImageButton>(R.id.imagebutton4);
        var c=findViewById<ImageButton>(R.id.imagebutton5);
        var d=findViewById<ImageButton>(R.id.imagebutton6);
        var e=findViewById<ImageButton>(R.id.imagebutton7);
        var f=findViewById<ImageButton>(R.id.imagebutton8);
        var g=findViewById<ImageButton>(R.id.imagebutton9);
        var h=findViewById<ImageButton>(R.id.imagebutton10);
        var i=findViewById<ImageButton>(R.id.imagebutton11)
        a.setOnClickListener{
            Toast.makeText(this,"button1 clicked",Toast.LENGTH_LONG).show()
        }
        b.setOnClickListener{
            Toast.makeText(this,"button2 clicked",Toast.LENGTH_LONG).show()
        }
        c.setOnClickListener{
            Toast.makeText(this,"button3 clicked",Toast.LENGTH_LONG).show()
        }
        d.setOnClickListener{
            Toast.makeText(this,"button4 clicked",Toast.LENGTH_LONG).show()
        }
        e.setOnClickListener{
            Toast.makeText(this,"button5 clicked",Toast.LENGTH_LONG).show()
        }
        f.setOnClickListener{
            Toast.makeText(this,"button6 clicked",Toast.LENGTH_LONG).show()
        }
        g.setOnClickListener{
            Toast.makeText(this,"button7 clicked",Toast.LENGTH_LONG).show()
        }
        h.setOnClickListener{
            Toast.makeText(this,"button8 clicked",Toast.LENGTH_LONG).show()
        }
        i.setOnClickListener{
            Toast.makeText(this,"button9 clicked",Toast.LENGTH_LONG).show()
        }
        ;

    }
}