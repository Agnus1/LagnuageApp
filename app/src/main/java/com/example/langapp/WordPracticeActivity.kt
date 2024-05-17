package com.example.langapp

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class WordPracticeActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.word_practice)

        val navArrow = findViewById<ImageView>(R.id.navArrow)
        navArrow.setOnClickListener(View.OnClickListener {
            finish()
        })
    }
}