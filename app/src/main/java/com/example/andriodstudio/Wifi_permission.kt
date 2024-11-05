package com.example.andriodstudio

import android.annotation.SuppressLint
import android.bluetooth.BluetoothAdapter
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Wifi_permission : AppCompatActivity() {
    var c=1
    @SuppressLint("MissingInflatedId", "MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_wifi_permission)
        var b1=findViewById<Button>(R.id.button17)
        b1.setOnClickListener{
            if(ContextCompat.checkSelfPermission(this,android.Manifest.permission.BLUETOOTH)== PackageManager.PERMISSION_DENIED){
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.BLUETOOTH),c)
            }
            else{
                Toast.makeText(this,"bluetooth permission already granted", Toast.LENGTH_SHORT).show()
                val i1 = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
                startActivity(i1)
            }
        }
    }
    @SuppressLint("MissingPermission")
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray){
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode==c){
            if(grantResults[0]==PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this,"bluetooth Permission granted",Toast.LENGTH_SHORT).show()
                val i1 = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
                startActivity(i1)
            }
            else{
                Toast.makeText(this, "bluetooth Permission Denied", Toast.LENGTH_SHORT).show()
            }
        }
    }
    }
