package com.example.sumcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun sumNumbers(view: View?) {

        val result = Integer.parseInt(n1.text.toString())  + Integer.parseInt(n2.text.toString())
        total.text = "Total: " + result
    }
}
