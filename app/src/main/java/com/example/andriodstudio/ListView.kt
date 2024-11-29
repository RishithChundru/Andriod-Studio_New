package com.example.andriodstudio

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class ListView : AppCompatActivity() {

    private lateinit var listView: ListView
    private val items = mutableListOf(
        "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6"
    )
    lateinit var adapter: ArrayAdapter<String>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        listView = findViewById(R.id.listView)
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)

        // Set the adapter to the ListView
        listView.adapter = adapter
        listView.setOnItemClickListener{_,_,position,_ ->
            showDeleteDialog(position)
        }
    }

    private fun showDeleteDialog(position: Int){
        val d=AlertDialog.Builder(this)
        d.setTitle("Delete task");
        d.setMessage("are you sure?")
        d.setPositiveButton("yes"){_,_->
            deletetask(position)
        }
        d.setNegativeButton("No"){dialog,_->dialog.dismiss()};
        d.create().show()
    }
    private fun deletetask(position: Int){
        items.removeAt(position)
        adapter.notifyDataSetChanged()
    }
}
