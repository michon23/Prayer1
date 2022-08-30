package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro18 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var adViewmil18 : AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro18)
        MobileAds.initialize(this) {}
        adViewmil18 = findViewById(R.id.adViewadViewmil18)
        val adRequest = AdRequest.Builder().build()
        adViewmil18.loadAd(adRequest)
    }
}