package org.setim.foodlist.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.setim.foodlist.R
import org.setim.foodlist.homepage.HomeActivity

class OnBoardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)

        val buttonHome : Button = findViewById(R.id.button_home)
        buttonHome.setOnClickListener {
            val intent = Intent(this@OnBoardingActivity, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}