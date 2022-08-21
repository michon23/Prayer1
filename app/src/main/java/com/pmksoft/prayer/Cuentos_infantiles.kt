package com.pmksoft.prayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
class Cuentos_infantiles : AppCompatActivity() {
    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuentos_infantiles)

        MobileAds.initialize(this) {}
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
//
       val cuento1: Button = findViewById(R.id.cuento1)
        cuento1.setOnClickListener {
            var lcuento1 = Intent(this, Cuento1::class.java)
            startActivity(lcuento1)

        }


        val cuento2: Button = findViewById(R.id.cuento2)
        cuento2.setOnClickListener {
            var lcuento2 = Intent(this, Cuento2::class.java)
            startActivity(lcuento2)

        }


        val cuento3: Button = findViewById(R.id.cuento3)
        cuento3.setOnClickListener {
            var lcuento3 = Intent(this, Cuento3::class.java)
            startActivity(lcuento3)
        }


        val cuento4: Button = findViewById(R.id.cuento4)
        cuento4.setOnClickListener {
            var lcuento4 = Intent(this, Cuento4::class.java)
            startActivity(lcuento4)
        }


        val cuento5: Button = findViewById(R.id.cuento5)
        cuento5.setOnClickListener {
            var lcuento5 = Intent(this, Cuento5::class.java)
            startActivity(lcuento5)
        }


        val cuento6: Button = findViewById(R.id.cuento6)
        cuento6.setOnClickListener {
            var lcuento6 = Intent(this, Cuento6::class.java)
            startActivity(lcuento6)
        }


        val cuento7: Button = findViewById(R.id.cuento7)
        cuento7.setOnClickListener {
            var lcuento7 = Intent(this, Cuento7::class.java)
            startActivity(lcuento7)
        }


        val cuento8: Button = findViewById(R.id.cuento8)
        cuento8.setOnClickListener {
            var lcuento8 = Intent(this, Cuento8::class.java)
            startActivity(lcuento8)
        }


        val cuento9: Button = findViewById(R.id.cuento9)
        cuento9.setOnClickListener {
            var lcuento9 = Intent(this, Cuento9::class.java)
            startActivity(lcuento9)
        }

        val cuento10: Button = findViewById(R.id.cuento10)
        cuento10.setOnClickListener {
            var lcuento10 = Intent(this, Cuento10::class.java)
            startActivity(lcuento10)
        }


        val cuento11: Button = findViewById(R.id.cuento11)
        cuento11.setOnClickListener {
            var lcuento11 = Intent(this, Cuento11::class.java)
            startActivity(lcuento11)
        }


        val cuento12: Button = findViewById(R.id.cuento12)
        cuento12.setOnClickListener {
            var lcuento12 = Intent(this, Cuento12::class.java)
            startActivity(lcuento12)
        }


        val cuento13: Button = findViewById(R.id.cuento13)
        cuento13.setOnClickListener {
            var lcuento13 = Intent(this, Cuento13::class.java)
            startActivity(lcuento13)
        }


        val cuento14: Button = findViewById(R.id.cuento14)
        cuento14.setOnClickListener {
            var lcuento14 = Intent(this, Cuento14::class.java)
            startActivity(lcuento14)
        }


        val cuento15: Button = findViewById(R.id.cuento15)
        cuento15.setOnClickListener {
            var lcuento15 = Intent(this, Cuento15::class.java)
            startActivity(lcuento15)
        }









    }
}

