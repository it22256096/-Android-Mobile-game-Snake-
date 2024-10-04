package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


       val startButton= findViewById<Button>(R.id.button)
        startButton.setOnClickListener{
            val Intent=Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }

        val instructionButton= findViewById<Button>(R.id.button2)
        instructionButton.setOnClickListener{
            val Intent=Intent(this,MainActivity4::class.java)
            startActivity(Intent)
        }



    }
}