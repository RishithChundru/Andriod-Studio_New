package com.example.andriodstudio

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class Snackbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snackbar)
        var bsnack=findViewById<Button>(R.id.button3)
        bsnack.setOnClickListener {
            view -> Snackbar.make(view, "This is snackbar", Snackbar.LENGTH_LONG).setAction("undo"){
            Toast.makeText(this, "hello i am toast", Toast.LENGTH_LONG).show()
        }.show()
        }
    }
}