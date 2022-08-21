package com.pmksoft.prayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase

private lateinit var analytics: FirebaseAnalytics
class MainActivity : AppCompatActivity() {
    lateinit var mAdView : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        analytics = Firebase.analytics

        MobileAds.initialize(this) {}
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)



        val oraciondayimg: ImageView= findViewById(R.id.img_oracion_diaria)
        val boton_oracion_day: Button= findViewById(R.id.bt_oracion_diaria)
        var url_oracionday="https://i.ibb.co/mCTyx42/prayer-gdb3efdcea-1280.jpg"
        Glide.with(this).load(url_oracionday).placeholder(R.drawable.ic_launcher_foreground).into(oraciondayimg)


        oraciondayimg.setOnClickListener{
        var lanzar_oraciones_diarias = Intent(this, Oracion_del_dia::class.java)
           startActivity(lanzar_oraciones_diarias)
          }
        boton_oracion_day.setOnClickListener {
            var lanzar_oraciones_diarias = Intent(this, Oracion_del_dia::class.java)
            startActivity(lanzar_oraciones_diarias)
        }



/////////////////////////////////////////////////////////////////////////////////////////
        val oracioninfantil: ImageView= findViewById(R.id.img_oracion_infantil_prin)
        val boton_oracion_infantil: Button= findViewById(R.id.bt_como_leer_bl)
        var url_or_infantil="https://i.ibb.co/qg2Dpm6/child-praying-hands-g57beda3d7-1920.jpg"
        Glide.with(this).load(url_or_infantil).placeholder(R.drawable.ic_launcher_foreground).into(oracioninfantil)

        oracioninfantil.setOnClickListener{
            var lanzar_oracion_infantil = Intent(this, Oraciones_infantiles::class.java)
            startActivity(lanzar_oracion_infantil)

        }

        boton_oracion_infantil.setOnClickListener {
            var lanzar_oracion_infantil = Intent(this, Oraciones_infantiles::class.java)
            startActivity(lanzar_oracion_infantil)
        }


        /////////////////////////////////////////////////////

        val versiculo_diario: ImageView= findViewById(R.id.img_versiculo_day_prin)
        val boton_versiculo: Button= findViewById(R.id.bt_versiculo_day_prin)
        var versi_day="https://i.ibb.co/b3xrSy1/bible-g64b5972d6-1920.jpg"
        Glide.with(this).load(versi_day).placeholder(R.drawable.ic_launcher_foreground).into(versiculo_diario)

        versiculo_diario.setOnClickListener {
            var lanzar_versiculos = Intent(this, Versiculos::class.java)
            startActivity(lanzar_versiculos)
        }
        boton_versiculo.setOnClickListener {
            var lanzar_versiculos = Intent(this, Versiculos::class.java)
            startActivity(lanzar_versiculos)
        }


///////////////////////////////////////////////////////////////////////////////////////////////
     //
        val cuentos_infantiles: ImageView= findViewById(R.id.img_cuentos_infantiles_prin)
        val boton_cuentos_infantiles: Button=findViewById(R.id.bt_cuentos_infantiles_prin)
        var url_cuento_infantil="https://i.ibb.co/KwbQ6pQ/moises-g3c11ef9a2-1920.jpg"
        Glide.with(this).load(url_cuento_infantil).placeholder(R.drawable.ic_launcher_foreground).into(cuentos_infantiles)

        cuentos_infantiles.setOnClickListener{
            var lanzar_cuentosinfantile = Intent(this, Cuentos_infantiles::class.java)
            startActivity(lanzar_cuentosinfantile)
        }

        boton_cuentos_infantiles.setOnClickListener {
            var lanzar_cuentosinfantile = Intent(this, Cuentos_infantiles::class.java)
            startActivity(lanzar_cuentosinfantile)

        }

///////////////////////////////////////////////////////////////////
        //https://i.ibb.co/h9yXsRb/cross-g032941e5d-1920.jpg

        val img_33_milagros: ImageButton= findViewById(R.id.img_33_milagros_jesus)
        val boton_33_milagros: Button= findViewById(R.id.bt_33_milagros_jesus)
        var url_biblia="https://i.ibb.co/h9yXsRb/cross-g032941e5d-1920.jpg"
        Glide.with(this).load(url_biblia).placeholder(R.drawable.ic_launcher_foreground).into(img_33_milagros)

        img_33_milagros.setOnClickListener{
            var lanzar_33_milagros = Intent(this, Milagros_de_Jesus33::class.java)
            startActivity(lanzar_33_milagros)
        }
        boton_33_milagros.setOnClickListener {
            var lanzar_33_milagros = Intent(this, Milagros_de_Jesus33::class.java)
            startActivity(lanzar_33_milagros)
        }


//////////////////////////////////////////////////////////////////////

        var btimg_v_de_jesus:ImageButton= findViewById(R.id.img_vida_jesus_princ)
        var bt_vida_jesus:Button= findViewById(R.id.bt_jesus_princ)
        var url_jesus="https://i.ibb.co/sHphDQk/jesus-christ-g5deda9843-1920.jpg"
        Glide.with(this).load(url_jesus).placeholder(R.drawable.ic_launcher_foreground).into(btimg_v_de_jesus)
        btimg_v_de_jesus.setOnClickListener{
            var lanzar_33_milagros = Intent(this, Vida_Jesus_de_Nazaret::class.java)
            startActivity(lanzar_33_milagros)
        }
        bt_vida_jesus.setOnClickListener {
            var lanzar_vida_jesus = Intent(this, Vida_Jesus_de_Nazaret::class.java)
            startActivity(lanzar_vida_jesus)
        }










    }
}