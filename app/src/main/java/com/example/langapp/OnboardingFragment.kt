package com.example.langapp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

const val PAGE_NUM = "page"

class OnboardingFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_onboarding, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.takeIf { it.containsKey(PAGE_NUM) }?.apply {
            val heading: TextView = view.findViewById(R.id.headingText)
            val description: TextView = view.findViewById(R.id.descriptionText)
            val image: ImageView = view.findViewById(R.id.onboardingPic)
            val dots: ImageView = view.findViewById(R.id.dots)
            val mainButton: Button = view.findViewById(R.id.mainButton)
            val smallButton: TextView = view.findViewById(R.id.smallButton)

            val activity = requireActivity()
            if (activity is OnboardingActivity) {
                smallButton.setOnClickListener(View.OnClickListener {
                    val intent = Intent(activity, LoginActivity::class.java)
                    activity.startActivity(intent)
                })
                mainButton.setOnClickListener(View.OnClickListener {
                    if (activity.viewPager.currentItem == 2) {
                        smallButton.performClick()
                    } else {
                        activity.viewPager.currentItem += 1
                    }
                })
            }

            when (getInt(PAGE_NUM)) {
                1 -> {
                    heading.text = getText(R.string.onboarding_heading_1)
                    description.text = getText(R.string.onboarding_description_1)
                    mainButton.text = getText(R.string.onboarding_button_1)
                    image.setImageResource(R.drawable.onboarding_1)
                    dots.setImageResource(R.drawable.slider_1)
                }
                2 -> {
                    heading.text = getText(R.string.onboarding_heading_2)
                    description.text = getText(R.string.onboarding_description_2)
                    mainButton.text = getText(R.string.onboarding_button_2)
                    image.setImageResource(R.drawable.onboarding_2)
                    dots.setImageResource(R.drawable.slider_2)
                }
                3 -> {
                    heading.text = getText(R.string.onboarding_heading_3)
                    description.text = getText(R.string.onboarding_description_3)
                    mainButton.text = getText(R.string.onboarding_button_3)
                    image.setImageResource(R.drawable.onboarding_3)
                    dots.setImageResource(R.drawable.slider_3)
                }
            }


        }
    }

}