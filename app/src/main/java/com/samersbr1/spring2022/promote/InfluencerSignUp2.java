package com.samersbr1.spring2022.promote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InfluencerSignUp2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_influencer_sign_up2);
    }

    public void back(View view)
    {
        //this method will switch activity back to the previous page
        Intent intent = new Intent(getApplicationContext(), InfluencerSignUpA.class);
        startActivity(intent);
    }

    public void uploadProfilePicture(View view)
    {

    }

    public void gender(View view)
    {

    }

    public void nextPage(View view)
    {
        Intent intent = new Intent(getApplicationContext(), InfluencerSignUp3.class);
        startActivity(intent);
    }
}