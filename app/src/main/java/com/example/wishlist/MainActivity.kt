package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val item_name = findViewById<EditText>(R.id.editTextTextPersonName)
        val num = findViewById<EditText>(R.id.editTextNumber)
    }
}