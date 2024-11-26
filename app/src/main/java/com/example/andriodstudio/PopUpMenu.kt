package com.example.andriodstudio

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PopUpMenu : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pop_up_menu)
        val p1=findViewById<Button>(R.id.button20)
        p1.setOnClickListener{
            val p2=PopupMenu(this, p1)
            val m1: MenuInflater=p2.menuInflater
            m1.inflate(R.menu.popupmenu, p2.menu)
            p2.setOnMenuItemClickListener { item: MenuItem ->
                when(item.itemId) {
                    R.id.share -> {
                        Toast.makeText(this, "Share Button Clicked",Toast.LENGTH_SHORT).show()
                        val send: Intent=Intent().apply{
                            action=Intent.ACTION_SEND
                            putExtra(Intent.EXTRA_TEXT, "copylink")
                            type="text/plain"
                        }
                        val i: Intent=Intent.createChooser(send,"share via")
                        startActivity(i)
                        true
                    }
                    R.id.delete -> {
                        Toast.makeText(this,"Delete Button Clicked",Toast.LENGTH_SHORT).show()
                        true
                    }
                    else -> false
                }
            }
            p2.show()
        }
    }
}