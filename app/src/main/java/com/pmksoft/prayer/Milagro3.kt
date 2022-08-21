package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var adViewmil3 : AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro3)
        MobileAds.initialize(this) {}
        adViewmil3 = findViewById(R.id.adViewadViewmil03)
        val adRequest = AdRequest.Builder().build()
        adViewmil3.loadAd(adRequest)
    }
}