package com.example.donatsandcoffee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cart_activity)
        var home = findViewById<ImageView>(R.id.home_icon)
        home.setOnClickListener()
        {
            val intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        }
        var user = findViewById<ImageView>(R.id.user_icon)
        user.setOnClickListener()
        {
            val intent1 = Intent(this,AccountActivity::class.java)
            startActivity(intent1)
        }
    }
}