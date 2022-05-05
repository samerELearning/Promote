package com.samersbr1.spring2022.promote;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class InfluencerSignUp2 extends AppCompatActivity {

    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_influencer_sign_up2);

    }

    /*private void pickImage()
    {
        CropImage.activity()
                .setGuidelines(CropImageView.Guidelines.ON)
                .start(this);
    }*/


    @RequiresApi(api = Build.VERSION_CODES.M)
    private void requestStoragePermission()
    {
        //requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 100);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void requestCameraPermission()
    {
        //requestPermissions(new String[]{Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 100);
    }

    private boolean checkCameraPermission()
    {
        boolean res1 = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED;
        boolean res2 = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED;

        return res1 && res2;
    }

    private boolean checkStoragePermission()
    {
        boolean res2 = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED;

        return res2;
    }

    //@Override
    /*public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            if (resultCode == RESULT_OK) {
                Uri resultUri = result.getUri();
            } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
                Exception error = result.getError();
            }
        }
    }*/

    public void back(View view)
    {
        //this method will switch activity back to the previous page
        Intent intent = new Intent(getApplicationContext(), InfluencerSignUpA.class);
        startActivity(intent);
    }

    public void uploadProfilePicture(View view)
    {
        image = findViewById(R.id.camera_icon);
        image.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                boolean pick = true;
                if (pick == true)
                {
                    if (!checkCameraPermission())
                    {
                        requestCameraPermission();

                    }else
                    {
                        //pickImage();
                    }
                }else
                {
                    if (!checkStoragePermission())
                    {
                        requestStoragePermission();

                    }else
                    {
                        //pickImage();
                    }
                }
            }
        });
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