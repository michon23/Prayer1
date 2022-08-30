package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro24 : AppCompatActivity() {
    lateinit var adViewmil24 : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro24)
        MobileAds.initialize(this) {}
        adViewmil24 = findViewById(R.id.adViewadViewmil24)
        val adRequest = AdRequest.Builder().build()
        adViewmil24.loadAd(adRequest)
    }
}