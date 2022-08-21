package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var adViewmil8 : AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro8)
        MobileAds.initialize(this) {}
        adViewmil8= findViewById(R.id.adViewadViewmil08)
        val adRequest = AdRequest.Builder().build()
        adViewmil8.loadAd(adRequest)
    }
}