package com.samersbr1.spring2022.promote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
    }

    public void signIn(View view)
    {
     //this method will switch activity to the sign in page
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }

    public void influencerSignUp(View view)
    {
     //this method will switch activity to the influencer sign up page
        Intent intent = new Intent(getApplicationContext(), InfluencerSignUpA.class);//Change to influencer sign up page
        startActivity(intent);
    }

    public void businessSignUp(View view)
    {
        //this method will switch activity to the influencer sign up page
        Intent intent = new Intent(getApplicationContext(), BusinessSignUpA.class);//Change to business sign up page
        startActivity(intent);
    }
}