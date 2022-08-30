package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro25 : AppCompatActivity() {
    lateinit var adViewmil25 : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro25)
        MobileAds.initialize(this) {}
        adViewmil25 = findViewById(R.id.adViewadViewmil25)
        val adRequest = AdRequest.Builder().build()
        adViewmil25.loadAd(adRequest)

    }
}