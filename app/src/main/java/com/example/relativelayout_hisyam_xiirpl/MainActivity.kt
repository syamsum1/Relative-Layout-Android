package com.example.relativelayout_hisyam_xiirpl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSpinnerDay()
        setSpinnerTime()
    }
   private fun setSpinnerDay(){
        val spinnerday : Spinner = findViewById(R.id.spinner_date)

        ArrayAdapter.createFromResource(
            this,
                    R.array.day_array,
                    com.google.android.material.R.layout.support_simple_spinner_dropdown_item
        ).also{
            it.setDropDownViewResource(
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item)
            spinnerday.adapter = it
        }

    }
    private fun setSpinnerTime() {
        val spinnerTime : Spinner = findViewById(R.id.spinner_time)
        ArrayAdapter.createFromResource(
            this,
                    R.array.time_array,
                     androidx.appcompat.R.layout.support_simple_spinner_dropdown_item
        ).also {
            it.setDropDownViewResource(
            androidx.appcompat.R.layout.support_simple_spinner_dropdown_item)
            spinnerTime.adapter = it
        }

    }

}