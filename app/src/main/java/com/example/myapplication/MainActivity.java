package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     private TextView tv;
     private ImageView img;
     private Animation bootm ,top;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        img = findViewById(R.id.img);
        top = AnimationUtils.loadAnimation(this,R.anim.topanim);
        bootm = AnimationUtils.loadAnimation(this,R.anim.bootmanim);
        img.setAnimation(top);
        tv.setAnimation(bootm);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent view = new Intent( MainActivity.this,MainActivity2.class);
                startActivity(view);
                finish();
            }
        }, 5000);


    }
}