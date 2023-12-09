package com.example.tic_toc_toe_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button btnStart;

    MediaPlayer gameStartMedia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SetUpView();



        gameStartMedia = MediaPlayer.create(this, R.raw.gamestart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                        gameStartMedia.start();
                        Intent intent = new Intent(MainActivity.this, gameActivity.class);
                        startActivity(intent);


            }
        });

    }
    public void SetUpView(){

        btnStart= findViewById(R.id.btnStart);



    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        gameStartMedia.release();

    }
}
