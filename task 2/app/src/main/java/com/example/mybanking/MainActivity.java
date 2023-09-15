package com.example.mybanking;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //variables
    Animation animation, fadein, fadeout;
    ImageView imageView_icon;
    TextView appName, developerName;

    private static int SPLASH_TIME_OUT = 3000;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if( actionBar != null){
            actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.my_gradient));
        }


        animation = AnimationUtils.loadAnimation(this, R.anim.animation);
        fadein = AnimationUtils.loadAnimation(this, R.anim.fadein);
        fadeout = AnimationUtils.loadAnimation(this, R.anim.fadeout);
        imageView_icon = findViewById(R.id.imageView_icon);
        appName = findViewById(R.id.textView_app_name);
        developerName = findViewById(R.id.textView_made_by);

        imageView_icon.setAnimation(animation);
        //appName.setAnimation(fadeout);
        //developerName.setAnimation(fadeout);
        appName.setAnimation(fadein);
        developerName.setAnimation(fadein);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Home = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(Home);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}