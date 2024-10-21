package com.example.andriodstudio

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class Localization : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_localization)

        var greetingText = findViewById<TextView>(R.id.greetingText)
        var changeLanguageButton = findViewById<Button>(R.id.changeLanguageButton)

        // Set a click listener on the button
        changeLanguageButton.setOnClickListener {
            // Toggle between English and Telugu
            val currentLocale = resources.configuration.locale.language
            if (currentLocale == "en") {
                setLocale("te") // Change to Telugu
            } else {
                setLocale("en") // Change to English
            }
        }
    }

    // Function to change the locale
    private fun setLocale(languageCode: String) {
        val locale = Locale(languageCode)
        Locale.setDefault(locale)
        val config = Configuration()
        config.locale = locale
        resources.updateConfiguration(config, resources.displayMetrics)

        // Refresh UI by restarting the activity (optional)
        recreate()
    }
}