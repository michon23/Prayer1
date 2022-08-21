package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.bumptech.glide.Glide
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView



class Versiculos : AppCompatActivity() {
    lateinit var adViewverisiculo : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_versiculos)
        MobileAds.initialize(this) {}
        adViewverisiculo = findViewById(R.id.adViewverisiculo)
        val adRequest = AdRequest.Builder().build()
        adViewverisiculo.loadAd(adRequest)






    }
}