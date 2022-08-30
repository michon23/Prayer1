package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro20 : AppCompatActivity() {
    lateinit var adViewmil20 : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro20)
        MobileAds.initialize(this) {}
        adViewmil20 = findViewById(R.id.adViewadViewmil20)
        val adRequest = AdRequest.Builder().build()
        adViewmil20.loadAd(adRequest)
    }
}