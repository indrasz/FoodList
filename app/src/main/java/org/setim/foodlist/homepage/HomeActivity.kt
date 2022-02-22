package org.setim.foodlist.homepage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment
import org.setim.foodlist.R
import org.setim.foodlist.databinding.ActivityHomeBinding
import org.setim.foodlist.homepage.fragment.CartFragment
import org.setim.foodlist.homepage.fragment.HomeFragment
import org.setim.foodlist.homepage.fragment.ProfileFragment

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val fragmentHome = HomeFragment()
        val fragmentCart = CartFragment()
        val fragmentProfile = ProfileFragment()
        setFragment(fragmentHome)

        val iv_menu1 = findViewById<ImageView>(R.id.iv_menu1)
        val iv_menu2 = findViewById<ImageView>(R.id.iv_menu2)
        val iv_menu3 = findViewById<ImageView>(R.id.iv_menu3)

        iv_menu1.setOnClickListener {
            setFragment(fragmentHome)
            changeIcon(iv_menu1, R.drawable.ic_home_active)
            changeIcon(iv_menu2, R.drawable.ic_cart)
            changeIcon(iv_menu3, R.drawable.ic_profile)
        }
        iv_menu2.setOnClickListener {
            setFragment(fragmentCart)
            changeIcon(iv_menu1, R.drawable.ic_home)
            changeIcon(iv_menu2, R.drawable.ic_cart_active)
            changeIcon(iv_menu3, R.drawable.ic_profile)
        }
        iv_menu3.setOnClickListener {
            setFragment(fragmentProfile)
            changeIcon(iv_menu1, R.drawable.ic_home)
            changeIcon(iv_menu2, R.drawable.ic_cart)
            changeIcon(iv_menu3, R.drawable.ic_profile_active)
        }

    }

    private fun setFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }
    private fun changeIcon(imageView: ImageView, int : Int){
        imageView.setImageResource(int)
    }
}