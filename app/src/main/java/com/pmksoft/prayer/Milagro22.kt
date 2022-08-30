package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro22 : AppCompatActivity() {
    lateinit var adViewmil22 : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro22)
        MobileAds.initialize(this) {}
        adViewmil22 = findViewById(R.id.adViewadViewmil22)
        val adRequest = AdRequest.Builder().build()
        adViewmil22.loadAd(adRequest)
    }
}