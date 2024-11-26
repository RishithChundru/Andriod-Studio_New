package com.example.andriodstudio

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

class camera_permission : AppCompatActivity() {
    var c=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_camera_permission)
        val a=findViewById<Button>(R.id.button)
        a.setOnClickListener{
            if(ContextCompat.checkSelfPermission(this,android.Manifest.permission.CAMERA)== PackageManager.PERMISSION_DENIED){
                ActivityCompat.requestPermissions(this, arrayOf( android.Manifest.permission.CAMERA),c)
            }
            else{
                Toast.makeText(this,"camera permission already granted", Toast.LENGTH_SHORT).show()
                val i= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivity(i)
            }
        }
    }
    override fun onRequestPermissionsResult(requestCode: Int,permissions: Array<out String>,grantResults: IntArray){
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode==c){
            if(grantResults.isNotEmpty() && grantResults[0]== PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this,"permission granted", Toast.LENGTH_SHORT).show()
                val i= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivity(i)
            }
            else{
                Toast.makeText(this,"permission denied", Toast.LENGTH_SHORT).show()
            }
        }
    }
}