package com.example.modulee

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.btn_login)
        val edtusername = findViewById<EditText>(R.id.edt_lgn_1)
        val edtPassword = findViewById<EditText>(R.id.edt_lgn_2)

        val sharePreference = getSharedPreferences("MY_PRE", Context.MODE_PRIVATE)
        val getUsername = sharePreference.getString("USERNAME", "")
        val getPassword = sharePreference.getString("PASSWORD", "")

        if (getUsername != "" && getPassword != "") {
            val i = Intent(this, HomeActivity::class.java)
            startActivity(i)
        }

        btnLogin.setOnClickListener {
            val username = edtusername.text.toString()
            val password = edtPassword.text.toString()

            val editor = sharePreference.edit()
            editor.putString("USERNAME", username)
            editor.putString("PASSWORD", password)
            editor.apply()

            val i = Intent(this, HomeActivity::class.java)
            startActivity(i)
        }
    }
}