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


class Cuento1 : AppCompatActivity() {



    lateinit var playboton: ImageButton
    lateinit var pauseboton: ImageButton
    lateinit var mediaPlayer: MediaPlayer

    private lateinit var mAdViewcuento1 : AdView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cuento1)
        MobileAds.initialize(this) {}
        mAdViewcuento1 = findViewById(R.id.adViewcuento1)

        val adRequest = AdRequest.Builder().build()
        mAdViewcuento1.loadAd(adRequest)
        val imagen_arca_de_noe:ImageView=findViewById(R.id.img_arca_noe)
        val url_arca: String= "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/imagenes_cuentos_para_ni%C3%B1os%2Farca_noe.png?alt=media&token=f2514970-11e2-4142-9eb5-9f1957283d05"
        Glide.with(this).load(url_arca).placeholder(R.drawable.ic_launcher_foreground).into(imagen_arca_de_noe)


        playboton=findViewById(R.id.play_boton_cuenot1)
        pauseboton=findViewById((R.id.pausa_boton_cuento1))
        mediaPlayer = MediaPlayer()
        playboton.setOnClickListener {

            // on below line we are creating a variable for our audio url
            var audioUrl = "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/cuento1.mp3?alt=media&token=666c8742-957d-4bd9-a034-211d4aa65062"

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
            Toast.makeText(applicationContext, "reproduciendo Cuento: Arca de Noé", Toast.LENGTH_SHORT).show()

        }
        pauseboton.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                // if media player is playing we
                // are stopping it on below line.


                // on below line we are resetting
                // our media player.
                mediaPlayer.reset()

                // on below line we are calling
                // release to release our media player.



                // on below line we are displaying a toast message to pause audio/
                Toast.makeText(applicationContext, "Pausa", Toast.LENGTH_SHORT)
                    .show()

            }else {
                // if audio player is not displaying we are displaying below toast message
                Toast.makeText(applicationContext, "el audio esta pausado", Toast.LENGTH_SHORT).show()
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



