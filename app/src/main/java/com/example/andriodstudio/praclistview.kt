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
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class praclistview : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_praclistview)
        val a=findViewById<EditText>(R.id.editTextText12)
        val addbtn=findViewById<Button>(R.id.button48)
        val delbtn=findViewById<Button>(R.id.button49)
        val b=findViewById<ListView>(R.id.listView5)
        val c=ArrayList<String>()
        val adapter=ArrayAdapter(this,android.R.layout.simple_list_item_checked,c)
        b.adapter=adapter
        addbtn.setOnClickListener{
            val enter=a.text.toString()
            if(enter.isNotEmpty()){
                c.add(enter)
                a.text.clear()
                adapter.notifyDataSetChanged()
                Toast.makeText(this,"$enter item added successfully",Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Please enter item",Toast.LENGTH_SHORT).show()
            }
        }
        delbtn.setOnClickListener{
            c.clear()
            adapter.notifyDataSetChanged()
            Toast.makeText(this,"Deleted all items",Toast.LENGTH_SHORT).show()
        }



    }
}