package com.driuft.androidkotlindebugging.ui

import android.media.MediaPlayer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.driuft.androidkotlindebugging.R




class PlaySoundActivity : AppCompatActivity() {
    private var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actvity_play_sound)

        mediaPlayer = MediaPlayer.create(this, R.raw.fanfare_trumpets)
        mediaPlayer?.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.release()
    }
}


