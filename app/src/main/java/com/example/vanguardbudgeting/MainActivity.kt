package com.example.vanguardbudgeting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat.startActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonFirstRealPage.setOnClickListener{
            onButtonSelect()
        }

        }

    fun onButtonSelect() {
        val intent = Intent(this, FirstActivity::class.java)
        startActivity(intent)
    }
}
