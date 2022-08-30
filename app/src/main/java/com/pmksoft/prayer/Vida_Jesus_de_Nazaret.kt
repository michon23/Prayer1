package com.pmksoft.prayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import org.w3c.dom.Text

class Vida_Jesus_de_Nazaret : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var adViewjesmilagro: AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vida_jesus_de_nazaret)
        MobileAds.initialize(this) {}
        adViewjesmilagro = findViewById(R.id.adViewjesmilagro)
        val adRequest = AdRequest.Builder().build()
        adViewjesmilagro.loadAd(adRequest)

        var texto_versiculo: TextView = findViewById(R.id.text_versiculo)
        var jugar: Button = findViewById(R.id.btn_generar_versiculo)
        var boton_compartir: ImageButton = findViewById(R.id.bt_compartir_GenVer)


        var versiculo1: String = getString(R.string.ver_1)
        var versiculo2: String = getString(R.string.ver_2)
        var versiculo3: String = getString(R.string.ver_3)
        var versiculo4: String = getString(R.string.ver_4)
        var versiculo5: String = getString(R.string.ver_5)
        var versiculo6: String = getString(R.string.ver_6)
        var versiculo7: String = getString(R.string.ver7)
        var versiculo8: String = getString(R.string.ver_8)
        var versiculo9: String = getString(R.string.ver_9)
        var versiculo10: String = getString(R.string.ver_10)
        var versiculo11: String = getString(R.string.ver_11)
        var versiculo12: String = getString(R.string.ver_12)
        var versiculo13: String = getString(R.string.ver_13)
        var versiculo14: String = getString(R.string.ver_14)
        var versiculo15: String = getString(R.string.ver_15)
        var versiculo16: String = getString(R.string.ver_16)
        var versiculo17: String = getString(R.string.ver_17)
        var versiculo18: String = getString(R.string.ver_18)
        var versiculo19: String = getString(R.string.ver_19)
        var versiculo20: String = getString(R.string.ver_20)
        var versiculo21: String = getString(R.string.ver_21)
        var versiculo22: String = getString(R.string.ver_22)
        var versiculo23: String = getString(R.string.ver_23)
        var versiculo24: String = getString(R.string.ver_24)
        var versiculo25: String = getString(R.string.ver_25)
        var versiculo26: String = getString(R.string.ver_26)
        var versiculo27: String = getString(R.string.ver_27)
        var versiculo28: String = getString(R.string.ver_28)
        var versiculo29: String = getString(R.string.ver_29)
        var versiculo30: String = getString(R.string.ver_30)
        var versiculo31: String = getString(R.string.ver_31)
        var versiculo32: String = getString(R.string.ver_32)
        var versiculo33: String = getString(R.string.ver_33)
        var versiculo34: String = getString(R.string.ver_34)
        var versiculo35: String = getString(R.string.ver_35)
        var versiculo36: String = getString(R.string.ver_36)
        var versiculo37: String = getString(R.string.ver_37)
        var versiculo38: String = getString(R.string.ver_38)
        var versiculo39: String = getString(R.string.ver_39)
        var versiculo40: String = getString(R.string.ver_40)
        var versiculo41: String = getString(R.string.ver_41)
        var versiculo42: String = getString(R.string.ver_42)
        var versiculo43: String = getString(R.string.ver_43)
        var versiculo44: String = getString(R.string.ver_44)
        var versiculo45: String = getString(R.string.ver_45)
        var versiculo46: String = getString(R.string.ver_46)
        var versiculo47: String = getString(R.string.ver_47)
        var versiculo48: String = getString(R.string.ver_48)
        var versiculo49: String = getString(R.string.ver49)
        var versiculo50: String = getString(R.string.ver_50)
        var versiculo51: String = getString(R.string.ver_51)
        var versiculo52: String = getString(R.string.ver_52)
        var versiculo53: String = getString(R.string.ver_53)
        var versiculo54: String = getString(R.string.ver_54)
        var versiculo55: String = getString(R.string.ver_55)
        var versiculo56: String = getString(R.string.ver_56)
        var versiculo57: String = getString(R.string.ver_57)
        var versiculo58: String = getString(R.string.ver_58)
        var versiculo59: String = getString(R.string.ver_59)
        var versiculo60: String = getString(R.string.ver_60)
        var versiculo61: String = getString(R.string.ver_61)
        var versiculo62: String = getString(R.string.ver_62)
        var versiculo63: String = getString(R.string.ver_63)
        var versiculo64: String = getString(R.string.ver_64)
        var versiculo65: String = getString(R.string.ver_65)
        var versiculo66: String = getString(R.string.ver_66)
        var versiculo67: String = getString(R.string.ver_67)
        var versiculo68: String = getString(R.string.ver_68)
        var versiculo69: String = getString(R.string.ver_69)
        var versiculo70: String = getString(R.string.ver_70)
        var versiculo71: String = getString(R.string.ver_71)
        var versiculo72: String = getString(R.string.ver_72)
        var versiculo73: String = getString(R.string.ver_73)
        var versiculo74: String = getString(R.string.ver_74)
        var versiculo75: String = getString(R.string.ver_75)
        var versiculo76: String = getString(R.string.ver_76)
        var versiculo77: String = getString(R.string.ver_77)
        var versiculo78: String = getString(R.string.ver_78)
        var versiculo79: String = getString(R.string.ver_79)
        var versiculo80: String = getString(R.string.ver_80)
        var versiculo81: String = getString(R.string.ver_81)
        var versiculo82: String = getString(R.string.ver_82)
        var versiculo83: String = getString(R.string.ver_83)
        var versiculo84: String = getString(R.string.ver_84)
        var versiculo85: String = getString(R.string.ver_85)
        var versiculo86: String = getString(R.string.ver_86)
        var versiculo87: String = getString(R.string.ver_87)
        var versiculo88: String = getString(R.string.ver_88)
        var versiculo89: String = getString(R.string.ver_89)
        var versiculo90: String = getString(R.string.ver_90)


        val azar = 1..90








        jugar.setOnClickListener {
            val generado = azar.random()


            when (generado) {
                1 -> texto_versiculo.text = versiculo1
                2 -> texto_versiculo.text = versiculo2
                3 -> texto_versiculo.text = versiculo3
                4 -> texto_versiculo.text = versiculo4
                5 -> texto_versiculo.text = versiculo5
                6 -> texto_versiculo.text = versiculo6
                7 -> texto_versiculo.text = versiculo7
                8 -> texto_versiculo.text = versiculo8
                9 -> texto_versiculo.text = versiculo9
                10 -> texto_versiculo.text = versiculo10
                11 -> texto_versiculo.text = versiculo11
                12 -> texto_versiculo.text = versiculo12
                13 -> texto_versiculo.text = versiculo13
                14 -> texto_versiculo.text = versiculo14
                15 -> texto_versiculo.text = versiculo15
                16 -> texto_versiculo.text = versiculo16
                17 -> texto_versiculo.text = versiculo17
                18 -> texto_versiculo.text = versiculo18
                19 -> texto_versiculo.text = versiculo19
                20 -> texto_versiculo.text = versiculo20
                21 -> texto_versiculo.text = versiculo21
                22 -> texto_versiculo.text = versiculo22
                23 -> texto_versiculo.text = versiculo23
                24 -> texto_versiculo.text = versiculo24
                25 -> texto_versiculo.text = versiculo25
                26 -> texto_versiculo.text = versiculo26
                27 -> texto_versiculo.text = versiculo27
                28 -> texto_versiculo.text = versiculo28
                29 -> texto_versiculo.text = versiculo29
                30 -> texto_versiculo.text = versiculo30
                31 -> texto_versiculo.text = versiculo31
                32 -> texto_versiculo.text = versiculo32
                33 -> texto_versiculo.text = versiculo33
                34 -> texto_versiculo.text = versiculo34
                35 -> texto_versiculo.text = versiculo35
                36 -> texto_versiculo.text = versiculo36
                37 -> texto_versiculo.text = versiculo37
                38 -> texto_versiculo.text = versiculo38
                39 -> texto_versiculo.text = versiculo39
                40 -> texto_versiculo.text = versiculo40
                41 -> texto_versiculo.text = versiculo41
                42 -> texto_versiculo.text = versiculo42
                43 -> texto_versiculo.text = versiculo43
                44 -> texto_versiculo.text = versiculo44
                45 -> texto_versiculo.text = versiculo45
                46 -> texto_versiculo.text = versiculo46
                47 -> texto_versiculo.text = versiculo47
                48 -> texto_versiculo.text = versiculo48
                49 -> texto_versiculo.text = versiculo49
                50 -> texto_versiculo.text = versiculo50
                51 -> texto_versiculo.text = versiculo51
                52 -> texto_versiculo.text = versiculo52
                53 -> texto_versiculo.text = versiculo53
                54 -> texto_versiculo.text = versiculo54
                55 -> texto_versiculo.text = versiculo55
                56 -> texto_versiculo.text = versiculo56
                57 -> texto_versiculo.text = versiculo57
                58 -> texto_versiculo.text = versiculo58
                59 -> texto_versiculo.text = versiculo59
                60 -> texto_versiculo.text = versiculo60
                61 -> texto_versiculo.text = versiculo61
                62 -> texto_versiculo.text = versiculo62
                63 -> texto_versiculo.text = versiculo63
                64 -> texto_versiculo.text = versiculo64
                65 -> texto_versiculo.text = versiculo65
                66 -> texto_versiculo.text = versiculo66
                67 -> texto_versiculo.text = versiculo67
                68 -> texto_versiculo.text = versiculo68
                69 -> texto_versiculo.text = versiculo69
                70 -> texto_versiculo.text = versiculo70
                71 -> texto_versiculo.text = versiculo71
                72 -> texto_versiculo.text = versiculo72
                73 -> texto_versiculo.text = versiculo73
                74 -> texto_versiculo.text = versiculo74
                75 -> texto_versiculo.text = versiculo75
                76 -> texto_versiculo.text = versiculo76
                77 -> texto_versiculo.text = versiculo77
                78 -> texto_versiculo.text = versiculo78
                79 -> texto_versiculo.text = versiculo79
                80 -> texto_versiculo.text = versiculo80
                81 -> texto_versiculo.text = versiculo81
                82 -> texto_versiculo.text = versiculo82
                83 -> texto_versiculo.text = versiculo83
                84 -> texto_versiculo.text = versiculo84
                85 -> texto_versiculo.text = versiculo85
                86 -> texto_versiculo.text = versiculo86
                87 -> texto_versiculo.text = versiculo87
                88 -> texto_versiculo.text = versiculo88
                89 -> texto_versiculo.text = versiculo89
                90 -> texto_versiculo.text = versiculo90


            }



            boton_compartir.setOnClickListener {

                var verBibl = generado

                if (verBibl == 1) {
                    texto_versiculo.text = versiculo1
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_1))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_1))
                    startActivity(shareIntent)
                } else if (verBibl == 2) {
                    texto_versiculo.text = versiculo2
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_2))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_2))
                    startActivity(shareIntent)

                } else if (verBibl == 3) {
                    texto_versiculo.text = versiculo3
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_3))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_3))
                    startActivity(shareIntent)

                } else if (verBibl == 4) {
                    texto_versiculo.text = versiculo4
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_4))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_4))
                    startActivity(shareIntent)

                } else if (verBibl == 5) {
                    texto_versiculo.text = versiculo5
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_5))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_5))
                    startActivity(shareIntent)

                } else if (verBibl == 6) {
                    texto_versiculo.text = versiculo6
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_6))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_6))
                    startActivity(shareIntent)

                } else if (verBibl == 7) {
                    texto_versiculo.text = versiculo7
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver7))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver7))
                    startActivity(shareIntent)

                } else if (verBibl == 8) {
                    texto_versiculo.text = versiculo8
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_8))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_8))
                    startActivity(shareIntent)

                } else if (verBibl == 9) {
                    texto_versiculo.text = versiculo9
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_9))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_9))
                    startActivity(shareIntent)

                } else if (verBibl == 10) {
                    texto_versiculo.text = versiculo10
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_10))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_10))
                    startActivity(shareIntent)

                } else if (verBibl == 11) {
                    texto_versiculo.text = versiculo11
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_11))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_11))
                    startActivity(shareIntent)

                } else if (verBibl == 12) {
                    texto_versiculo.text = versiculo12
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_12))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_12))
                    startActivity(shareIntent)

                } else if (verBibl == 13) {
                    texto_versiculo.text = versiculo13
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_13))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_13))
                    startActivity(shareIntent)

                } else if (verBibl == 14) {
                    texto_versiculo.text = versiculo14
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_14))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_14))
                    startActivity(shareIntent)

                } else if (verBibl == 15) {
                    texto_versiculo.text = versiculo15
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_15))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_15))
                    startActivity(shareIntent)

                } else if (verBibl == 16) {
                    texto_versiculo.text = versiculo16
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_16))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_16))
                    startActivity(shareIntent)

                } else if (verBibl == 17) {
                    texto_versiculo.text = versiculo17
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_17))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_17))
                    startActivity(shareIntent)

                } else if (verBibl == 18) {
                    texto_versiculo.text = versiculo18
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_18))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_18))
                    startActivity(shareIntent)

                } else if (verBibl == 19) {
                    texto_versiculo.text = versiculo19
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_19))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_19))
                    startActivity(shareIntent)

                } else if (verBibl == 20) {
                    texto_versiculo.text = versiculo20
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_20))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_20))
                    startActivity(shareIntent)

                } else if (verBibl == 21) {
                    texto_versiculo.text = versiculo21
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_21))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_21))
                    startActivity(shareIntent)

                } else if (verBibl == 22) {
                    texto_versiculo.text = versiculo22
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_22))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_22))
                    startActivity(shareIntent)

                } else if (verBibl == 23) {
                    texto_versiculo.text = versiculo23
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_23))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_23))
                    startActivity(shareIntent)

                } else if (verBibl == 24) {
                    texto_versiculo.text = versiculo24
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_24))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_24))
                    startActivity(shareIntent)

                } else if (verBibl == 25) {
                    texto_versiculo.text = versiculo25
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_25))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_25))
                    startActivity(shareIntent)

                } else if (verBibl == 26) {
                    texto_versiculo.text = versiculo26
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_26))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_26))
                    startActivity(shareIntent)

                } else if (verBibl == 27) {
                    texto_versiculo.text = versiculo27
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_27))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_27))
                    startActivity(shareIntent)

                } else if (verBibl == 28) {
                    texto_versiculo.text = versiculo28
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_28))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_28))
                    startActivity(shareIntent)

                } else if (verBibl == 29) {
                    texto_versiculo.text = versiculo29
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_29))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_29))
                    startActivity(shareIntent)

                } else if (verBibl == 30) {
                    texto_versiculo.text = versiculo30
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_30))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_30))
                    startActivity(shareIntent)

                } else if (verBibl == 31) {
                    texto_versiculo.text = versiculo31
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_31))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_31))
                    startActivity(shareIntent)

                } else if (verBibl == 32) {
                    texto_versiculo.text = versiculo32
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_32))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_32))
                    startActivity(shareIntent)

                } else if (verBibl == 33) {
                    texto_versiculo.text = versiculo33
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_33))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_33))
                    startActivity(shareIntent)

                } else if (verBibl == 34) {
                    texto_versiculo.text = versiculo34
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_34))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_34))
                    startActivity(shareIntent)

                } else if (verBibl == 35) {
                    texto_versiculo.text = versiculo35
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_35))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_35))
                    startActivity(shareIntent)

                } else if (verBibl == 36) {
                    texto_versiculo.text = versiculo36
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_36))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_36))
                    startActivity(shareIntent)

                } else if (verBibl == 37) {
                    texto_versiculo.text = versiculo37
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_37))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_37))
                    startActivity(shareIntent)

                } else if (verBibl == 38) {
                    texto_versiculo.text = versiculo38
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_38))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_38))
                    startActivity(shareIntent)

                } else if (verBibl == 39) {
                    texto_versiculo.text = versiculo39
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_39))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_39))
                    startActivity(shareIntent)

                } else if (verBibl == 40) {
                    texto_versiculo.text = versiculo40
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_40))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_40))
                    startActivity(shareIntent)

                } else if (verBibl == 41) {
                    texto_versiculo.text = versiculo41
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_41))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_41))
                    startActivity(shareIntent)

                } else if (verBibl == 42) {
                    texto_versiculo.text = versiculo42
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_42))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_42))
                    startActivity(shareIntent)

                } else if (verBibl == 43) {
                    texto_versiculo.text = versiculo43
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_43))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_43))
                    startActivity(shareIntent)

                } else if (verBibl == 44) {
                    texto_versiculo.text = versiculo44
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_44))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_44))
                    startActivity(shareIntent)

                } else if (verBibl == 45) {
                    texto_versiculo.text = versiculo45
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_45))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_45))
                    startActivity(shareIntent)

                } else if (verBibl == 46) {
                    texto_versiculo.text = versiculo46
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_46))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_46))
                    startActivity(shareIntent)

                } else if (verBibl == 47) {
                    texto_versiculo.text = versiculo47
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_47))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_47))
                    startActivity(shareIntent)

                } else if (verBibl == 48) {
                    texto_versiculo.text = versiculo48
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_48))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_48))
                    startActivity(shareIntent)

                } else if (verBibl == 49) {
                    texto_versiculo.text = versiculo49
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver49))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver49))
                    startActivity(shareIntent)

                } else if (verBibl == 50) {
                    texto_versiculo.text = versiculo50
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_50))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_50))
                    startActivity(shareIntent)

                } else if (verBibl == 51) {
                    texto_versiculo.text = versiculo51
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_51))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_51))
                    startActivity(shareIntent)

                } else if (verBibl == 52) {
                    texto_versiculo.text = versiculo52
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_52))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_52))
                    startActivity(shareIntent)

                } else if (verBibl == 53) {
                    texto_versiculo.text = versiculo53
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_53))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_53))
                    startActivity(shareIntent)

                } else if (verBibl == 54) {
                    texto_versiculo.text = versiculo54
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_54))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_54))
                    startActivity(shareIntent)

                } else if (verBibl == 55) {
                    texto_versiculo.text = versiculo55
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_55))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_55))
                    startActivity(shareIntent)

                } else if (verBibl == 56) {
                    texto_versiculo.text = versiculo56
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_56))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_56))
                    startActivity(shareIntent)

                } else if (verBibl == 57) {
                    texto_versiculo.text = versiculo57
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_57))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_57))
                    startActivity(shareIntent)

                } else if (verBibl == 58) {
                    texto_versiculo.text = versiculo58
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_58))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_58))
                    startActivity(shareIntent)

                } else if (verBibl == 59) {
                    texto_versiculo.text = versiculo59
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_59))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_59))
                    startActivity(shareIntent)

                } else if (verBibl == 60) {
                    texto_versiculo.text = versiculo60
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_60))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_60))
                    startActivity(shareIntent)

                } else if (verBibl == 61) {
                    texto_versiculo.text = versiculo61
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_61))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_61))
                    startActivity(shareIntent)

                } else if (verBibl == 62) {
                    texto_versiculo.text = versiculo62
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_62))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_62))
                    startActivity(shareIntent)

                } else if (verBibl == 63) {
                    texto_versiculo.text = versiculo63
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_63))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_63))
                    startActivity(shareIntent)

                } else if (verBibl == 64) {
                    texto_versiculo.text = versiculo64
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_64))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_64))
                    startActivity(shareIntent)

                } else if (verBibl == 65) {
                    texto_versiculo.text = versiculo65
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_65))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_65))
                    startActivity(shareIntent)

                } else if (verBibl == 66) {
                    texto_versiculo.text = versiculo66
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_66))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_66))
                    startActivity(shareIntent)

                } else if (verBibl == 67) {
                    texto_versiculo.text = versiculo67
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_67))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_67))
                    startActivity(shareIntent)

                } else if (verBibl == 68) {
                    texto_versiculo.text = versiculo68
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_68))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_68))
                    startActivity(shareIntent)

                } else if (verBibl == 69) {
                    texto_versiculo.text = versiculo69
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_69))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_69))
                    startActivity(shareIntent)

                } else if (verBibl == 70) {
                    texto_versiculo.text = versiculo70
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_70))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_70))
                    startActivity(shareIntent)

                } else if (verBibl == 71) {
                    texto_versiculo.text = versiculo71
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_71))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_71))
                    startActivity(shareIntent)

                } else if (verBibl == 72) {
                    texto_versiculo.text = versiculo72
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_72))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_72))
                    startActivity(shareIntent)

                } else if (verBibl == 73) {
                    texto_versiculo.text = versiculo73
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_73))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_73))
                    startActivity(shareIntent)

                } else if (verBibl == 74) {
                    texto_versiculo.text = versiculo74
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_74))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_74))
                    startActivity(shareIntent)

                } else if (verBibl == 75) {
                    texto_versiculo.text = versiculo75
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_75))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_75))
                    startActivity(shareIntent)

                } else if (verBibl == 76) {
                    texto_versiculo.text = versiculo76
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_76))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_76))
                    startActivity(shareIntent)

                } else if (verBibl == 77) {
                    texto_versiculo.text = versiculo77
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_77))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_77))
                    startActivity(shareIntent)

                } else if (verBibl == 78) {
                    texto_versiculo.text = versiculo78
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_78))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_78))
                    startActivity(shareIntent)

                } else if (verBibl == 79) {
                    texto_versiculo.text = versiculo79
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_79))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_79))
                    startActivity(shareIntent)

                } else if (verBibl == 80) {
                    texto_versiculo.text = versiculo80
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_80))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_80))
                    startActivity(shareIntent)


                } else if (verBibl == 81) {
                    texto_versiculo.text = versiculo81
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_81))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_81))
                    startActivity(shareIntent)


                } else if (verBibl == 82) {
                    texto_versiculo.text = versiculo82
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_82))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_82))
                    startActivity(shareIntent)


                } else if (verBibl == 83) {
                    texto_versiculo.text = versiculo83
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_83))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_83))
                    startActivity(shareIntent)


                } else if (verBibl == 84) {
                    texto_versiculo.text = versiculo84
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_84))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_84))
                    startActivity(shareIntent)


                } else if (verBibl == 85) {
                    texto_versiculo.text = versiculo85
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_85))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_85))
                    startActivity(shareIntent)


                } else if (verBibl == 86) {
                    texto_versiculo.text = versiculo86
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_86))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_86))
                    startActivity(shareIntent)


                } else if (verBibl == 87) {
                    texto_versiculo.text = versiculo87
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_87))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_87))
                    startActivity(shareIntent)


                } else if (verBibl == 88) {
                    texto_versiculo.text = versiculo88
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_88))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_88))
                    startActivity(shareIntent)


                } else if (verBibl == 89) {
                    texto_versiculo.text = versiculo89
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_89))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_89))
                    startActivity(shareIntent)


                } else if (verBibl == 90) {
                    texto_versiculo.text = versiculo90
                    val intent = Intent().apply {

                        action = Intent.ACTION_SEND
                        putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_90))
                        type = "text/plain"
                    }
                    val shareIntent =
                        Intent.createChooser(intent, resources.getString(R.string.ver_90))
                    startActivity(shareIntent)


                }


            }


        }


    }
}