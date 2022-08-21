package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var adViewmil4 : AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro4)
        MobileAds.initialize(this) {}
        adViewmil4 = findViewById(R.id.adViewadViewmil04)
        val adRequest = AdRequest.Builder().build()
        adViewmil4.loadAd(adRequest)
    }
}