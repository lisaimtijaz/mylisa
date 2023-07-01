package com.example.modulee

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.modulee.HomepageActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val txtDisplay = findViewById<TextView>(R.id.txt_display)
        val btnHome = findViewById<Button>(R.id.btn_home)
        val sharePreference = getSharedPreferences("MY_PRE", Context.MODE_PRIVATE)

        val username = sharePreference.getString("USERNAME", "").toString()
        val password = sharePreference.getString("PASSWORD", "").toString()
        txtDisplay.text = "Username is: $username Password is: $password"

        btnHome.setOnClickListener {
            val intent = Intent(applicationContext, HomepageActivity::class.java )
            startActivity(intent)
            finish()
        }
    }



}