package com.example.langapp

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class GuessAnimalActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.guess_the_animal)

        val navArrow = findViewById<ImageView>(R.id.navArrow)
        navArrow.setOnClickListener(View.OnClickListener {
            finish()
        })
    }
}