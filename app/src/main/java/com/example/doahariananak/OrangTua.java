package com.example.doahariananak;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class OrangTua extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orang_tua);

    }

    public void playBtnClick(View v){
        if (player==null){
            player = MediaPlayer.create(this,R.raw.ortu);
            Toast.makeText(this, "Doa sedang diputar", Toast.LENGTH_SHORT).show();
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player.start();
    }
    public void pauseBtnClick(View v){
        if (player!=null){
            player.pause();

            Toast.makeText(this, "Doa sedang dipause", Toast.LENGTH_SHORT).show();
        }
    }
    public void stopBtnClick(View v){
        stopPlayer();
    }
    private void stopPlayer(){
        if (player !=null){
            player.release();
            player = null;

            Toast.makeText(this, "Doa Berhenti", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}
