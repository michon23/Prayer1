package com.pmksoft.prayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class AudioBibLe : AppCompatActivity() {
    private lateinit var myWebView: WebView
    lateinit var AdViewaudiobible : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.audio_bib_le)

        MobileAds.initialize(this) {}
        AdViewaudiobible = findViewById(R.id.adViewaudiobible)
        val adRequest = AdRequest.Builder().build()
        AdViewaudiobible.loadAd(adRequest)





        ///////////////////////
        val webaudiobible: WebView =findViewById(R.id.webaudiobible)
        //webaudiobible.webViewClient = WebViewClient()

        //webaudiobible.loadUrl("https://prayerbibles.blogspot.com/2022/08/audio-biblia_87.html")
       // webaudiobible.settings.javaScriptEnabled = true
       // webaudiobible.settings.setSupportZoom(true)

        myWebView = findViewById(R.id.webaudiobible)
        myWebView.webViewClient = WebViewClient()
        myWebView.loadUrl("https://prayerbibles.blogspot.com/2022/08/audio-biblia_87.html")
        myWebView.settings.javaScriptEnabled = true


    }


    override fun onBackPressed() {
        // Valida si puedes regresar.
        if (myWebView.canGoBack())
            myWebView.goBack()//regresa en el historial.
        else
            super.onBackPressed()
    }



}