package com.example.andriodstudio

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class listview_2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view2)
        val a=findViewById<EditText>(R.id.editTextText8)
        val b=findViewById<Button>(R.id.button39)
        val c=findViewById<ListView>(R.id.listview3)
        val e=findViewById<Button>(R.id.button40)
        val d= ArrayList<String>()
        val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_checked,d)
        c.adapter=adapter
        b.setOnClickListener{
            val enteredtext=a.text.toString()
            if(enteredtext.isNotEmpty()){
                d.add(enteredtext)
                a.text.clear()
                adapter.notifyDataSetChanged()
                Toast.makeText(this,"$enteredtext added successfully to item list",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Enter text: ",Toast.LENGTH_SHORT).show()
            }
            e.setOnClickListener{
                d.clear()
                adapter.notifyDataSetChanged()
                a.text.clear()
                Toast.makeText(this,"deleted",Toast.LENGTH_SHORT).show()
            }
        }
    }
}