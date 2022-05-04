package com.samersbr1.spring2022.promote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InfluencerSignUp3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_influencer_sign_up3);
    }

    public void back(View view)
    {
        //this method will switch activity back to the previous page
        Intent intent = new Intent(getApplicationContext(), InfluencerSignUp2.class);
        startActivity(intent);
    }
}