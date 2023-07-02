package com.makhabatusen.classworkl3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    static final String RESULT_KEY = "ResKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        if (intent != null) {
            String text = intent.getStringExtra(MainActivity.INTENT_KEY);
            Toast.makeText(this, text,Toast.LENGTH_LONG).show();
            setupUI();
        }
    }

    private void setupUI() {
        Button btnSend = findViewById(R.id.btn_setResult);
        btnSend.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.putExtra(RESULT_KEY, "Hello from Second Activity");
            setResult(RESULT_OK, intent);
            finish();

        });
    }
}