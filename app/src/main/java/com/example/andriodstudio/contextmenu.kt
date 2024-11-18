package com.example.andriodstudio

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class contextmenu : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_contextmenu)
        val imageView = findViewById<ImageView>(R.id.imageView6)
        registerForContextMenu(imageView)
    }
    override fun onCreateContextMenu(menu: ContextMenu, v: View, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.contextmenu, menu)
    }
    override fun onContextItemSelected(item: MenuItem): Boolean {
        val imageView = findViewById<ImageView>(R.id.imageView6)
        return when (item.itemId) {
            R.id.change_color -> {
                imageView.setColorFilter(Color.RED)
                Toast.makeText(this, "Image Colour Changed to Red", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.rotate -> {
                imageView.rotation += 45f
                Toast.makeText(this, "Image was Rotated by 45 degrees", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }
}