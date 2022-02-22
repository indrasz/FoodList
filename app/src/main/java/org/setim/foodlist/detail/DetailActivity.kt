package org.setim.foodlist.detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.setim.foodlist.R
import org.setim.foodlist.homepage.HomeActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val name = intent.getStringExtra("name") ?: ""
        val description = intent.getStringExtra("description") ?: ""
        val price = intent.getIntExtra("price", 0)
        val rating = intent.getStringExtra("rating") ?: ""
        val image = intent.getIntExtra("image", 0)

        val idImage = findViewById<ImageView>(R.id.img_item_photo)
        idImage.setImageResource(image)

        val idName = findViewById<TextView>(R.id.tv_name)
        idName.text = name

        val idDesc = findViewById<TextView>(R.id.tv_desc)
        idDesc.text = description

        val idPrice = findViewById<TextView>(R.id.tv_price)
        idPrice.text = price.toString()

        val idRating = findViewById<TextView>(R.id.tv_rating)
        idRating.text = rating

        val btnBack : ImageView = findViewById(R.id.btn_back)

        btnBack.setOnClickListener {
            val intent = Intent(this@DetailActivity, HomeActivity::class.java)
            startActivity(intent)
        }
    }

}