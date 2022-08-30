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
class Cuento13 : AppCompatActivity() {
    lateinit var playboton_cuento13: ImageButton
    lateinit var pauseboton_cuento_13: ImageButton
    lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var mAdViewcuento13 : AdView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cuento13)
        MobileAds.initialize(this) {}
        mAdViewcuento13 = findViewById(R.id.adViewcuento13)
        val adRequest = AdRequest.Builder().build()
        mAdViewcuento13.loadAd(adRequest)

        val img_sodoma: ImageView =findViewById(R.id.img_sodoma_gomorra)
        val url: String= "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/imagenes_cuentos_para_ni%C3%B1os%2Fsodoma%20y%20gomorra.jpg?alt=media&token=893736f2-03f8-433e-9d8b-a52e34a4b236"
        Glide.with(this).load(url).placeholder(R.drawable.ic_launcher_foreground).into(img_sodoma)

        playboton_cuento13=findViewById(R.id.play_boton_cuenot13)
        pauseboton_cuento_13=findViewById(R.id.pausa_boton_cuento13)
        mediaPlayer = MediaPlayer()
        playboton_cuento13.setOnClickListener {
            var audioUrl = "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/cuento13.mp3?alt=media&token=6eb8d381-1983-4a8b-a56a-5c93cda1defc"

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
        pauseboton_cuento_13.setOnClickListener {

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