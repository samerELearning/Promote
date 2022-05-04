package com.samersbr1.spring2022.promote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InfluencerSignUpA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_influencer_sign_up1);
    }

    public void signIn(View view)
    {
        //this method will switch activity to the sign in page
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void signUp(View view)
    {
        //this method will switch activity to the next influencer sign up page
        Intent intent = new Intent(getApplicationContext(), InfluencerSignUp2.class);//Change to influencer sign up page
        startActivity(intent);
    }
}