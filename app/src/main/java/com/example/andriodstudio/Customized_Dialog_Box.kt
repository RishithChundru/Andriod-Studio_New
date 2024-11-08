package com.example.andriodstudio

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Customized_Dialog_Box : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_customized_dialog_box)
        var b=findViewById<Button>(R.id.button19)
        b.setOnClickListener{
            var d=LayoutInflater.from(this).inflate(R.layout.customized_dialogbox,null)
            var b=AlertDialog.Builder(this).setView(d)
            b.setPositiveButton("Subscribe"){ dialog, _ ->
                val e=d.findViewById<EditText>(R.id.editTextText3)
                val email=e.text.toString()

                if(email.isNotBlank()){
                    Toast.makeText(this,"Subscribed with: $email",Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"Please Enter a valid email",Toast.LENGTH_SHORT).show()
                }
                dialog.dismiss()
            }

            b.setNegativeButton("Cancel"){ dialog, _ ->dialog.dismiss() }
            b.create().show()
        }

    }
}