package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Milagro10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var adViewmil10 : AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.milagro10)
        MobileAds.initialize(this) {}
        adViewmil10 = findViewById(R.id.adViewadViewmil0)
        val adRequest = AdRequest.Builder().build()
        adViewmil10.loadAd(adRequest)





    }
}

