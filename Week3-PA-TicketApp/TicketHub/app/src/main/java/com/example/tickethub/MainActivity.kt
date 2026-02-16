package com.example.tickethub

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.NumberFormat

//Haley Archer
//PA - Concert Ticket Hub
//02/15/2026

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get references to UI elements
        val spinnerEvent = findViewById<Spinner>(R.id.spinnerEvent)
        val txtNumberTickets = findViewById<EditText>(R.id.txtNumberTickets)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val txtTotalCost = findViewById<TextView>(R.id.txtTotalCost)

        // Populate spinner with events from string array
        val events = resources.getStringArray(R.array.events)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, events)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerEvent.adapter = adapter

        // Event prices
        val eventPrices = doubleArrayOf(49.99, 45.99, 42.99)

        // Calculate button click handler
        btnCalculate.setOnClickListener {
            // Get number of tickets
            val numTicketsStr = txtNumberTickets.text.toString()
            
            if (numTicketsStr.isNotEmpty()) {
                val numTickets = numTicketsStr.toInt()
                
                // Get selected event position
                val selectedPosition = spinnerEvent.selectedItemPosition
                
                // Calculate total cost
                val ticketPrice = eventPrices[selectedPosition]
                val totalCost = numTickets * ticketPrice
                
                // Format and display result
                val currencyFormat = NumberFormat.getCurrencyInstance()
                txtTotalCost.text = "Total Cost: ${currencyFormat.format(totalCost)}"
            } else {
                txtTotalCost.text = "Please enter number of tickets"
            }
        }
    }
}
