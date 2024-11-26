package com.example.andriodstudio

import android.os.Bundle
import android.widget.Button
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Appchooser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_appchooser)
        val a=findViewById<Button>(R.id.button44)
        a.setOnClickListener{
            sharetext("choose an app to send a message")
        }
    }
    private fun sharetext(msg: String){
        val b: Intent= Intent().apply {
            action=Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT,msg)
            type="text/plain"
        }
        val i: Intent= Intent.createChooser(b,"share via")
        startActivity(i)
    }
}