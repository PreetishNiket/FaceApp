package com.example.faceapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.DialogFragment

class ResultDialog:DialogFragment() {

    lateinit var ok_btn:Button
    lateinit var  result_tv:TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_result,container,false)
        val resultText=""
        ok_btn=view.findViewById(R.id.result_ok_button)
        result_tv=view.findViewById(R.id.result_text_view)

        val bundle=arguments
//        resultText=bundle.getString(RESULT_TEXT)
        result_tv.text=resultText
        ok_btn.setOnClickListener {
            dismiss()
        }
        return view
    }
}