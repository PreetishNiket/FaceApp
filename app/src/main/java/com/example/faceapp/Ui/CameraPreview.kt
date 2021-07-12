package com.example.faceapp.Ui

import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup
import com.google.android.gms.vision.CameraSource

class CameraPreview(context: Context,attributeSet: AttributeSet?):ViewGroup(context,attributeSet) {
    private var startRequested=false
    private var surfaceAvailable=false
    private var cameraSource:CameraSource?=null
    private var overlay: GraphicOverlay?=null

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {

    }

}