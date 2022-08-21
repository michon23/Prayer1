package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var adViewmil5 : AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro5)
        MobileAds.initialize(this) {}
        adViewmil5 = findViewById(R.id.adViewadViewmil05)
        val adRequest = AdRequest.Builder().build()
        adViewmil5.loadAd(adRequest)
    }
}