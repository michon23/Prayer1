package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro26 : AppCompatActivity() {
    lateinit var adViewmil26 : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro26)
        MobileAds.initialize(this) {}
        adViewmil26 = findViewById(R.id.adViewadViewmil26)
        val adRequest = AdRequest.Builder().build()
        adViewmil26.loadAd(adRequest)
    }
}