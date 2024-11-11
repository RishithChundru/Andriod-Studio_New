package com.example.andriodstudio

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ContextMenu : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_context_menu)
        var i=findViewById<ImageView>(R.id.imageView5)
        registerForContextMenu(i)
    }

    override fun onCreateContextMenu(menu: ContextMenu, v: View, menuInfo: ContextMenu.ContextMenuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val i1: MenuInflater=menuInflater
        i1.inflate(R.menu.context_menu,menu)
    }
}