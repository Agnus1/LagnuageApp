package com.example.langapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class RegisterFirstActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_screen)

        val mainButton = findViewById<Button>(R.id.mainButton)
        mainButton.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, RegisterSecondActivity::class.java)
            startActivity(intent)
        })

    }
}