package com.example.andriodstudio

import android.content.res.Configuration
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

/*class List_of_languages : AppCompatActivity() {
    private val languages = arrayOf("English", "Telugu", "Hindi")
    private val languageCodes = arrayOf("en", "te", "hi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_of_languages)
        val lvLanguages = findViewById<ListView>(R.id.lvLanguages)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, languages)
        lvLanguages.adapter = adapter

        lvLanguages.setOnItemClickListener { _, _, position, _ ->
            val selectedLanguageCode = languageCodes[position]
            setLocale(selectedLanguageCode)
            recreate() // Recreate activity to apply the new language
        }
    }

    private fun setLocale(languageCode: String) {
        val locale = Locale(languageCode)
        Locale.setDefault(locale)
        val config = Configuration()
        config.setLocale(locale)
        resources.updateConfiguration(config, resources.displayMetrics)

    }
    }
}*/