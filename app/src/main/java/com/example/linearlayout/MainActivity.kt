package com.example.linearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    var tvHello : TextView? = null
    var tvName : TextView? = null
    var etName : EditText? = null
    var tvClg : TextView? = null
    var etClg : EditText? = null
    var tvAboutClg : TextView? = null
    var etAboutClg : EditText? = null
    var btnSubmit : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvHello = findViewById(R.id.tvHello)
        tvName = findViewById(R.id.tvName)
        etName = findViewById(R.id.etName)
        tvClg = findViewById(R.id.tvClg)
        etClg = findViewById(R.id.etClg)
        tvAboutClg = findViewById(R.id.tvAboutClg)
        etAboutClg = findViewById(R.id.etAboutClg)
        btnSubmit = findViewById(R.id.btnSubmit)

        btnSubmit?.setOnClickListener{

            if (etName?.text.toString().trim().isNullOrEmpty()){
                etName?.error = "Enter your name"
            } else if (etClg?.text.toString().trim().isNullOrEmpty()){
                etClg?.error = "Enter your clg name"
            } else if (etAboutClg?.text.toString().trim().isNullOrEmpty()){
                etAboutClg?.error = "Enter about your clg"
            }else{
//                var intent : intent(this, RelativeLayoutActivity::class.java)
                Toast.makeText(this, "Submitted", Toast.LENGTH_SHORT).show()
//                startActivity(intent)
            }
        }
    }
}