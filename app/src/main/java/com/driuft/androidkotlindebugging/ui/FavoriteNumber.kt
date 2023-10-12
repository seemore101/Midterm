package com.driuft.androidkotlindebugging.ui

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R
import kotlin.random.Random

class FavoriteNumber : AppCompatActivity() {

    private val favoriteNumber: TextView by lazy { findViewById(R.id.favorite_number) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite_number)

        // Generate a random number between 1 and 9
        val randomNum = Random.nextInt(1, 10)

        // Display the random number
        favoriteNumber.text = randomNum.toString()
    }
}
