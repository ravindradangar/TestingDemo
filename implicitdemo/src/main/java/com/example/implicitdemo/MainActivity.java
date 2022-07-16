package com.example.implicitdemo;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et;
    Button  b;
    RatingBar rb;
    DatePicker datePicker;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.edt);
        b = findViewById(R.id.btn);
        rb = findViewById(R.id.rt);
        datePicker = findViewById(R.id.dp);
        datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                Toast.makeText(MainActivity.this, "New "+datePicker.getDayOfMonth(), Toast.LENGTH_SHORT).show();
            }
        });
        rb.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Toast.makeText(MainActivity.this, ""+ratingBar.getRating(), Toast.LENGTH_SHORT).show();
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Change date"+getDate(), Toast.LENGTH_SHORT).show();
            }
        });

        String mail[] ={"rrdangar@gmail.com","ravindra.dangar@rku.ac.in"};
        Intent email = new Intent(Intent.ACTION_SEND, Uri.parse("mailto:"));
        email.putExtra(Intent.EXTRA_EMAIL,mail);
        email.putExtra(Intent.EXTRA_SUBJECT,"Subject");
        email.putExtra(Intent.EXTRA_TEXT, "Body");
        email.setType("text/plain");
        //email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an email client from..."));
    }

    public String getDate(){
        StringBuilder s = new StringBuilder();
        return s.append(datePicker.getMonth()+1+"/").append(datePicker.getDayOfMonth()+"/").append(datePicker.getYear()).toString();
    }
}