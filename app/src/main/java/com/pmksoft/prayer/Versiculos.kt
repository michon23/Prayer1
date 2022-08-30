package com.pmksoft.prayer

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.pmksoft.prayer.databinding.ActivityVersiculosBinding


class Versiculos : AppCompatActivity() {
    lateinit var adViewverisiculo : AdView
    lateinit var binding: ActivityVersiculosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityVersiculosBinding.inflate(layoutInflater)
       setContentView(binding.root)


        MobileAds.initialize(this) {}
        adViewverisiculo = findViewById(R.id.adViewverisiculo)
        val adRequest = AdRequest.Builder().build()
        adViewverisiculo.loadAd(adRequest)
        binding.tvVersiculo1.setOnClickListener{
            ver_1()
        }
        binding.tvVersiculo2.setOnClickListener{
            ver_2()
        }
        binding.tvVersiculo3.setOnClickListener{
            ver_3()
        }
        binding.tvVersiculo4.setOnClickListener{
            ver_4()
        }
        binding.tvVersiculo5.setOnClickListener {
            ver_5()
        }
        binding.tvVersiculo6.setOnClickListener {
            ver_6()

        }
        binding.tvVersiculo7.setOnClickListener {
            ver_7()

        }
        binding.tvVersiculo8.setOnClickListener {
            ver_8()

        }
        binding.tvVersiculo9.setOnClickListener {
            ver_9()

        }
        binding.tvVersiculo10.setOnClickListener {
            ver_10()

        }
        binding.tvVersiculo11.setOnClickListener {
            ver_11()

        }
        binding.tvVersiculo12.setOnClickListener {
            ver_12()

        }
        binding.tvVersiculo13.setOnClickListener {
            ver_13()

        }
        binding.tvVersiculo14.setOnClickListener {
            ver_14()
        }
        binding.tvVersiculo15.setOnClickListener {
            ver_15()
        }
        binding.tvVersiculo16.setOnClickListener {
            ver_16()
        }
        binding.tvVersiculo17.setOnClickListener {
            ver_17()
        }
        binding.tvVersiculo18.setOnClickListener {
            ver_18()
        }
        binding.tvVersiculo19.setOnClickListener {
            ver_19()
        }
        binding.tvVersiculo20.setOnClickListener {
            ver_20()
        }
        binding.tvVersiculo21.setOnClickListener {
            ver_21()
        }
        binding.tvVersiculo22.setOnClickListener {
            ver_22()
        }
        binding.tvVersiculo23.setOnClickListener {
            ver_23()
        }
        binding.tvVersiculo24.setOnClickListener {
            ver_24()
        }
        binding.tvVersiculo25.setOnClickListener {
            ver_25()
        }
        binding.tvVersiculo26.setOnClickListener {
            ver_26()
        }
        binding.tvVersiculo27.setOnClickListener {
            ver_27()
        }
        binding.tvVersiculo28.setOnClickListener {
            ver_28()
        }
        binding.tvVersiculo29.setOnClickListener {
            ver_29()
        }
        binding.tvVersiculo30.setOnClickListener {
            ver_30()
        }
        binding.tvVersiculo31.setOnClickListener {
            ver_31()
        }
        binding.tvVersiculo32.setOnClickListener {
            ver_32()
        }
        binding.tvVersiculo33.setOnClickListener {
            ver_33()
        }
        binding.tvVersiculo34.setOnClickListener {
            ver_34()

        }
        binding.tvVersiculo35.setOnClickListener {
            ver_35()

        }
        binding.tvVersiculo36.setOnClickListener{
            ver_36()
        }














    }



    private fun shareversiculoColosenses_3_23_24() {
        val intent = Intent().apply {

            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.Colosenses_3_23_24))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.Colosenses_3_23_24))
        startActivity(shareIntent)
    }

    private fun shareversiculo_Salmo_23_6() {
        val intent = Intent().apply {

            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.Salmo_23_6))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.Salmo_23_6))
        startActivity(shareIntent)
    }
    private fun shareversiculo_Hebreos_12_14() {
        val intent = Intent().apply {

            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.Hebreos_12_14))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.Hebreos_12_14))
        startActivity(shareIntent)



}
    private fun shareversiculo_Corintios1_15_22() {

        val intent = Intent().apply {

            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.Corintios1_15_22))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.Corintios1_15_22))
        startActivity(shareIntent)
}

    private fun shareversiculo_Corintios2_5_1() {
        val intent = Intent().apply {

            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.Corintios2_5_1))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.Corintios2_5_1))
        startActivity(shareIntent)
    }
    private fun shareversiculo_Romanos14_8() {
        val intent = Intent().apply {

            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.Romanos14_8))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.Romanos14_8))
        startActivity(shareIntent)
    }
    private fun shareversiculo_Hebreos_12_1() {
        val intent = Intent().apply {

            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.Hebreos_12_1))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.Hebreos_12_1))
        startActivity(shareIntent)
    }
    private fun share_Deuteronomio_8_3() {
        val intent = Intent().apply {

            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.Deuteronomio_8_3))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.Deuteronomio_8_3))
        startActivity(shareIntent)
    }
    private fun share_Levítico_20_26() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.Levítico_20_26))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.Levítico_20_26))
        startActivity(shareIntent)
    }
    private fun share_Génesis_1_29() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.Génesis_1_29))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.Génesis_1_29))
        startActivity(shareIntent)
    }
    private fun share_Salmos_18_2() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.Salmos_18_2))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.Salmos_18_2))
        startActivity(shareIntent)
    }
    private fun ver_1() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_1))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_1))
        startActivity(shareIntent)
    }
    private fun ver_2() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_2))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_2))
        startActivity(shareIntent)

}


    private fun ver_3() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_3))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_3))
        startActivity(shareIntent)

}
    private fun ver_4() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_4))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_4))
        startActivity(shareIntent)

    }
    private fun ver_5() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_5))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_5))
        startActivity(shareIntent)

    }
    private fun ver_6() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_6))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_6))
        startActivity(shareIntent)

    }
    private fun ver_7() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver7))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver7))
        startActivity(shareIntent)

    }
    private fun ver_8() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_8))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_8))
        startActivity(shareIntent)

    }
    private fun ver_9() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_9))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_9))
        startActivity(shareIntent)

    }
    private fun ver_10() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_10))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_10))
        startActivity(shareIntent)

    }
    private fun ver_11() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_11))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_11))
        startActivity(shareIntent)

    }
    private fun ver_12() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_12))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_12))
        startActivity(shareIntent)

    }
    private fun ver_13() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_14))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_15))
        startActivity(shareIntent)

    }
    private fun ver_14() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_14))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_14))
        startActivity(shareIntent)

    }
    private fun ver_15() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_15))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_16))
        startActivity(shareIntent)

    }
    private fun ver_16() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_16))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_16))
        startActivity(shareIntent)

    }
    private fun ver_17() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_17))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_17))
        startActivity(shareIntent)

    }
    private fun ver_18() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_18))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_18))
        startActivity(shareIntent)

    }
    private fun ver_19() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_19))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_19))
        startActivity(shareIntent)

    }
    private fun ver_20() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_20))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_20))
        startActivity(shareIntent)

    }
    private fun ver_21() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_21))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_21))
        startActivity(shareIntent)

    }
    private fun ver_22() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_22))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_22))
        startActivity(shareIntent)

    }
    private fun ver_23() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_23))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_23))
        startActivity(shareIntent)

    }
    private fun ver_24() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_24))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_24))
        startActivity(shareIntent)

    }
    private fun ver_25() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_25))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_25))
        startActivity(shareIntent)

    }
    private fun ver_26() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_26))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_26))
        startActivity(shareIntent)

    }
    private fun ver_27() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_27))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_27))
        startActivity(shareIntent)

    }
    private fun ver_28() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_28))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_28))
        startActivity(shareIntent)

    }
    private fun ver_29() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_29))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_29))
        startActivity(shareIntent)

    }
    private fun ver_30() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_30))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_30))
        startActivity(shareIntent)

    }
    private fun ver_31() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_31))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_31))
        startActivity(shareIntent)

    }
    private fun ver_32() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_32))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_32))
        startActivity(shareIntent)

    }
    private fun ver_33() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_33))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_33))
        startActivity(shareIntent)

    }
    private fun ver_34() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_34))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_34))
        startActivity(shareIntent)

    }
    private fun ver_35() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_35))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_35))
        startActivity(shareIntent)

    }
    private fun ver_36() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_36))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_36))
        startActivity(shareIntent)

    }
    private fun ver_37() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_37))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_37))
        startActivity(shareIntent)

    }
    private fun ver_38() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_38))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_38))
        startActivity(shareIntent)

    }
    private fun ver_39() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_39))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_39))
        startActivity(shareIntent)

    }
    private fun ver_40() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_40))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_40))
        startActivity(shareIntent)

    }
    private fun ver_41() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_41))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_41))
        startActivity(shareIntent)

    }
    private fun ver_42() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_42))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_42))
        startActivity(shareIntent)

    }
    private fun ver_43() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_43))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_43))
        startActivity(shareIntent)

    }
    private fun ver_44() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_44))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_44))
        startActivity(shareIntent)

    }
    private fun ver_45() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_45))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_45))
        startActivity(shareIntent)

    }
    private fun ver_46() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_46))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_46))
        startActivity(shareIntent)

    }
    private fun ver_47() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_47))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_47))
        startActivity(shareIntent)

    }
    private fun ver_48() {
        val intent = Intent().apply {

            action= Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, resources.getString(R.string.ver_48))
            type="text/plain"
        }
        val shareIntent = Intent.createChooser(intent, resources.getString(R.string.ver_48))
        startActivity(shareIntent)

    }


}