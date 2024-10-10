package com.example.andriodstudio

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.math.log

class LogEntry : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_log_entry)
        val logButton: Button=findViewById(R.id.button)
        logButton.setOnClickListener{
            Log.v(TAG,"Verbose log: lowest priority, detailed entry,no use during production")
            Log.d(TAG,"Debug log: highest priority, This is used to debug the app")
            Log.i(TAG,"Info log: moderate level importance, they give information of completion")
            Log.w(TAG,"Warning log: THis is a warning message for unexpected behaviour")
        }
    }
}