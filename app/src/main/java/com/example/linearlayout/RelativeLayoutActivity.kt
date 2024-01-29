package com.example.linearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class RelativeLayoutActivity : AppCompatActivity() {
    var tvNumber : TextView? = null
    var btnAdd : Button? = null
    var btnMinus : Button? = null
    var btnMultiply : Button? = null
    var btnDivide : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)

        tvNumber = findViewById(R.id.tvNumber)
        btnAdd = findViewById(R.id.btnAdd)
        btnMinus = findViewById(R.id.btnMinus)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnDivide = findViewById(R.id.btnDivide)

        btnAdd?.setOnClickListener {
            var number = tvNumber?.text.toString().toInt()
            number = number + 1
            tvNumber?.setText(number.toString())
        }
        btnMinus?.setOnClickListener {
            var number = tvNumber?.text.toString().toInt()
            number = number - 1
            tvNumber?.setText(number.toString())
        }
        btnMultiply?.setOnClickListener {
            var number = tvNumber?.text.toString().toInt()
            number = number * 2
            tvNumber?.setText(number.toString())
        }
        btnDivide?.setOnClickListener {
            var number = tvNumber?.text.toString().toInt()
            number = number / 2
            tvNumber?.setText(number.toString())
        }
    }
}