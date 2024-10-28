package com.example.andriodstudio

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AppChooserDemo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_chooser_demo)
        val s1: Button =findViewById(R.id.button15)
        s1.setOnClickListener{
            shareText("hello, choose an app to share this message")
        }
    }
    private fun shareText(msg: String){
        val send: Intent=Intent().apply{
            action=Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, msg)
            type="text/plain"
        }
        val i: Intent=Intent.createChooser(send,"share via")
        startActivity(i)
    }
}