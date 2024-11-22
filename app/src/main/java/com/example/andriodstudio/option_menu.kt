package com.example.andriodstudio

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class option_menu : AppCompatActivity() {
    var c=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_option_menu)
        var a=findViewById<Button>(R.id.button28)
        a.setOnClickListener{
            if(ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)==PackageManager.PERMISSION_DENIED){
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA) ,c);
            }
            else{
                Toast.makeText(this,"camera permission already granted",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode==c){
            if(grantResults.isNotEmpty() && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this,"camera permission granted",Toast.LENGTH_SHORT).show();
                val i= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivity(i);
            }
            else{
                val b=AlertDialog.Builder(this)
                b.setTitle("Exit")
                b.setMessage("Do you want to exit")
                b.setCancelable(false)
                b.setPositiveButton("Ok"){_,_ ->
                    if(ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)==PackageManager.PERMISSION_DENIED){
                        ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA) ,c);
                    }
                    else{
                        Toast.makeText(this,"camera permission already granted",Toast.LENGTH_SHORT).show()
                    }
                }
                b.setNegativeButton("Dismiss"){Dialog,_ ->Dialog.dismiss()}
                b.create().show()
            }
        }
    }
}