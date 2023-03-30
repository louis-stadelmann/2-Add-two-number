package com.example.addtwonumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnCalculate)
        val input1 = findViewById<EditText>(R.id.input1)
        val input2 = findViewById<EditText>(R.id.input2)
        val result = findViewById<TextView>(R.id.textViewResult)

        button.setOnClickListener {
            val number1 = input1.text.toString().toInt()
            val number2 = input2.text.toString().toInt()
            val addition = number1 + number2
            result.text = addition.toString()
        }
    }
}