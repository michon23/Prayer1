package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro23 : AppCompatActivity() {
    lateinit var adViewmil23 : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro23)
        MobileAds.initialize(this) {}
        adViewmil23 = findViewById(R.id.adViewadViewmil23)
        val adRequest = AdRequest.Builder().build()
        adViewmil23.loadAd(adRequest)


    }
}