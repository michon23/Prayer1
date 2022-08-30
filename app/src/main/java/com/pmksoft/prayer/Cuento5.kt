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
class Cuento5 : AppCompatActivity() {
    lateinit var playboton_cuento5: ImageButton
    lateinit var pauseboton_cuento_5: ImageButton
    lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cuento5)
        MobileAds.initialize(this) {}
        var mAdViewcuento5 : AdView = findViewById(R.id.adViewcuento5)
        val adRequest = AdRequest.Builder().build()
        mAdViewcuento5.loadAd(adRequest)
        val imagen_jose_el_esclavo: ImageView =findViewById(R.id.img_jose_el_esclavo)
        val url_arca: String= "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/imagenes_cuentos_para_ni%C3%B1os%2Fjose%20el%20esclavo.jpg?alt=media&token=4c591f56-4b0d-4606-9614-d1631c7e4843"
        Glide.with(this).load(url_arca).placeholder(R.drawable.ic_launcher_foreground).into(imagen_jose_el_esclavo)

        playboton_cuento5=findViewById(R.id.play_boton_cuenot5)
        pauseboton_cuento_5=findViewById(R.id.pausa_boton_cuento5)
        mediaPlayer = MediaPlayer()
        playboton_cuento5.setOnClickListener {
            var audioUrl = "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/cuento5.mp3?alt=media&token=35dd79d8-1af8-404d-98b3-b0466f132fcd"

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
        pauseboton_cuento_5.setOnClickListener {

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