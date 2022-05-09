package com.example.songsforkids

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var linear1 : LinearLayout
    lateinit var image1 : ImageButton
    lateinit var name1 : Button
    lateinit var linear2 : LinearLayout
    lateinit var image2 : ImageButton
    lateinit var name2 : Button
    lateinit var linear3 : LinearLayout
    lateinit var image3 : ImageButton
    lateinit var name3 : Button
    lateinit var linear4 : LinearLayout
    lateinit var image4 : ImageButton
    lateinit var name4 : Button
    lateinit var linear5 : LinearLayout
    lateinit var image5 : ImageButton
    lateinit var name5 : Button
    lateinit var linear6 : LinearLayout
    lateinit var image6 : ImageButton
    lateinit var name6 : Button
    lateinit var linear7 : LinearLayout
    lateinit var image7 : ImageButton
    lateinit var name7 : Button
    lateinit var linear8 : LinearLayout
    lateinit var image8 : ImageButton
    lateinit var name8 : Button
    lateinit var linear9 : LinearLayout
    lateinit var image9 : ImageButton
    lateinit var name9 : Button
    lateinit var linear10 : LinearLayout
    lateinit var image10 : ImageButton
    lateinit var name10 : Button
    lateinit var linear11 : LinearLayout
    lateinit var image11 : ImageButton
    lateinit var name11 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linear1 = findViewById<LinearLayout>(R.id.linear1)
        image1 = findViewById(R.id.song1Icon)
        name1 = findViewById(R.id.song1Text)
        linear2 = findViewById<LinearLayout>(R.id.linear2)
        image2 = findViewById(R.id.song2Icon)
        name2 = findViewById(R.id.song2Text)
        linear3 = findViewById<LinearLayout>(R.id.linear3)
        image3 = findViewById(R.id.song3Icon)
        name3 = findViewById(R.id.song3Text)
        linear4 = findViewById<LinearLayout>(R.id.linear4)
        image4 = findViewById(R.id.song4Icon)
        name4 = findViewById(R.id.song4Text)
        linear5 = findViewById<LinearLayout>(R.id.linear5)
        image5 = findViewById(R.id.song5Icon)
        name5 = findViewById(R.id.song5Text)
        linear6 = findViewById<LinearLayout>(R.id.linear6)
        image6 = findViewById(R.id.song6Icon)
        name6 = findViewById(R.id.song6Text)
        linear7 = findViewById<LinearLayout>(R.id.linear7)
        image7 = findViewById(R.id.song7Icon)
        name7 = findViewById(R.id.song7Text)
        linear8 = findViewById<LinearLayout>(R.id.linear8)
        image8 = findViewById(R.id.song8Icon)
        name8 = findViewById(R.id.song8Text)
        linear9 = findViewById<LinearLayout>(R.id.linear9)
        image9 = findViewById(R.id.song9Icon)
        name9 = findViewById(R.id.song9Text)
        linear10 = findViewById<LinearLayout>(R.id.linear10)
        image10 = findViewById(R.id.song10Icon)
        name10 = findViewById(R.id.song10Text)
        linear11 = findViewById<LinearLayout>(R.id.linear11)
        image11 = findViewById(R.id.song11Icon)
        name11 = findViewById(R.id.song11Text)

        linear1.setOnClickListener {
            playVideo("gezegenler_1")
        }
        image1.setOnClickListener {
            playVideo("gezegenler_1")
        }
        name1.setOnClickListener {
            playVideo("gezegenler_1")
        }

        linear2.setOnClickListener {
            playVideo("ceviz_adam_2")
        }
        image2.setOnClickListener {
            playVideo("ceviz_adam_2")
        }
        name2.setOnClickListener {
            playVideo("ceviz_adam_2")
        }
        linear3.setOnClickListener {
            playVideo("kirmizi_balik_3")
        }
        image3.setOnClickListener {
            playVideo("kirmizi_balik_3")
        }
        name3.setOnClickListener {
            playVideo("kirmizi_balik_3")
        }

        linear4.setOnClickListener {
            playVideo("kucuk_kurbaga_4")
        }
        image4.setOnClickListener {
            playVideo("kucuk_kurbaga_4")
        }
        name4.setOnClickListener {
            playVideo("kucuk_kurbaga_4")
        }

        linear5.setOnClickListener {
            playVideo("horozumu_kacirdilar_5")
        }
        image5.setOnClickListener {
            playVideo("horozumu_kacirdilar_5")
        }
        name5.setOnClickListener {
            playVideo("horozumu_kacirdilar_5")
        }

        linear6.setOnClickListener {
            playVideo("otobusun_tekeri_6")
        }
        image6.setOnClickListener {
            playVideo("otobusun_tekeri_6")
        }
        name6.setOnClickListener {
            playVideo("otobusun_tekeri_6")
        }

        linear7.setOnClickListener {
            playVideo("sayilar_7")
        }
        image7.setOnClickListener {
            playVideo("sayilar_7")
        }
        name7.setOnClickListener {
            playVideo("sayilar_7")
        }

        linear8.setOnClickListener {
            playVideo("kukuli_bakkal_amca_8")
        }
        image8.setOnClickListener {
            playVideo("kukuli_bakkal_amca_8")
        }
        name8.setOnClickListener {
            playVideo("kukuli_bakkal_amca_8")
        }

        linear9.setOnClickListener {
            playVideo("anne_karnim_acikti_9")
        }
        image9.setOnClickListener {
            playVideo("anne_karnim_acikti_9")
        }
        name9.setOnClickListener {
            playVideo("anne_karnim_acikti_9")
        }

        linear10.setOnClickListener {
            playVideo("ali_baba_10")
        }
        image10.setOnClickListener {
            playVideo("ali_baba_10")
        }
        name10.setOnClickListener {
            playVideo("ali_baba_10")
        }

        linear11.setOnClickListener {
            playVideo("body_song_11")
        }
        image11.setOnClickListener {
            playVideo("body_song_11")
        }
        name11.setOnClickListener {
            playVideo("body_song_11")
        }

    }

    fun playVideo(videoName : String){

        val intent = Intent(this, PlayVideoActivity::class.java)
        intent.putExtra("videoName",videoName)
        startActivity(intent)
    }
}