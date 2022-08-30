package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.pmksoft.prayer.databinding.ActivityPdfViewBinding

class PdfView : AppCompatActivity() {
    lateinit var adViewbible : AdView
    lateinit var binding: ActivityPdfViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityPdfViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        MobileAds.initialize(this) {}
        adViewbible = findViewById(R.id.adViewbible)
        val adRequest = AdRequest.Builder().build()
        adViewbible.loadAd(adRequest)



        val web: WebView=findViewById(R.id.vistabible_web)
        web.webViewClient = WebViewClient()

        web.loadUrl("https://prayerbibles.blogspot.com/2022/08/la-santa-biblia-antiguo-y-nuevo.html")
        web.settings.javaScriptEnabled = true
        web.settings.setSupportZoom(true)













    }





}