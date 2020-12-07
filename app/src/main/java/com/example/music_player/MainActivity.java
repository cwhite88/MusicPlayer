package com.example.music_player;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {


    MediaPlayer music = new MediaPlayer();
    Button start;

    RadioGroup Song_Selection;
    public static RadioButton song1, song2, song3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.start);
        song1 = findViewById(R.id.song1);
        song2 = findViewById(R.id.song2);
        song3 = findViewById(R.id.song3);
        Song_Selection = findViewById(R.id.Song_Selection);

    }

    public void musicplay(View v) {


        startService(new Intent(this, MyService.class));


    }

    public void musicstop(View v) {


        stopService(new Intent(this, MyService.class));


    }



}


