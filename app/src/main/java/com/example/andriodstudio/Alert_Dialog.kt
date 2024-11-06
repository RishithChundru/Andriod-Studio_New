package com.example.andriodstudio

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Alert_Dialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_alert_dialog)
        var b=findViewById<Button>(R.id.button18)
        b.setOnClickListener{
            val d=AlertDialog.Builder(this)
            d.setTitle("Exit")
            d.setMessage("Do you really want to exit?")
            d.setCancelable(false)
            d.setPositiveButton("Yes"){_,_ ->finish()}
            d.setNegativeButton("No"){dialog,_ ->dialog.dismiss()}
            d.create().show()
        }
    }
}