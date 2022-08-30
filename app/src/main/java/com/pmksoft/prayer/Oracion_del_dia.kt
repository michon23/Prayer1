package com.pmksoft.prayer

import android.os.Bundle
import android.provider.ContactsContract
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds
import com.google.type.DateTime
import java.text.SimpleDateFormat
import java.util.*


class Oracion_del_dia : AppCompatActivity() {
    lateinit var ads_oracion_del_dia : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oracion_del_dia)
        /////////////////////////////////////////////////////
        MobileAds.initialize(this) {}
        ads_oracion_del_dia = findViewById(R.id.ads_oracion_del_dia)
        val adRequest = AdRequest.Builder().build()
        ads_oracion_del_dia.loadAd(adRequest)
        /////////////////////////////////////////////////////
        var cuadro_oracion:TextView=findViewById(R.id.oracion_del_dia_)

        //toma la fecha del dispositivo
        val calendario: Calendar = Calendar.getInstance()
        calendario.add(Calendar.DAY_OF_MONTH, Calendar.TUESDAY)
        val day= calendario.get(Calendar.DAY_OF_MONTH)
        val dia = day









        //////////////////////////////////////////////////////////////////////////
        val dia1: String= getString(R.string.dia1)
       ///////////////////////////////////////////////////////////////////////////
        val dia2: String= getString(R.string.dia2)
        ///////////////////////////////////////////////////////////////////////////
        val dia3: String= getString(R.string.dia3)
        ///////////////////////////////////////////////////////////////////////////
        val dia4: String= getString(R.string.dia4)
        ///////////////////////////////////////////////////////////////////////////
        val dia5: String= getString(R.string.dia5)
        ///////////////////////////////////////////////////////////////////////////
        val dia6: String= getString(R.string.dia6)
        ///////////////////////////////////////////////////////////////////////////
        val dia7: String= getString(R.string.dia7)
        ///////////////////////////////////////////////////////////////////////////
        val dia8: String= getString(R.string.dia8)
        ///////////////////////////////////////////////////////////////////////////
        val dia9: String= getString(R.string.dia9)
        ///////////////////////////////////////////////////////////////////////////
        val dia10: String= getString(R.string.dia10)
        ///////////////////////////////////////////////////////////////////////////
        val dia11: String= getString(R.string.dia11)
        ///////////////////////////////////////////////////////////////////////////
        val dia12: String= getString(R.string.dia12)
        ///////////////////////////////////////////////////////////////////////////
        val dia13: String= getString(R.string.dia13)
        ///////////////////////////////////////////////////////////////////////////
        val dia14: String= getString(R.string.dia14)
        ///////////////////////////////////////////////////////////////////////////
        val dia15: String= getString(R.string.dia1)
        ///////////////////////////////////////////////////////////////////////////
        val dia16: String= getString(R.string.dia16)
        ///////////////////////////////////////////////////////////////////////////
        val dia17: String= getString(R.string.dia17)
        ///////////////////////////////////////////////////////////////////////////
        val dia18: String= getString(R.string.dia18)
        ///////////////////////////////////////////////////////////////////////////
        val dia19: String= getString(R.string.dia19)
        ///////////////////////////////////////////////////////////////////////////
        val dia20: String= getString(R.string.dia20)
        ///////////////////////////////////////////////////////////////////////////
        val dia21: String= getString(R.string.dia21)
        ///////////////////////////////////////////////////////////////////////////
        val dia22: String= getString(R.string.dia22)
        ///////////////////////////////////////////////////////////////////////////
        val dia23: String= getString(R.string.dia23)
        ///////////////////////////////////////////////////////////////////////////
        val dia24: String= getString(R.string.dia24)
        ///////////////////////////////////////////////////////////////////////////
        val dia25: String= getString(R.string.dia25)
        ///////////////////////////////////////////////////////////////////////////
        val dia26: String= getString(R.string.dia26)
        ///////////////////////////////////////////////////////////////////////////
        val dia27: String= getString(R.string.dia27)
        ///////////////////////////////////////////////////////////////////////////
        val dia28: String= getString(R.string.dia28)
        ///////////////////////////////////////////////////////////////////////////
        val dia29: String= getString(R.string.dia29)
        ///////////////////////////////////////////////////////////////////////////
        val dia30: String= getString(R.string.dia30)
        ///////////////////////////////////////////////////////////////////////////
        val dia31: String= getString(R.string.dia31)
        ///////////////////////////////////////////////////////////////////////////


        when(dia){
            1->cuadro_oracion.text=dia1
            2->cuadro_oracion.text=dia2
            3->cuadro_oracion.text=dia3
            4->cuadro_oracion.text=dia4
            5->cuadro_oracion.text=dia5
            6->cuadro_oracion.text=dia6
            7->cuadro_oracion.text=dia7
            8->cuadro_oracion.text=dia8
            9->cuadro_oracion.text=dia9
            10->cuadro_oracion.text=dia10
            11->cuadro_oracion.text=dia11
            12->cuadro_oracion.text=dia12
            13->cuadro_oracion.text=dia13
            14->cuadro_oracion.text=dia14
            15->cuadro_oracion.text=dia15
            16->cuadro_oracion.text=dia16
            17->cuadro_oracion.text=dia17
            18->cuadro_oracion.text=dia18
            19->cuadro_oracion.text=dia19
            20->cuadro_oracion.text=dia20
            21->cuadro_oracion.text=dia21
            22->cuadro_oracion.text=dia22
            23->cuadro_oracion.text=dia23
            24->cuadro_oracion.text=dia24
            25->cuadro_oracion.text=dia25
            26->cuadro_oracion.text=dia26
            27->cuadro_oracion.text=dia27
            28->cuadro_oracion.text=dia28
            29->cuadro_oracion.text=dia29
            30->cuadro_oracion.text=dia30
            31->cuadro_oracion.text=dia31

        }






}
}