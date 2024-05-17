package com.example.langapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_screen)

        val navArrow = findViewById<ImageView>(R.id.navArrow)
        navArrow.setOnClickListener(View.OnClickListener {
            finish()
        })

        val mainButton = findViewById<Button>(R.id.mainButton)
        mainButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, RegisterFirstActivity::class.java)
            startActivity(intent)
            finish()
        })
        
    }
}