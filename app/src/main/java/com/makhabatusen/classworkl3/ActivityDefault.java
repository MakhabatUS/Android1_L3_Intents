package com.makhabatusen.classworkl3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityDefault extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default);
    }

    public void sendMessage(View view) {
        Intent intent  = new Intent(Intent.ACTION_VIEW,
                Uri.fromParts("sms","0555878787", null));
        intent.putExtra("sms_body", "Hello, how are you?");
        startActivity(intent);

    }

    public void openWebPage(View view) {
        Uri webPage = Uri.parse("https://google.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, webPage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void showMap(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:47.6,-122.3"));
        startActivity(intent);
    }
}