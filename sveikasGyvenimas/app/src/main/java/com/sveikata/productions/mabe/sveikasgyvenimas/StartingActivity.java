package com.sveikata.productions.mabe.sveikasgyvenimas;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class StartingActivity extends AppCompatActivity {

    private ImageView heart_IV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);

        heart_IV = (ImageView) findViewById(R.id.heart);


        Animation pulse = AnimationUtils.loadAnimation(StartingActivity.this, R.anim.pulse);
        heart_IV.startAnimation(pulse);


        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {

                Intent intent = new Intent(StartingActivity.this, LoginActivity.class);
                intent.putExtra("isAnimDisabled", true);
                startActivity(intent);
            }
        }, 2100L);
    }
}
