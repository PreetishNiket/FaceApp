package com.example.faceapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.Toast
import com.google.firebase.FirebaseApp

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        FirebaseApp.initializeApp(this)
        val faceDetector:Button=findViewById(R.id.face_detect)
        faceDetector.setOnClickListener {
                val intent =Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (intent.resolveActivity(packageManager)!=null){
                startActivityForResult(intent,124)
            }
            else{
                Toast.makeText(this, "Something went wrong",
                        Toast.LENGTH_SHORT).show()
            }
        }

    }

}