package com.example.mohirdevsign

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DataActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign)

        val nextBtn=findViewById<Button>(R.id.nextButton)
        nextBtn.setOnClickListener {
            val intent= Intent(this,EmailActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}