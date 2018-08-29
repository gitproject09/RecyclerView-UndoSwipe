package com.sopan.undoswipe.activity;

import android.annotation.TargetApi;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.sopan.undoswipe.R;

@TargetApi(Build.VERSION_CODES.LOLLIPOP)
public class AboutActivity extends AppCompatActivity {

    private final int currentapiVersion = Build.VERSION.SDK_INT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about);

        if (currentapiVersion >= Build.VERSION_CODES.LOLLIPOP) {
            this.getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
        }
    }
}
