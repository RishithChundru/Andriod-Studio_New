package com.example.androidstudio

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.MediaStore
import android.provider.CallLog
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.andriodstudio.R

class ImplicitIntent : AppCompatActivity() { // Renamed class to avoid conflict
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit_intent2)

        val btn1 = findViewById<Button>(R.id.button5)
        val btn2 = findViewById<Button>(R.id.button6)
        val btn3 = findViewById<Button>(R.id.button7)
        val btn4 = findViewById<Button>(R.id.button8)
        val btn5=findViewById<Button>(R.id.button9)
        val btn6=findViewById<Button>(R.id.button10)

        btn1.setOnClickListener {
            val i1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/"))
            startActivity(i1)
        }

        btn2.setOnClickListener {
            val i2 = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(i2)
        }

        btn3.setOnClickListener {
            val i3 = Intent(Intent.ACTION_VIEW)
            i3.type = CallLog.Calls.CONTENT_TYPE
            startActivity(i3)
        }

        btn4.setOnClickListener {
            val i4 = Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI)
            startActivity(i4)
        }
        btn5.setOnClickListener {
            val i5=Intent()
            i5.action=Intent.ACTION_VIEW
            i5.type= "image/*"
            startActivity(i5)
        }
        btn6.setOnClickListener {
            val i6=Intent(Intent.ACTION_VIEW)
            i6.setData(Uri.parse("tel:+919490888385"))
            startActivity(i6)
        }
    }
}
