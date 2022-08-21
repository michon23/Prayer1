package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var adViewmil12: AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro12)
        MobileAds.initialize(this) {}
        adViewmil12 = findViewById(R.id.adViewadViewmil12)
        val adRequest = AdRequest.Builder().build()
        adViewmil12.loadAd(adRequest)
    }
}