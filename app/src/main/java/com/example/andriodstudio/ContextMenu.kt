package com.example.andriodstudio

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.os.PersistableBundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
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

    override fun onContextItemSelected(item: MenuItem): Boolean {
        var i=findViewById<ImageView>(R.id.imageView5)
        return when (item.itemId ) {
            R.id.change_color -> {
                i.setColorFilter(Color.RED)
                Toast.makeText(this, "Image Colour Changed to Red",Toast.LENGTH_SHORT).show()
                true
            }
            R.id.rotate -> {
                i.rotation=i.rotation+45f
                Toast.makeText(this,"Image was Rotated by 45 degrees",Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onContextItemSelected(item)
        }
    }
}