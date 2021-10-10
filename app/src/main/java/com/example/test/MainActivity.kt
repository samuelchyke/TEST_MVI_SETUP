package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        button_calculate.setOnClickListener {
            calculate()
        }


    }

    private fun calculate(){
        val a = text_view_answer_1.toString().toInt()
        val b = text_view_answer_2.toString().toInt()

        val result = a + b

        textview.setText(result)
    }


}