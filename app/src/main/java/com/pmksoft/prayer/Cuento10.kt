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
class Cuento10 : AppCompatActivity() {
    lateinit var playboton_cuento10: ImageButton
    lateinit var pauseboton_cuento_10: ImageButton
    lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cuento10)
        MobileAds.initialize(this) {}
        var mAdViewcuento10 : AdView = findViewById(R.id.adViewcuento10)
        val adRequest = AdRequest.Builder().build()
        mAdViewcuento10.loadAd(adRequest)
        val img_primer_milagro_jesus: ImageView =findViewById(R.id.img_primer_milagro_jesus)
        val url_arca: String= "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/imagenes_cuentos_para_ni%C3%B1os%2Fprimer%20milagro%20de%20jesus.jpg?alt=media&token=fccb1a3f-77b1-4ad2-9389-87364a00d5b5"
        Glide.with(this).load(url_arca).placeholder(R.drawable.ic_launcher_foreground).into(img_primer_milagro_jesus)

        playboton_cuento10=findViewById(R.id.play_boton_cuenot10)
        pauseboton_cuento_10=findViewById(R.id.pausa_boton_cuento10)
        mediaPlayer = MediaPlayer()
        playboton_cuento10.setOnClickListener {
            var audioUrl = "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/cuento10.mp3?alt=media&token=b2f6e5ec-e56f-4d72-85aa-a787c3a79701"

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
        pauseboton_cuento_10.setOnClickListener {

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