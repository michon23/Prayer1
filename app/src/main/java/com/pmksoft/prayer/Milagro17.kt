package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro17 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var adViewmil17 : AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro17)
        MobileAds.initialize(this) {}
        adViewmil17 = findViewById(R.id.adViewadViewmil17)
        val adRequest = AdRequest.Builder().build()
        adViewmil17.loadAd(adRequest)
    }
}