package com.example.vanguardbudgeting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textViewTotalAmount.setOnClickListener{
            totalInput()
        }
        textViewSave.setOnClickListener {
            saveInput()
        }
        textViewSpend.setOnClickListener {
            spendInput()
        }
    }

    fun totalInput(){
        val total = textViewTotalAmount
    }
    fun saveInput(){
        val save = textViewSave
    }
    fun spendInput(){
        val spend = textViewSpend
    }
}
