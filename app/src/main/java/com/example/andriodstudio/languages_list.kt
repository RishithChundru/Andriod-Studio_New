package com.example.andriodstudio

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Adapter
import android.widget.ListView
import android.content.Intent
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class languages_list : AppCompatActivity() {
    private val languages = listOf(
        "English" to "en",
        "Español" to "es",
        "Tamil" to "ta",
        "Hindi" to "hi",
        "తెలుగు" to "te"
    )
    @SuppressLint("StringFormatInvalid")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_languages_list)
        val languageListView: ListView = findViewById(R.id.languageListView)
        val selectedLanguageText: TextView = findViewById(R.id.selectedLanguageText)

        // Map language names
        val languageNames = languages.map { it.first }

        // Set up ListView adapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, languageNames)
        languageListView.adapter = adapter

        // Set ListView item click listener
        languageListView.setOnItemClickListener { _, _, position, _ ->
            val selectedLanguageCode = languages[position].second
            val selectedLanguageName = languages[position].first

            // Update the text dynamically to the selected language
            changeLanguage(selectedLanguageCode)
            selectedLanguageText.text = getString(R.string.change_language, selectedLanguageName)
        }
    }
    private fun changeLanguage(languageCode: String) {
        val locale = Locale(languageCode)
        Locale.setDefault(locale)
        val config = Configuration(resources.configuration)
        config.setLocale(locale)
        resources.updateConfiguration(config, resources.displayMetrics)

    }
}