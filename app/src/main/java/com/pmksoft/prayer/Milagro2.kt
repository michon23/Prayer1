package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var adViewmil2 : AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro2)
        MobileAds.initialize(this) {}
        adViewmil2 = findViewById(R.id.adViewadViewmil02)
        val adRequest = AdRequest.Builder().build()
        adViewmil2.loadAd(adRequest)
    }
}