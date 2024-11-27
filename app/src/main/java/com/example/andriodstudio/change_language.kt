package com.example.andriodstudio

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.intellij.lang.annotations.Language
import java.util.Locale

class change_language : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_change_language)
        var a=findViewById<TextView>(R.id.textView22)
        var b=findViewById<Button>(R.id.button45)
        b.setOnClickListener{
            var currlocale=resources.configuration.locale.language
            if(currlocale=="en"){
                setLocale("ta")
            }
            else{
                setLocale("en")
            }
        }
    }
    private fun setLocale(language: String){
        val loc= Locale(language)
        Locale.setDefault(loc)
        val config=Configuration()
        config.locale=loc
        resources.updateConfiguration(config,resources.displayMetrics)
        recreate()
    }
}