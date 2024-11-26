package com.example.andriodstudio

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class record_audio_permission : AppCompatActivity() {
    var c=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_storage_permission)

        val a=findViewById<Button>(R.id.button43)
        a.setOnClickListener{
            if(ContextCompat.checkSelfPermission(this,android.Manifest.permission.RECORD_AUDIO)== PackageManager.PERMISSION_DENIED){
                ActivityCompat.requestPermissions(this, arrayOf( android.Manifest.permission.RECORD_AUDIO),c)
            }
            else{
                Toast.makeText(this,"camera permission already granted", Toast.LENGTH_SHORT).show()

            }
        }
    }
    override fun onRequestPermissionsResult(requestCode: Int,permissions: Array<out String>,grantResults: IntArray){
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode==c){
            if(grantResults.isNotEmpty() && grantResults[0]== PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this,"permission granted", Toast.LENGTH_SHORT).show()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.type = "audio/*"
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"permission denied", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
