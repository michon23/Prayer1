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
class Cuento4 : AppCompatActivity() {
    private lateinit var mAdViewcuento4: AdView
    lateinit var playboton_cuento4: ImageButton
    lateinit var pauseboton_cuento_4: ImageButton
    lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cuento4)
        MobileAds.initialize(this) {}
        mAdViewcuento4 = findViewById(R.id.adViewcuento4)
        val adRequest = AdRequest.Builder().build()
        mAdViewcuento4.loadAd(adRequest)

        val imagen_la_creacion: ImageView = findViewById(R.id.img_la_creacion)
        val url_arca: String = "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/imagenes_cuentos_para_ni%C3%B1os%2Fcreacion.png?alt=media&token=abd49f5f-1be6-4a88-8beb-9b04f64ea176"
        Glide.with(this).load(url_arca).placeholder(R.drawable.ic_launcher_foreground)
            .into(imagen_la_creacion)

        playboton_cuento4 = findViewById(R.id.play_boton_cuenot4)
        pauseboton_cuento_4 = findViewById(R.id.pausa_boton_cuento4)
        mediaPlayer = MediaPlayer()

        playboton_cuento4.setOnClickListener {
            var audioUrl = "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/cuento4.mp3?alt=media&token=e686820e-3d38-4d71-b5cc-15fa700f2308"

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
        pauseboton_cuento_4.setOnClickListener {

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