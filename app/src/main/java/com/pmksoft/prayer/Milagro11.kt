package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var adViewmil11 : AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro11)
        MobileAds.initialize(this) {}
        adViewmil11 = findViewById(R.id.adViewadViewmil11)
        val adRequest = AdRequest.Builder().build()
        adViewmil11.loadAd(adRequest)
    }
}