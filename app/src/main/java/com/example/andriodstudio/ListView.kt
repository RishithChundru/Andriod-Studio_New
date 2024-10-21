package com.example.andriodstudio

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListView : AppCompatActivity() {

    private lateinit var listView: ListView
    private val items = arrayOf(
        "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6"
    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        listView = findViewById(R.id.listView)

        // Create an ArrayAdapter to display the items in the ListView
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, // Default layout for list items
            items
        )

        // Set the adapter to the ListView
        listView.adapter = adapter
    }
}
