package com.example.login

import android.graphics.drawable.DrawableContainer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatViewInflater
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var et_user_name = findViewById(R.id.et_user_name) as EditText
        var et_password = findViewById(R.id.et_password) as EditText
        var btn_reset = findViewById(R.id.btn_reset) as Button
        var btn_submit = findViewById(R.id.btn_submit) as Button

        btn_reset.setOnClickListener {
            et_user_name.setText("")
            et_password.setText("")
            btn_submit.setOnClickListener {
                val user_name = et_user_name.text;
                val password = et_password.text;
                Toast.makeText(this@MainActivity, user_name, Toast.LENGTH_LONG).show()

            }

        }
        btn_submit.setOnClickListener {
        var btn_submit: Button? = null
        btn_submit = findViewById(R.id.btn_submit)
        btn_submit.setOnClickListener {
            val intent = Intent(this@MainActivity,MainActivity::class.java)
            intent.putExtra("key", "Kotlin")
            startActivity(intent)
        }
    }

}

