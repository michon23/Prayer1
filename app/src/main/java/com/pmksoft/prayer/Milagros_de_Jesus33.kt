package com.pmksoft.prayer

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.google.firebase.ktx.Firebase
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfig
import com.google.firebase.remoteconfig.ktx.remoteConfigSettings


class Milagros_de_Jesus33 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var mAdView : AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_milagros_de_jesus33)
        //remote config


        MobileAds.initialize(this) {}
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
        val milagro1:Button=findViewById(R.id.milagro1)

        milagro1.setOnClickListener {
            var lanzar_texto_milagros = Intent(this, Milagro1::class.java)
           startActivity(lanzar_texto_milagros)
        }

        ////////////////////////////////////////////////////
        val milagro2:Button=findViewById(R.id.milagro2)
        milagro2.setOnClickListener {
          var milagro2 = Intent(this, Milagro2::class.java)
          startActivity(milagro2)

        }

        val milagro3:Button=findViewById(R.id.milagro3)
        milagro3.setOnClickListener {
          var milagro3 = Intent(this, Milagro3::class.java)
          startActivity(milagro3)

        }
        val milagro4:Button=findViewById(R.id.milagro4)
        milagro4.setOnClickListener {
            var milagro4 = Intent(this, Milagro4::class.java)
            startActivity(milagro4)

        }
        val milagro5:Button=findViewById(R.id.milagro5)
        milagro5.setOnClickListener {
            var milagro5 = Intent(this, Milagro5::class.java)
            startActivity(milagro5)

        }

        val milagro6:Button=findViewById(R.id.milagro6)
        milagro6.setOnClickListener {
            var milagro6 = Intent(this, Milagro6::class.java)
            startActivity(milagro6)

        }
        val milagro7:Button=findViewById(R.id.milagro7)
        milagro7.setOnClickListener {
            var milagro7 = Intent(this, Milagro7::class.java)
            startActivity(milagro7)

        }
        val milagro8:Button=findViewById(R.id.milagro8)
        milagro8.setOnClickListener {
            var milagro8 = Intent(this, Milagro8::class.java)
            startActivity(milagro8)

        }

        val milagro9:Button=findViewById(R.id.milagro9)
        milagro9.setOnClickListener {
            var milagro9 = Intent(this, Milagro9::class.java)
            startActivity(milagro9)

        }
        val milagro10:Button=findViewById(R.id.milagro10)
        milagro10.setOnClickListener {
            var milagro10 = Intent(this, Milagro10::class.java)
            startActivity(milagro10)

        }
        val milagro11:Button=findViewById(R.id.milagro11)
        milagro11.setOnClickListener {
            var milagro11 = Intent(this, Milagro11::class.java)
            startActivity(milagro11)

        }
        val milagro12:Button=findViewById(R.id.milagro12)
        milagro12.setOnClickListener {
            var milagro12 = Intent(this, Milagro12::class.java)
            startActivity(milagro12)

        }
        val milagro13:Button=findViewById(R.id.milagro13)
        milagro13.setOnClickListener {
            var milagro13 = Intent(this, Milagro13::class.java)
            startActivity(milagro13)

        }
        val milagro14:Button=findViewById(R.id.milagro14)
        milagro14.setOnClickListener {
            var milagro14 = Intent(this, Milagro14::class.java)
            startActivity(milagro14)

        }
        val milagro15:Button=findViewById(R.id.milagro15)
        milagro15.setOnClickListener {
            var milagro15 = Intent(this, Milagro15::class.java)
            startActivity(milagro15)

        }




    }

    private fun displayWelcomeMessage() {

    }
}