package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var adViewmil13 : AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro13)
        MobileAds.initialize(this) {}
        adViewmil13 = findViewById(R.id.adViewmil13)
        val adRequest = AdRequest.Builder().build()
        adViewmil13.loadAd(adRequest)
    }
}