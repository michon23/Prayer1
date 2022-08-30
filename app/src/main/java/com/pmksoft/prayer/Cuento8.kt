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
class Cuento8 : AppCompatActivity() {
    lateinit var playboton_cuento8: ImageButton
    lateinit var pauseboton_cuento_8: ImageButton
    lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cuento8)
        MobileAds.initialize(this) {}
        var mAdViewcuento8 : AdView = findViewById(R.id.adViewcuento8)
        val adRequest = AdRequest.Builder().build()
        mAdViewcuento8.loadAd(adRequest)
        val img_diez_mandamientos: ImageView =findViewById(R.id.img_diez_mandamientos)
        val url_arca: String= "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/imagenes_cuentos_para_ni%C3%B1os%2Flos%20diez%20mandamientos.jpg?alt=media&token=37ace93a-3d73-430d-979d-db6a4c580429"
        Glide.with(this).load(url_arca).placeholder(R.drawable.ic_launcher_foreground).into(img_diez_mandamientos)

        playboton_cuento8=findViewById(R.id.play_boton_cuenot8)
        pauseboton_cuento_8=findViewById(R.id.pausa_boton_cuento8)
        mediaPlayer = MediaPlayer()
        playboton_cuento8.setOnClickListener {
            var audioUrl = "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/cuento8.mp3?alt=media&token=98cbf3d6-2603-4a3f-82ec-57c45b652d12"

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
        pauseboton_cuento_8.setOnClickListener {

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