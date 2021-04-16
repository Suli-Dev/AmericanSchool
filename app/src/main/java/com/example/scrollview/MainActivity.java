package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout serviceLanguage;
    private ConstraintLayout serviceCamp;
    private ConstraintLayout serviceTalking;
    private ConstraintLayout serviceEfl;
    private TextView callBtn;
    private ConstraintLayout banner;
    int x = 5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serviceLanguage = findViewById(R.id.service_language);
        serviceCamp = findViewById(R.id.service_camp);
        serviceTalking = findViewById(R.id.service_talking);
        serviceEfl = findViewById(R.id.service_efl);
        callBtn = findViewById(R.id.call_button);
        banner = findViewById(R.id.banner);
        banner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = "https://google.com";
                Uri myUri = Uri.parse(link);
                Intent intent = new Intent(Intent.ACTION_VIEW, myUri);
                startActivity(intent);
            }
        });


        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "+996707666666";
                Uri myUri = Uri.parse("tell: " + number);
                Intent myIntent = new Intent(Intent.ACTION_DIAL, myUri);
                startActivity(myIntent);

            }
        });


        serviceLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startInfoActivity(
                        R.string.servise_language,
                        R.drawable.image_1,
                        R.string.servise_langugae_descript
                );

            }
        });
        serviceCamp.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startInfoActivity(
                        R.string.servis_camp,
                        R.drawable.image_2,
                        R.string.servise_camp_descript
                );

            }
        }));
        serviceTalking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startInfoActivity(
                        R.string.servise_talking,
                        R.drawable.image_3,
                        R.string.servise_talking_descript
                );

            }
        });
        serviceEfl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startInfoActivity(
                        R.string.servise_efl,
                        R.drawable.image_4,
                        R.string.servise_toefl_descript
                );

            }
        });
    }

    private void startInfoActivity(int titleRes, int imageRes, int descrRes) {
        Intent intent = new Intent(this, LanguageActivity.class);
        intent.putExtra("title", titleRes);
        intent.putExtra("image", imageRes);
        intent.putExtra("descr", descrRes);
        startActivity(intent);

    }
}