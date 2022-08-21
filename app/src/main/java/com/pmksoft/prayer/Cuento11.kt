package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
class Cuento11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var mAdView : AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cuento11)
        MobileAds.initialize(this) {}
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
    }
}