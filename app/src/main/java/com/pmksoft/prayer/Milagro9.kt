package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var adViewmil9 : AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro9)
        MobileAds.initialize(this) {}
        adViewmil9 = findViewById(R.id.adViewadViewmil09)
        val adRequest = AdRequest.Builder().build()
        adViewmil9.loadAd(adRequest)
    }
}