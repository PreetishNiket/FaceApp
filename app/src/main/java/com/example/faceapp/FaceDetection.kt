package com.example.faceapp

import android.app.Application
import com.google.firebase.FirebaseApp

class FaceDetection : Application() {
    val RESULT_TEXT = "RESULT_TEXT"
    val RESULT_DIALOG = "RESULT_DIALOG"

    override fun onCreate() {

        super.onCreate()
        FirebaseApp.initializeApp(this)
    }
}