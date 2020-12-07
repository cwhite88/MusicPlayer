package com.example.music_player;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;

import android.os.IBinder;


import androidx.annotation.Nullable;
import static com.example.music_player.MainActivity.song1;
import static com.example.music_player.MainActivity.song2;
import static com.example.music_player.MainActivity.song3;

public class MyService extends Service {


    private MediaPlayer music;


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }



    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        if (music != null && music.isPlaying()) {
            music.stop();
            music.seekTo(0);
        }

        if (song1.isChecked()) {
            music = MediaPlayer.create(this, R.raw.sound1);
        } else if (song2.isChecked()) {
            music = MediaPlayer.create(this, R.raw.sound2);
        } else if (song3.isChecked()) {
            music = MediaPlayer.create(this, R.raw.sound3);
        }

        music.setLooping(false);
        music.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        music.stop();
        music.seekTo(0);
    }
}


