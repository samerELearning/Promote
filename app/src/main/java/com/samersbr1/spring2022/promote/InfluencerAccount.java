package com.samersbr1.spring2022.promote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InfluencerAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_influencer_account);
    }


    public void profilePicture(View view)
    {
     //This method will open the account information

    }

    public void logOut(View view)
    {

    }

    public void instagram(View view)
    {

    }

    public void feed(View view)
    {
        //this method will switch activity to the feed page
        Intent intent = new Intent(getApplicationContext(), InfluencerFeed.class);
        startActivity(intent);
    }

    public void likes(View view)
    {
        //this method will switch activity to the likes page
        Intent intent = new Intent(getApplicationContext(), InfluencerLikes.class);
        startActivity(intent);
    }

    public void matches(View view)
    {
        //this method will switch activity to the matches page
        Intent intent = new Intent(getApplicationContext(), InfluencerMatches.class);
        startActivity(intent);
    }
}