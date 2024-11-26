package com.example.andriodstudio

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class Teacher : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_teacher)
        var a=findViewById<TextView>(R.id.textView13)
        var b=findViewById<TextView>(R.id.textView14)
        var c=findViewById<TextView>(R.id.textView15)
        var d=findViewById<TextView>(R.id.textView16)
        var e=findViewById<TextView>(R.id.textView17)
        var f=findViewById<TextView>(R.id.textView18)
        var g=findViewById<Button>(R.id.button30)
        var h=findViewById<Button>(R.id.button31)
        var i=findViewById<Button>(R.id.button32)
        var j=findViewById<Button>(R.id.button33)
        var k=findViewById<Button>(R.id.button34)
        var l=findViewById<Button>(R.id.button35)
        val msg=intent.getStringExtra("key")
        Toast.makeText(this,"Welcome $msg",Toast.LENGTH_SHORT).show();
        g.setOnClickListener{
            g.text="Rahul Punj Sir"
            Toast.makeText(this,"Class Timing: Mon,Tue,Wed,Thu - 12pm-1pm",Toast.LENGTH_SHORT).show()
        }
        h.setOnClickListener{
            h.text="Madhu Bala Madam"
            Toast.makeText(this,"Class Timing: Tue - 2pm-4pm\n Fri - 10am-12pm",Toast.LENGTH_SHORT).show()
        }
        i.setOnClickListener{
            i.text="Vikas Mangotra Sir"
            Toast.makeText(this,"Class Timing: Mon,Wed - 3pm-5pm",Toast.LENGTH_SHORT).show()
        }
        j.setOnClickListener{
            j.text="Tejinder Thind Sir"
            Toast.makeText(this,"Class Timing: Mon,Wed - 2pm-3pm\nFri - 12pm-1pm",Toast.LENGTH_SHORT).show()
        }
        k.setOnClickListener{
            k.text="Amit Sharma Sir"
            Toast.makeText(this,"Class Timing: Thu-2pm-4pm\nFri - 9am-10am",Toast.LENGTH_SHORT).show()
        }
        l.setOnClickListener{
            l.text="Sourabh sir"
            Toast.makeText(this,"Class Timing: Thu - 4pm-5pm\nFri - 2pm-4pm",Toast.LENGTH_SHORT).show()
        }


    }
}