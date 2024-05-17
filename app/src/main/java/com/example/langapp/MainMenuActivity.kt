package com.example.langapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.RelativeLayout

class MainMenuActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_screen)

        val wordBlock = findViewById<RelativeLayout>(R.id.wordPracticeBlock)
        wordBlock.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, WordPracticeActivity::class.java)
            startActivity(intent)
        })

        val guessBlock = findViewById<RelativeLayout>(R.id.guessBlock)
        guessBlock.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, GuessAnimalActivity::class.java)
            startActivity(intent)
        })
    }
}