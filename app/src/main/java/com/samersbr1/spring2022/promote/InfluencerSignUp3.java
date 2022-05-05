package com.samersbr1.spring2022.promote;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.widget.ImageViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

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

    public void next(View view)
    {
        //this method will switch activity to the next page
        Intent intent = new Intent(getApplicationContext(), InfluencerSignUp2.class);
        startActivity(intent);
    }

    public void typeClicked(View view)
    {
        //this method will show the image of the type clicked
        CardView image = (CardView) view;

        if (image.getChildAt(0).getVisibility() == View.INVISIBLE)
        {
            Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_SHORT).show();
            image.getChildAt(0).setVisibility(View.VISIBLE);
        }
        else
        {
            image.getChildAt(0).setVisibility(View.INVISIBLE);
        }

    }
}