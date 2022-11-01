package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.*
import android.view.View
import android.widget.*
import androidx.core.widget.doOnTextChanged
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //////////////////////////////////////

        val button1: Button = findViewById(R.id.bt1)
        val button2: Button = findViewById(R.id.bt2)
        val amount: TextView = findViewById(R.id.cost)
        val con: TextView = findViewById(R.id.confirm)
        var flag : String = "10 jds"
        var flag2 : String = "Your order has been placed"
        val spinnerVal : Spinner = findViewById(R.id.spinner)
        var options = arrayOf("Classic 4.50 JD","Kinder 4.50 JD","Nutella 4.50 JD","Lotus 4.50 JD","Oreo 4.50 JD","White Chocolate 4.50 JD")
        val spinnerVal2 : Spinner = findViewById(R.id.spinner2)
        var options2 = arrayOf("Water 3.00JD","Oreo Milkshake 3.00 JD","Lotus Milkshake 3.00 JD","Kinder Milkshake 3.00 JD",
            "Arabic Milkshake 3.00 JD","Maltesers Milkshake 3.00 JD","Snickers Milkshake 3.00 JD")
        spinnerVal.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options )
        button1.setOnClickListener{ view -> amount.text = "10.00 JD" }
        spinnerVal2.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options2 )
        button2.setOnClickListener{ view -> con.text = flag2 }

        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Classic 4.50 JD")
            }
        }
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Water 3.00JD")
            }
        }
        flag2= "Your order has been placed"
        button2.setOnClickListener{ view -> con.text = flag2 }
    }
}

