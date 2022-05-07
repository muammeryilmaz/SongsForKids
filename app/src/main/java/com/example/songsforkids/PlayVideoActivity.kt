package com.example.songsforkids

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import java.nio.file.Paths


class PlayVideoActivity : AppCompatActivity() {

    lateinit var video: VideoView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.video_play)
        video = findViewById<View>(R.id.videoView) as VideoView

        val videoName=intent.getStringExtra("videoName")

        var fileplace = "android.resource://" + packageName + "/raw/"+videoName

        video.setVideoURI(Uri.parse(fileplace))
        video.setMediaController(MediaController(this))
        video.start()

    }

}