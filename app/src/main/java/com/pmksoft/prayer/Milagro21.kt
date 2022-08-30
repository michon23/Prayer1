package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro21 : AppCompatActivity() {
    lateinit var adViewmil21 : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro21)
        MobileAds.initialize(this) {}
        adViewmil21 = findViewById(R.id.adViewadViewmil21)
        val adRequest = AdRequest.Builder().build()
        adViewmil21.loadAd(adRequest)
    }
}