package com.example.mohirdevsign

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EmailActivity:AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.email_layout)

        val next=findViewById<Button>(R.id.nextPasswordButton)
        next.setOnClickListener {
            val intent=Intent(this,PasswordActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}