package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView

class Vida_Jesus_de_Nazaret : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var adViewjesmilagro : AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vida_jesus_de_nazaret)
        MobileAds.initialize(this) {}
        adViewjesmilagro = findViewById(R.id.adViewjesmilagro)
        val adRequest = AdRequest.Builder().build()
        adViewjesmilagro.loadAd(adRequest)

    }
}