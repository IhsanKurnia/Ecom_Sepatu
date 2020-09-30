package com.ihsan_kurnia.ecomsepatu;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ihsan_kurnia.ecomsepatu.ui.home.HomeActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Full mode
        getSupportActionBar().hide();
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        /*Fungsi Splash Screen*/
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                goToHomActivity();
            }
        }, 3000);


    }

    private void goToHomActivity() {
        Intent intent = new Intent(this.getApplicationContext(), HomeActivity.class);
        startActivity(intent);
        finish();
    }
}