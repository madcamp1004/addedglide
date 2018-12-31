package com.example.viewpagerdemo;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class FullImageActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstancestate){
        super.onCreate(savedInstancestate);
        setContentView(R.layout.full_image);

        //get intent data
        Intent i = getIntent();
        //Selected image id
        int position = i.getExtras().getInt("id");
        Log.i("FULL IMAGE BITMAP", String.valueOf(position));
        ImageAdapter imageAdapter = new ImageAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);

        Uri getUri = Uri.parse(i.getExtras().getString("imageUri"));
        Glide.with(this).load(getUri).into(imageView);
    }
}
