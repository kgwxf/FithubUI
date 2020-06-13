package com.example.uplifters2;

import android.content.Intent;
import android.graphics.Typeface;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

public class activity2 extends AppCompatActivity {

    Button btnE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //passing event
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(createPackageContext(activity2:this, activity3.class))
                b.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(b);
            }
        });
