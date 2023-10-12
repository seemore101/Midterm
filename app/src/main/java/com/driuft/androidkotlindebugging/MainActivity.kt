package com.driuft.androidkotlindebugging

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.ui.*

class MainActivity : AppCompatActivity() {

    private val challengeOneButton: Button get() = findViewById(R.id.challenge_one)
    private val challengeTwoButton: Button get() = findViewById(R.id.challenge_two)
    private val challengeThreeButton: Button get() = findViewById(R.id.challenge_three)
    private val challengeFourButton: Button get() = findViewById(R.id.challenge_four)
    private val challengeFiveButton: Button get() = findViewById(R.id.challenge_five)
    private val challengeSixButton: Button get() = findViewById(R.id.challenge_six)
    private val playSoundButton: Button get() = findViewById(R.id.play_sound_button)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        challengeOneButton.setOnClickListener { launchHelloWorldActivity() }
        challengeTwoButton.setOnClickListener { launchNumSumActivity() }
        challengeThreeButton.setOnClickListener { launchCurrentDayActivity() }
        challengeFourButton.setOnClickListener { launchRandomColorActivity() }
        challengeFiveButton.setOnClickListener { launchPrintListActivity() }
        challengeSixButton.setOnClickListener { launchFavoriteNumberActivity() }
        playSoundButton.setOnClickListener { playSound() }
    }

    private fun launchHelloWorldActivity() {
        val i = Intent(this, HelloWorldActivity::class.java)
        startActivity(i)
    }

    private fun launchNumSumActivity() {
        val i = Intent(this, NumSumActivity::class.java)
        startActivity(i)
    }

    private fun launchCurrentDayActivity() {
        val i = Intent(this, CurrentDayActivity::class.java)
        startActivity(i)
    }

    private fun launchRandomColorActivity() {
        val i = Intent(this, RandomColorActivity::class.java)
        startActivity(i)
    }

    private fun launchPrintListActivity() {
        val i = Intent(this, PrintListActivity::class.java)
        startActivity(i)
    }

    private fun launchFavoriteNumberActivity() {
        val i = Intent(this, FavoriteNumber::class.java)
        startActivity(i)
    }

    private fun playSound() {
        val mediaPlayer = MediaPlayer.create(this, R.raw.fanfare_trumpets)
        mediaPlayer.start()
    }
}
