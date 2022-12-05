package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.DialogFragment

class waffles :DialogFragment(R.layout.waffleoptions){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val cancelbt : Button = view.findViewById(R.id.cancelBT);
        val submitbt : Button = view.findViewById(R.id.submitBT);
        val radioGroup = view.findViewById<RadioGroup>(R.id.radio1)
        cancelbt.setOnClickListener{
            dismiss()
        }
        submitbt.setOnClickListener {
            val selectedOption: Int = radioGroup.checkedRadioButtonId
            val radioButton = view.findViewById<RadioButton>(selectedOption)
            var opt: TextView =view.findViewById(R.id.textView5)
            opt.text=radioButton.text.toString()
            dismiss()
        }
    }
}