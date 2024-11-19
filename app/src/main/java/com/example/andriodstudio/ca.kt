package com.example.andriodstudio

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ca : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ca)
        var a = findViewById<Button>(R.id.button27)
        a.setOnClickListener {
            var b = AlertDialog.Builder(this)
            b.setTitle("Delete Tasks")
            b.setMessage("Are you sure you want to delete this task?")
            b.setCancelable(false)
            b.setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this, "All tasks are deleted successfully", Toast.LENGTH_SHORT)
                    .show();
                finish()
            }
            b.setNegativeButton("No") { dialog, _ -> dialog.dismiss() }
            b.create().show()
        }
    }
}