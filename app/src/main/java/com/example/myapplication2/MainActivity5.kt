package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)


        Handler().postDelayed({
            val intent=Intent(this@MainActivity5,MainActivity3::class.java)
            startActivity(intent)
            finish()
        },3000)



    }
}