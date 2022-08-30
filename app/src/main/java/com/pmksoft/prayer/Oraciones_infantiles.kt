package com.pmksoft.prayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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

        val btn_Web: Button= findViewById(R.id.bton_inten_web)
        btn_Web.setOnClickListener {
            var lanzar_web_bible = Intent(this, PdfView::class.java)
            startActivity(lanzar_web_bible)

        }

        val boton_audio_bible:Button=findViewById(R.id.boton_audio_bible)
        boton_audio_bible.setOnClickListener {
            var lanzar_web_bible_audio = Intent(this, AudioBibLe::class.java)
            startActivity(lanzar_web_bible_audio)

        }


    }
}