package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class Load extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.load);
        Timer timer = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Load.this, MainActivity.class);
                startActivity(intent);
            }
        };
        timer.schedule(tt, 2000L);
    }
}



