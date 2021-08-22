package com.example.learnportaitmode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainBtn = findViewById<Button>(R.id.button)
        mainBtn.setOnClickListener {
            val userEntry = findViewById<EditText>(R.id.entry)
            val output = findViewById<TextView>(R.id.textView)
            output.text = userEntry.text.toString()
        }
    }
}