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

class AllPermissions : AppCompatActivity() {
    private val REQUEST_CODE_BLUETOOTH = 1
    private val REQUEST_CODE_CAMERA = 2
    private val REQUEST_CODE_MICROPHONE = 3
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_all_permissions)
        val bluetoothButton = findViewById<Button>(R.id.button_bluetooth)
        val cameraButton = findViewById<Button>(R.id.button_camera)
        val microphoneButton = findViewById<Button>(R.id.button_microphone)

        bluetoothButton.setOnClickListener {
            requestBluetoothPermission()
        }

        cameraButton.setOnClickListener {
            requestCameraPermission()
        }

        microphoneButton.setOnClickListener {
            requestMicrophonePermission()
        }
    }
    private fun requestBluetoothPermission() {
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.BLUETOOTH) == PackageManager.PERMISSION_DENIED) {
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.BLUETOOTH), REQUEST_CODE_BLUETOOTH)
        } else {
            Toast.makeText(this, "Bluetooth permission already granted", Toast.LENGTH_SHORT).show()
            enableBluetooth()
        }
    }

    private fun requestCameraPermission() {
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA) == PackageManager.PERMISSION_DENIED) {
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA), REQUEST_CODE_CAMERA)
        } else {
            Toast.makeText(this, "Camera permission already granted", Toast.LENGTH_SHORT).show()
            openCamera()
        }
    }

    private fun requestMicrophonePermission() {
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_DENIED) {
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.RECORD_AUDIO), REQUEST_CODE_MICROPHONE)
        } else {
            Toast.makeText(this, "Microphone permission already granted", Toast.LENGTH_SHORT).show()
            // Your code to access the microphone
        }
    }

    private fun enableBluetooth() {
        val bluetoothIntent = android.content.Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
        startActivity(bluetoothIntent)
    }

    private fun openCamera() {
        val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        startActivity(cameraIntent)
    }
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            REQUEST_CODE_BLUETOOTH -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, "Bluetooth Permission granted", Toast.LENGTH_SHORT).show()
                    enableBluetooth()
                } else {
                    Toast.makeText(this, "Bluetooth Permission Denied", Toast.LENGTH_SHORT).show()
                }
            }
            REQUEST_CODE_CAMERA -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, "Camera Permission granted", Toast.LENGTH_SHORT).show()
                    openCamera()
                } else {
                    Toast.makeText(this, "Camera Permission Denied", Toast.LENGTH_SHORT).show()
                }
            }
            REQUEST_CODE_MICROPHONE -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, "Microphone Permission granted", Toast.LENGTH_SHORT).show()
                    // Your code to access the microphone
                } else {
                    Toast.makeText(this, "Microphone Permission Denied", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}