package com.example.songsforkids

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import java.nio.file.Paths


class PlayVideoActivity : AppCompatActivity() {

    lateinit var video: VideoView
    lateinit var nextBtn : ImageButton
    lateinit var previousBtn : ImageButton
    lateinit var closeBtn : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.video_play)
        video = findViewById<View>(R.id.videoView) as VideoView
        nextBtn = findViewById(R.id.nextBtn)
        previousBtn = findViewById(R.id.previousBtn)
        closeBtn = findViewById(R.id.closeBtn)
        var videoList = listOf<String>("gezegenler_1","ceviz_adam_2","kirmizi_balik_3","kucuk_kurbaga_4","horozumu_kacirdilar_5","otobusun_tekeri_6","sayilar_7","kukuli_bakkal_amca_8","anne_karnim_acikti_9","ali_baba_10","body_song_11")
        var currentVideo :String?
        val videoName=intent.getStringExtra("videoName")
        currentVideo = videoName

        nextBtn.setOnClickListener {
            var indexOfCurrentVideo  = videoList.indexOf(currentVideo)
            if(videoList.count()==indexOfCurrentVideo+1){
                var indexOfCurrentVideo  = videoList.indexOf(currentVideo)
                currentVideo = videoList.get(0)
                var fileplace = "android.resource://" + packageName + "/raw/"+"gezegenler_1"
                video.setVideoURI(Uri.parse(fileplace))
                video.setMediaController(MediaController(this))
                video.start()
            }else{
                var indexOfCurrentVideo  = videoList.indexOf(currentVideo)
                currentVideo = videoList.get(indexOfCurrentVideo+1)
                var fileplace = "android.resource://" + packageName + "/raw/"+currentVideo

                video.setVideoURI(Uri.parse(fileplace))
                video.setMediaController(MediaController(this))
                video.start()
            }
        }
        previousBtn.setOnClickListener {
            var indexOfCurrentVideo  = videoList.indexOf(currentVideo)
            if(indexOfCurrentVideo==0){
                var indexOfCurrentVideo  = videoList.indexOf(currentVideo)
                currentVideo = videoList.get(10)
                var fileplace = "android.resource://" + packageName + "/raw/"+"body_song_11"
                video.setVideoURI(Uri.parse(fileplace))
                video.setMediaController(MediaController(this))
                video.start()
            }else{
                var indexOfCurrentVideo  = videoList.indexOf(currentVideo)
                currentVideo = videoList.get(indexOfCurrentVideo-1)
                var fileplace = "android.resource://" + packageName + "/raw/"+currentVideo

                video.setVideoURI(Uri.parse(fileplace))
                video.setMediaController(MediaController(this))
                video.start()
            }
        }
        closeBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }





        var fileplace = "android.resource://" + packageName + "/raw/"+videoName

        video.setVideoURI(Uri.parse(fileplace))
        video.setMediaController(MediaController(this))
        video.start()

    }

}