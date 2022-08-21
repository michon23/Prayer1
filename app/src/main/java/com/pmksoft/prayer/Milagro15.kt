package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro15 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var adViewmil15 : AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro15)
        MobileAds.initialize(this) {}
        adViewmil15 = findViewById(R.id.adViewadViewmil15)
        val adRequest = AdRequest.Builder().build()
        adViewmil15.loadAd(adRequest)
    }
}