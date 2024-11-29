package com.example.andriodstudio

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CheckBox : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_check_box)
        var a=findViewById<CheckBox>(R.id.checkBox)
        var b=findViewById<CheckBox>(R.id.checkBox2)
        var c=findViewById<Button>(R.id.button47)
        c.setOnClickListener{
                val selectedHobbies = mutableListOf<String>()

                if (a.isChecked) {
                    selectedHobbies.add("Reading")
                }
                if (b.isChecked) {
                    selectedHobbies.add("Traveling")
                }

                if (selectedHobbies.isNotEmpty()) {
                    Toast.makeText(this, "Selected hobbies: ${selectedHobbies.joinToString(", ")}", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "No hobbies selected", Toast.LENGTH_SHORT).show()
                }
            }
        }
        }
