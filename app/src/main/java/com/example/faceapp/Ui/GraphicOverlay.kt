package com.example.faceapp.Ui

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View
import com.google.android.gms.vision.CameraSource

class GraphicOverlay (context: Context,attributeSet: AttributeSet):View(context,attributeSet){
    private val lock=Any()
    private var previewWidth = 0
    private var previewHeight = 0

    private var widthScaleFactor = 1.0f
    private var heightScaleFactor = 1.0f

    private var facing =CameraSource.CAMERA_FACING_BACK
    private var graphics :MutableList<Graphic> = ArrayList()
    abstract class Graphic(private val overlay: GraphicOverlay){

        abstract fun draw(canvas: Canvas?)

        private fun scaleX(horizontal:Float):Float{
            return horizontal * overlay.widthScaleFactor
        }
        private fun scaleY(vertical:Float):Float{
            return vertical * overlay.heightScaleFactor
        }
        val applicationContext:Context
        get() = overlay.context.applicationContext

        fun translateX(x:Float):Float{
            return if(overlay.facing==CameraSource.CAMERA_FACING_FRONT){
                overlay.width-scaleX(x)
            }else{
                scaleX(x)
            }
        }

        fun translateY(y:Float):Float{
            return scaleY(y)
        }
        fun postInvalidate(){
            overlay.postInvalidate()
        }
    }
}