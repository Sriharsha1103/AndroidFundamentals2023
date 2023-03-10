package com.vvit.fundamentals;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button helloToast = findViewById(R.id.id_hello_toast);
        Button storeKeeper = findViewById(R.id.id_score_keeper);
        Button scrollText = findViewById(R.id.id_scroll_text);
        Button keyboardDialPhone = findViewById(R.id.id_keyboard_dial_phone);
        Button implicitIntents = findViewById(R.id.id_implicit_intents);
        Button twoActivities = findViewById(R.id.id_two_activities);
        Button lifeCycle = findViewById(R.id.id_life_cycle);
        Button droidCafe = findViewById(R.id.id_droid_cafe);
        Button droidCafeSettings = findViewById(R.id.id_droid_cafe_settings);

        helloToast.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, HelloToast.class);
            startActivity(intent);
            finish();
        });
        storeKeeper.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ScoreKeeper.class);
            startActivity(intent);
            finish();
        });
        scrollText.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ScrollText.class);
            startActivity(intent);
            finish();
        });
        keyboardDialPhone.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, KeyboardDialPhone.class);
            startActivity(intent);
            finish();
        });
        implicitIntents.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ImplicitIntents.class);
            startActivity(intent);
            finish();
        });
        twoActivities.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, TwoActivities.class);
            startActivity(intent);
            finish();
        });
        lifeCycle.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, LifeCycle.class);
            startActivity(intent);
            finish();
        });
        droidCafe.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, DroidCafe.class);
            startActivity(intent);
            finish();
        });
        droidCafeSettings.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, DroidCafeSettings.class);
            startActivity(intent);
            finish();
        });

    }
}