package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro14 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var adViewmil14 : AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro14)
        MobileAds.initialize(this) {}
        adViewmil14 = findViewById(R.id.adViewadViewmil14)
        val adRequest = AdRequest.Builder().build()
        adViewmil14.loadAd(adRequest)
    }
}