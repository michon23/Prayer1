package com.pmksoft.prayer

import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
class Cuento2 : AppCompatActivity() {
    lateinit var playboton_cuento2: ImageButton
    lateinit var pauseboton_cuento_2: ImageButton
    lateinit var mediaPlayer: MediaPlayer

    private lateinit var mAdViewcuento2 : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cuento2)

        MobileAds.initialize(this) {}
        mAdViewcuento2 = findViewById(R.id.adViewcuento2)
        val adRequest = AdRequest.Builder().build()
        mAdViewcuento2.loadAd(adRequest)

        val imagen_rey_salomon: ImageView =findViewById(R.id.img_rey_salomon)
        val url_arca: String= "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/imagenes_cuentos_para_ni%C3%B1os%2Frey_salomon.jpg?alt=media&token=1d35aa94-4376-44be-8daa-bd428cf58e71"
        Glide.with(this).load(url_arca).placeholder(R.drawable.ic_launcher_foreground).into(imagen_rey_salomon)
////////////////////////////////////////////
        playboton_cuento2=findViewById(R.id.play_boton_cuento2)
        pauseboton_cuento_2=findViewById(R.id.pause_boton_cuento2)
        mediaPlayer = MediaPlayer()

        playboton_cuento2.setOnClickListener {


            var audioUrl = "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/cuento2.mp3?alt=media&token=fbe2bbe9-ed13-4e07-9001-d13773ea52ef"

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

            }catch (e: Exception) {

                // on below line we are handling our exception.
                e.printStackTrace()
            }
            // on below line we are displaying a toast message as audio player.
            Toast.makeText(applicationContext, "Audio started playing..", Toast.LENGTH_SHORT).show()
        }
        pauseboton_cuento_2.setOnClickListener {


            if (mediaPlayer.isPlaying){


                mediaPlayer.reset()
                Toast.makeText(applicationContext, "Audio has been  paused..", Toast.LENGTH_SHORT)
                    .show()



            }else {
                // if audio player is not displaying we are displaying below toast message
                Toast.makeText(applicationContext, "Audio not played..", Toast.LENGTH_SHORT).show()
            }
        }









        /////////////////////////////////////

    }
    public override fun onDestroy() {
        // Shutdown TTS when
        // activity is destroyed
        mediaPlayer.stop()
        super.onDestroy()
    }
}