package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView

class Oraciones_infantiles : AppCompatActivity() {
    lateinit var adViewOraconinfantil : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oraciones_infantiles)
        MobileAds.initialize(this) {}
        adViewOraconinfantil = findViewById(R.id.adViewOraconinfantil)
        val adRequest = AdRequest.Builder().build()
        adViewOraconinfantil.loadAd(adRequest)

    }
}