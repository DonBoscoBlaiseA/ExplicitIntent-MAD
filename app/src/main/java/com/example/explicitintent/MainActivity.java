package com.example.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText numberEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberEditText = findViewById(R.id.numberEditText1);
        Button factorialButton = findViewById(R.id.factorialButton);

        factorialButton.setOnClickListener(v -> {
            int number = Integer.parseInt(numberEditText.getText().toString());

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("number", number);
            startActivity(intent);
        });
    }
}
