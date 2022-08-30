package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro16 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var adViewmil16 : AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro16)
        MobileAds.initialize(this) {}
        adViewmil16 = findViewById(R.id.adViewadViewmil16)
        val adRequest = AdRequest.Builder().build()
        adViewmil16.loadAd(adRequest)
    }
}