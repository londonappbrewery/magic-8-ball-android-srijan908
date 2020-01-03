package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button ask;
    ImageView yourFortune;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ask = (Button) findViewById(R.id.ask);

        yourFortune = (ImageView) findViewById(R.id.Image_eightBall);

        final Random randomFortune = new Random();

        final ArrayList<Integer> fortunes = new ArrayList<>(Arrays.asList(R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5));

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yourFortune.setImageResource(fortunes.get(randomFortune.nextInt(5)));
            }
        });
    }
}
