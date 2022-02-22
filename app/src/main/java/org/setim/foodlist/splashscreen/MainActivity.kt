package org.setim.foodlist.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.setim.foodlist.onboarding.OnBoardingActivity
import org.setim.foodlist.databinding.ActivityMainBinding
import org.setim.foodlist.utils.SPLASH_SCREEN_TAG

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        object : Thread(){
            override fun run() {
               try {
                   sleep(3000)
                   startActivity(Intent(baseContext, OnBoardingActivity::class.java))
                   finish()
               } catch (ex: Exception) {
                   Log.d(SPLASH_SCREEN_TAG, ex.message.toString())
               }
            }
        }.start()
    }
}