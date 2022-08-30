package com.pmksoft.prayer

import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
class Cuento12 : AppCompatActivity() {
    lateinit var playboton_cuento12: ImageButton
    lateinit var pauseboton_cuento_12: ImageButton
    lateinit var mediaPlayer: MediaPlayer
    lateinit var mAdViewcuento12: AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cuento12)
        MobileAds.initialize(this) {}
        mAdViewcuento12 = findViewById(R.id.adViewcuentocuento12)
        val adRequest = AdRequest.Builder().build()
        mAdViewcuento12.loadAd(adRequest)
        val img_mar_rojo: ImageView =findViewById(R.id.img_arca_noe)
        val url_arca: String= "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/imagenes_cuentos_para_ni%C3%B1os%2Fmar_rojo.jpg?alt=media&token=21128e76-9588-4449-82ae-cd6f7370b3ec"
        Glide.with(this).load(url_arca).placeholder(R.drawable.ic_launcher_foreground).into(img_mar_rojo)

        playboton_cuento12=findViewById(R.id.play_boton_cuenot12)
        pauseboton_cuento_12=findViewById(R.id.pausa_boton_cuento12)
        mediaPlayer = MediaPlayer()
        playboton_cuento12.setOnClickListener {
            var audioUrl = "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/cuento12.mp3?alt=media&token=8c060758-7d5b-4be8-947d-b846fb146388"

            // on below line we are setting audio stream
            // type as stream music on below line.
            mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC)

            // on below line we are running a try
            // and catch block for our media player.
            try {
                // on below line we are setting audio
                // source as audio url on below line.
                mediaPlayer.setDataSource(audioUrl)

                // on below line we are
                // preparing our media player.
                mediaPlayer.prepare()

                // on below line we are
                // starting our media player.
                mediaPlayer.start()
            } catch (e: Exception) {

                // on below line we are handling our exception.
                e.printStackTrace()
            }
            // on below line we are displaying a toast message as audio player.
            Toast.makeText(applicationContext, "Audio started playing..", Toast.LENGTH_SHORT).show()


        }
        pauseboton_cuento_12.setOnClickListener {

            if (mediaPlayer.isPlaying){


                mediaPlayer.reset()
                Toast.makeText(applicationContext, "Audio has been  paused..", Toast.LENGTH_SHORT)
                    .show()



            }else {
                // if audio player is not displaying we are displaying below toast message
                Toast.makeText(applicationContext, "Audio not played..", Toast.LENGTH_SHORT).show()
            }
        }

    }
    public override fun onDestroy() {
        // Shutdown TTS when
        // activity is destroyed
        mediaPlayer.stop()
        super.onDestroy()
    }
}