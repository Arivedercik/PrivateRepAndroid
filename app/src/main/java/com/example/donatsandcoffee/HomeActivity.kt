package com.example.donatsandcoffee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity)
        var cart = findViewById<ImageView>(R.id.cart_icon)
        cart.setOnClickListener()
        {
            val intent = Intent(this,CartActivity::class.java)
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