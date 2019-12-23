package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_test.text = number.toString()
        btn_test.text = "Click me!"

        btn_test.setOnClickListener(View.OnClickListener {
            number++
            tv_test.text = number.toString()
        })
    }
}
