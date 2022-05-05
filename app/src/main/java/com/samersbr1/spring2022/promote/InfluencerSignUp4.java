package com.samersbr1.spring2022.promote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InfluencerSignUp4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_influencer_sign_up4);
    }


    public void next(View view)
    {
        //this method will switch activity to the next page
        Intent intent = new Intent(getApplicationContext(), InfluencerAccount.class);
        startActivity(intent);
    }
}