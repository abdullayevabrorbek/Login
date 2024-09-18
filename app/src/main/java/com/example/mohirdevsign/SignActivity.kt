package com.example.mohirdevsign

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)

        val loginBtn=findViewById<Button>(R.id.loginBtn)
        loginBtn.setOnClickListener {
            val intent= Intent(this,DataActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}