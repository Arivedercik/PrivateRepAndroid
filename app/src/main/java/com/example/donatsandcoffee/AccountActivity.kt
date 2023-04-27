package com.example.donatsandcoffee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.account_activity)
        var cart = findViewById<ImageView>(R.id.cart_icon)
        cart.setOnClickListener()
        {
            val intent = Intent(this,CartActivity::class.java)
            startActivity(intent)
        }
        var home = findViewById<ImageView>(R.id.home_icon)
        home.setOnClickListener()
        {
            val intent1 = Intent(this,HomeActivity::class.java)
            startActivity(intent1)
        }
    }
}