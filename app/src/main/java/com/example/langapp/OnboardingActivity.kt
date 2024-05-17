package com.example.langapp

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2


class OnboardingActivity: FragmentActivity() {

    lateinit var viewPager: ViewPager2
    private lateinit var adapter: OnboardingAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.oboarding_screen)

        adapter = OnboardingAdapter(this)
        viewPager = findViewById(R.id.viewPager)
        viewPager.adapter = adapter
    }

}