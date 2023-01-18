package com.example.movieguider

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val topmoviesbtn = findViewById<Button>(R.id.top_movies_btn)
        topmoviesbtn.setOnClickListener {
            val Intent = Intent(this,top_movies::class.java)
            startActivity(Intent)
        }
        val comedybtn = findViewById<Button>(R.id.comedy_btn)
        comedybtn.setOnClickListener {
            val Intent = Intent(this,comedy::class.java)
            startActivity(Intent)
        }
        val adventurebtn = findViewById<Button>(R.id.adventure_btn)
        adventurebtn.setOnClickListener {
            val Intent = Intent(this,adventure::class.java)
            startActivity(Intent)
        }
        val dramabtn = findViewById<Button>(R.id.drama_btn)
        dramabtn.setOnClickListener {
            val Intent = Intent(this,drama::class.java)
            startActivity(Intent)
        }
        val thrillerbtn =findViewById<Button>(R.id.thriller_btn)
        thrillerbtn.setOnClickListener {
            val Intent = Intent(this,thriller::class.java)
            startActivity(Intent)
        }
        val horrorbtn = findViewById<Button>(R.id.horror_btn)
        horrorbtn.setOnClickListener {
            val Intent = Intent(this,horror::class.java)
            startActivity(Intent)
        }
        val actionbtn = findViewById<Button>(R.id.action_btn)
        actionbtn.setOnClickListener {
            val Intent = Intent(this,action::class.java)
            startActivity(Intent)
        }
        val documentarybtn = findViewById<Button>(R.id.documentary_btn)
        documentarybtn.setOnClickListener {
            val Intent = Intent(this,documentary::class.java)
            startActivity(Intent)
        }
    }
}