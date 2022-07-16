package com.example.control;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;
    Button b;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.editTextTextPersonName);
        e2 = findViewById(R.id.editTextTextPassword);
        e3 = findViewById(R.id.editTextTextEmailAddress);
        e4 = findViewById(R.id.editTextPhone);
        e5 = findViewById(R.id.editTextTime);
        e6 = findViewById(R.id.editTextDate);
        e7 = findViewById(R.id.autoCompleteTextView);
        e8 = findViewById(R.id.checkedTextView);
        e9 = findViewById(R.id.multiAutoCompleteTextView);

        b = findViewById(R.id.btn);
    }
}