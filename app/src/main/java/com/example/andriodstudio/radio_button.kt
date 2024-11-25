package com.example.andriodstudio

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class radio_button : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_button)
        val radioButton1 = findViewById<RadioButton>(R.id.radioButton)
        val radioButton2 = findViewById<RadioButton>(R.id.radioButton2)
        val reset=findViewById<Button>(R.id.button14)
        // Set an OnClickListener for each RadioButton
        radioButton1.setOnClickListener {
            Toast.makeText(this, "Selected: ${radioButton1.text}", Toast.LENGTH_SHORT).show()
        }
        radioButton2.setOnClickListener {
            Toast.makeText(this, "Selected: ${radioButton2.text}", Toast.LENGTH_SHORT).show()
        }
        reset.setOnClickListener {
            radioButton1.isChecked = false
            radioButton2.isChecked = false
            Toast.makeText(this, "Selection cleared", Toast.LENGTH_SHORT).show()
        }
    }
}