package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var adViewmil6 : AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro6)
        MobileAds.initialize(this) {}
        adViewmil6 = findViewById(R.id.adViewadViewmil06)
        val adRequest = AdRequest.Builder().build()
        adViewmil6.loadAd(adRequest)
    }
}