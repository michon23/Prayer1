package com.pmksoft.prayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.bumptech.glide.Glide
import com.google.android.gms.ads.*
import com.google.android.gms.ads.rewarded.RewardItem
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.iid.FirebaseInstanceIdReceiver
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal
import com.google.firebase.ktx.Firebase
import java.util.*

private lateinit var analytics: FirebaseAnalytics

class MainActivity : AppCompatActivity() {


    lateinit var mAdView : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        val vistainicio = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vistainicio.setKeepOnScreenCondition{false}

        analytics = Firebase.analytics

        MobileAds.initialize(this) {}
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)



        //////////////////////////////////////////
        var uniqueID = UUID.randomUUID().toString()


////////////////////////////////////////////////////////////////////////////
        val oraciondayimg: ImageView= findViewById(R.id.img_oracion_diaria)
        val boton_oracion_day: Button= findViewById(R.id.bt_oracion_diaria)
        var url_oracionday="https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/imagenes_cuentos_para_ni%C3%B1os%2Foracion_de_dia.jpg?alt=media&token=c11eed91-c68d-4630-81f5-77b9b6691f22"
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
        var url_or_infantil="https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/imagenes_cuentos_para_ni%C3%B1os%2Fbible.jpg?alt=media&token=cbbc4ee9-64ca-4cf8-854b-6e7916e5b9a8"
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
        var versi_day="https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/imagenes_cuentos_para_ni%C3%B1os%2Fversiculos1.jpg?alt=media&token=2a303433-fcce-4bf0-bdcb-4bf80940d435"
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
        var url_cuento_infantil="https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/imagenes_cuentos_para_ni%C3%B1os%2Fcuentos_ninos.jpg?alt=media&token=f0dc4b3e-769e-42eb-b1bc-4cfbe3498bbc"
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
        var url_biblia="https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/imagenes_cuentos_para_ni%C3%B1os%2Fmilagros_principal.jpg?alt=media&token=fb02f9ad-582d-4932-8c6b-aab44ef0036e"
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
        var url_jesus="https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/imagenes_cuentos_para_ni%C3%B1os%2Fversuculos.jpg?alt=media&token=3815ca53-b7a9-4162-992c-9aec411838a5"
        Glide.with(this).load(url_jesus).placeholder(R.drawable.ic_launcher_foreground).into(btimg_v_de_jesus)
        btimg_v_de_jesus.setOnClickListener{
            var lanzar_33_milagros = Intent(this, Vida_Jesus_de_Nazaret::class.java)
            startActivity(lanzar_33_milagros)
        }
        bt_vida_jesus.setOnClickListener {
            var lanzar_vida_jesus = Intent(this, Vida_Jesus_de_Nazaret::class.java)
            startActivity(lanzar_vida_jesus)
        }
        ////////Menu












    }
    /*override fun onCreateOptionsMenu(menu:Menu?): Boolean{
        menuInflater.inflate(R.menu.menu, menu)


        return super.onCreateOptionsMenu(menu)
    }
    ///////////////seleccion de menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.favorito-> Toast.makeText(this, "Favorito", Toast.LENGTH_SHORT).show()
            R.id.compartir-> Toast.makeText(this, "comparti", Toast.LENGTH_SHORT).show()
            R.id.politica_privacidad-> Toast.makeText(this, "politica_privacidad", Toast.LENGTH_SHORT).show()
            R.id.sugerencias-> Toast.makeText(this, "sugerencias", Toast.LENGTH_SHORT).show()
        }


        return super.onOptionsItemSelected(item)

    }*/


}