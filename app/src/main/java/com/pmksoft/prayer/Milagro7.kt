package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro7)
        MobileAds.initialize(this) {}
        var adViewmil7 : AdView = findViewById(R.id.adViewadViewmil07)
        val adRequest = AdRequest.Builder().build()
        adViewmil7.loadAd(adRequest)
    }
}