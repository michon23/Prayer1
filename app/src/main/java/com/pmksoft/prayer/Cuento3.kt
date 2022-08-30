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
class Cuento3 : AppCompatActivity() {
    lateinit var playboton_cuento3: ImageButton
    lateinit var pauseboton_cuento_3: ImageButton
    lateinit var mediaPlayer: MediaPlayer
    private lateinit var mAdViewcuento3 : AdView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cuento3)
        MobileAds.initialize(this) {}
        mAdViewcuento3 = findViewById(R.id.adViewcuento3)
        val adRequest = AdRequest.Builder().build()
        mAdViewcuento3.loadAd(adRequest)

        val imagen_jonas_pez: ImageView =findViewById(R.id.img_jonas_pez)
        val url_arca: String= "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/imagenes_cuentos_para_ni%C3%B1os%2Fjonas_y_el_pez.jpg?alt=media&token=581fadc8-29c3-40f7-8a9b-0514dfce2db7"
        Glide.with(this).load(url_arca).placeholder(R.drawable.ic_launcher_foreground).into(imagen_jonas_pez)

        playboton_cuento3=findViewById(R.id.play_boton_cuenot3)
        pauseboton_cuento_3=findViewById((R.id.pausa_boton_cuento3))
        mediaPlayer = MediaPlayer()


        playboton_cuento3.setOnClickListener {

            var audioUrl = "https://firebasestorage.googleapis.com/v0/b/admob-a158e.appspot.com/o/cuento3.mp3?alt=media&token=a7ed13cb-21a7-423f-9533-a5c66b6842fc"

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
        pauseboton_cuento_3.setOnClickListener {

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