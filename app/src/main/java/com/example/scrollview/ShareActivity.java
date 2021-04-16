package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        Intent myIntent = getIntent();
        String sendText = myIntent.getDataString();
        TextView myTextView = findViewById(R.id.text_service_language);
        myTextView.setText(sendText);

    }
}