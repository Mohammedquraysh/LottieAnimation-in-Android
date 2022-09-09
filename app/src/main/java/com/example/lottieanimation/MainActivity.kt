package com.example.lottieanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    lateinit var lottieAnimationView: LottieAnimationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lottieAnimationView = findViewById(R.id.lottieAnimationView)
        //lottieAnimationView.pauseAnimation()
    }

}