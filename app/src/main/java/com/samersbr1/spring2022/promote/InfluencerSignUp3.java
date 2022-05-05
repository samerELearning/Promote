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

    private int type_count; //this will count the number of types clicked

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_influencer_sign_up3);
        type_count = 0;
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
        Intent intent = new Intent(getApplicationContext(), InfluencerSignUp4.class);
        startActivity(intent);
    }

    public void typeClicked(View view)
    {
        //this method will show the image of the type clicked


        if (view instanceof CardView && type_count < 3)
        {
            CardView image = (CardView) view;
            image.getChildAt(0).setVisibility(View.VISIBLE);
            type_count++;
        }
        else if (view instanceof ImageView)
        {
            ImageView image = (ImageView) view;
            image.setVisibility(View.INVISIBLE);
            type_count--;
        }

    }
}