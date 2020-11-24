package com.example.cit;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ImageView imgKeypadCancel = (ImageView) findViewById(R.id.fprint);
//        imgKeypadCancel.setColorFilter(getResources().getColor(R.color.white), PorterDuff.Mode.SRC_IN );
    }
}