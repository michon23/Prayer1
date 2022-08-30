package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro19 : AppCompatActivity() {
    lateinit var adViewmil19 : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro19)
        MobileAds.initialize(this) {}
        adViewmil19 = findViewById(R.id.adViewadViewmil19)
        val adRequest = AdRequest.Builder().build()
        adViewmil19.loadAd(adRequest)


    }
}