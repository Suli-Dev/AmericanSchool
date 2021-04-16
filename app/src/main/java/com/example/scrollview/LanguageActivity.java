package com.example.scrollview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LanguageActivity extends AppCompatActivity {
    TextView nameText;
    ImageView nameImage;
    TextView descrText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        nameText = findViewById(R.id.service_language);
        nameImage = findViewById(R.id.image_language_service);
        descrText = findViewById(R.id.info_language_service);

        int text = getIntent().getIntExtra("title", 0);
        nameText.setText(text);
        int image = getIntent().getIntExtra("image", 0);
        nameImage.setImageResource(image);
        int descr = getIntent().getIntExtra("descr", 0);
        descrText.setText(descr);
    }
}
