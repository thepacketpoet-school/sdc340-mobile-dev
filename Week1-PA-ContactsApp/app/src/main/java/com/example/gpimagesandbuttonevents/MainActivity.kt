package com.example.gpimagesandbuttonevents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button


// Haley Altaie
// SDC340
// Week 1: PA - Contacts Address Book
// 02/01/26

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val contact1Button = findViewById<Button>(R.id.btnContact1)
        contact1Button.setOnClickListener {
            startActivity(Intent(this, ContactDetail1Activity::class.java))
        }
        val contact2Button = findViewById<Button>(R.id.btnContact2)
        contact2Button.setOnClickListener {
            startActivity(Intent(this, ContactDetail2Activity::class.java))
        }
    }
}