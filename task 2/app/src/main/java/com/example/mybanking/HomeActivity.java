package com.example.mybanking;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ActionBar actionBar = getSupportActionBar();
        if( actionBar != null){
            actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.my_gradient));
        }
    }



    public void gotoChooseSender(View view) {
        Intent ChooseSender = new Intent();
        ChooseSender.setClass(this, user_list.class);
        startActivity(ChooseSender);

    }
}