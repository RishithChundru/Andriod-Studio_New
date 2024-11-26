package com.example.andriodstudio

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class record_audio_permission : AppCompatActivity() {
    var c=1
    var e=300
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_storage_permission)

        val a=findViewById<Button>(R.id.button43)
        a.setOnClickListener{
            if(ContextCompat.checkSelfPermission(this,android.Manifest.permission.READ_EXTERNAL_STORAGE)== PackageManager.PERMISSION_DENIED){
                val intent=Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
                startActivity(intent)
//                val intent = Intent(android.provider.Settings.ACTION_BLUETOOTH_SETTINGS)
//                startActivity(intent)
//                val intent = Intent(Intent.ACTION_RECORD_AUDIO)
//                startActivity(intent)
            }
            else{
                ActivityCompat.requestPermissions(this, arrayOf( android.Manifest.permission.READ_EXTERNAL_STORAGE),c)
            }
        }
    }
    override fun onRequestPermissionsResult(requestCode: Int,permissions: Array<out String>,grantResults: IntArray){
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode==c){
            if(grantResults.isNotEmpty() && grantResults[0]== PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this,"permission granted", Toast.LENGTH_SHORT).show()
//                val intent = Intent(Intent.ACTION_VIEW)
//                intent.type = "audio/*"
//                startActivity(intent)
//                val intent=Intent(Intent.ACTION_PICK,ContactsContract.Contacts.CONTENT_URI)
//                startActivity(intent)
//                val intent = Intent(android.provider.Settings.ACTION_BLUETOOTH_SETTINGS)
//                startActivity(intent)
//                val intent = Intent(Intent.ACTION_RECORD_AUDIO)
//                startActivity(intent)
                val intent=Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
                startActivity(intent)

            }
            else{
                Toast.makeText(this,"permission denied", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
