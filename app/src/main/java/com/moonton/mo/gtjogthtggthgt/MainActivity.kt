package com.moonton.mo.gtjogthtggthgt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.moonton.mo.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}