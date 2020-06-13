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

public class MainActivity extends AppCompatActivity {

    TextView tvSplash, tvSubSplash;
    Button btnget;
    Animation atg, btgone, btgtwo;
    ImageView ivSplash;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSplash = findViewById(R.id.tvSplash);
        tvSubSplash =  findViewById(R.id.tvSubSplash);
        btnget = findViewById(R.id.btnget);
        ivSplash = findViewById(R.id.ivSplash);

        // load animations
        atg = AnimationUtils.loadAnimation( this, R.anim.atg);
        btgone = AnimationUtils.loadAnimation( this, R.anim.btgone);
        btgtwo = AnimationUtils.loadAnimation( this, R.anim.btgtwo);

        // passing animation
        ivSplash.startAnimation(atg);
        tvSplash.startAnimation(btgone);
        tvSubSplash.startAnimation(btgone);
        btnget.startAnimation(btgtwo);

        // passing event
        btnget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, activity2.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });

//        // import font
//        Typeface MLight = Typeface.createFromAsset(getAssets(), getFileStreamPath( "fonts/MLight.ttf");
//        Typeface MMedium = Typeface.createFromAsset(getAssets(), getFileStreamPath("fonts/MMedium.ttf");
//        Typeface MRegular = Typeface.createFromAsset(getAssets(), getFileStreamPath("fonts/MRegular.ttf");
//
//        // customize font
//        tvSplash.setTypeface(MRegular);
//        tvSubSplash.setTypeface(MLight);
//        btnget.setTypeface(MMedium);
//


    }
}
