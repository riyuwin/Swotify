package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Second extends AppCompatActivity {
    MediaPlayer mySong;
    MediaPlayer rideHomeSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mySong = MediaPlayer.create(Second.this, R.raw.fallen);
        rideHomeSong = MediaPlayer.create(Second.this, R.raw.ride_home);


    }

    public void LaunchSongActivity(View view){
        switch (view.getId()) {
            case (R.id.play_button):
                    Intent intent = new Intent (this, Third.class);
                    intent.putExtra("Title", 1);
                    startActivity(intent);
                break;
            case (R.id.play_button2):
                Intent intent1 = new Intent (this, Third.class);
                intent1.putExtra("Title", 2);
                startActivity(intent1);
                break;
            case (R.id.play_button3):
                Intent intent2 = new Intent (this, Third.class);
                intent2.putExtra("Title", 3);
                startActivity(intent2);
                break;
            case (R.id.play_button4):
                Intent intent3 = new Intent (this, Third.class);
                intent3.putExtra("Title", 4);
                startActivity(intent3);
                break;
            case (R.id.play_button5):
                Intent intent4 = new Intent (this, Third.class);
                intent4.putExtra("Title", 5);
                startActivity(intent4);
                break;
        }

    }


}