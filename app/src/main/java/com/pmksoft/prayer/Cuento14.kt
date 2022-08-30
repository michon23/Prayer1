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
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class Cuento14 : AppCompatActivity() {
    lateinit var playboton_cuento14: ImageButton
    lateinit var pauseboton_cuento_14: ImageButton
    lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cuento14)
        MobileAds.initialize(this) {}
        var mAdViewcuento14 : AdView = findViewById(R.id.adViewcuento14)
        val adRequest = AdRequest.Builder().build()
        mAdViewcuento14.loadAd(adRequest)
        val img_plagas_egipto: ImageView =findViewById(R.id.img_plagas_egipto)
        val url_arca: String= "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/imagenes_cuentos_para_ni%C3%B1os%2Flas%20plagas%20de%20egipto.jpg?alt=media&token=c985e445-3fdf-4118-9633-551f2807a5ae"
        Glide.with(this).load(url_arca).placeholder(R.drawable.ic_launcher_foreground).into(img_plagas_egipto)
        playboton_cuento14=findViewById(R.id.play_boton_cuenot14)
        pauseboton_cuento_14=findViewById(R.id.pausa_boton_cuento14)
        mediaPlayer = MediaPlayer()
        playboton_cuento14.setOnClickListener {
            var audioUrl = "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/cuento14.mp3?alt=media&token=f8b3a02a-56cf-497d-a352-70c0171fa3bb"

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
        pauseboton_cuento_14.setOnClickListener {

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