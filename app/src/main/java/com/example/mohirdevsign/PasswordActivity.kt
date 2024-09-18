package com.example.mohirdevsign

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PasswordActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.password_layout)

        val next = findViewById<Button>(R.id.signBtn)
        next.setOnClickListener {
            val intent = Intent(this, VerifyActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}
