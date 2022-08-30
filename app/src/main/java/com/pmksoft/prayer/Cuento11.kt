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
class Cuento11 : AppCompatActivity() {
    lateinit var playboton_cuento11: ImageButton
    lateinit var pauseboton_cuento_11: ImageButton
    lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var mAdViewcuento11 : AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cuento11)

        MobileAds.initialize(this) {}
        mAdViewcuento11 = findViewById(R.id.adViewcuento11)
        val adRequest = AdRequest.Builder().build()
        mAdViewcuento11.loadAd(adRequest)
        val img_sanson: ImageView =findViewById(R.id.img_sanson)
        val url: String= "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/imagenes_cuentos_para_ni%C3%B1os%2Fsanson.jpg?alt=media&token=446ce962-5f1a-437b-b637-0d1e18c7827d"
        Glide.with(this).load(url).placeholder(R.drawable.ic_launcher_foreground).into(img_sanson)

        playboton_cuento11=findViewById(R.id.play_boton_cuenot11)
        pauseboton_cuento_11=findViewById(R.id.pausa_boton_cuento11)
        mediaPlayer = MediaPlayer()
        playboton_cuento11.setOnClickListener {
            var audioUrl = "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/cuento11.mp3?alt=media&token=81233446-0d51-4faa-98a5-2d89d8d574d0"

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
        pauseboton_cuento_11.setOnClickListener {

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