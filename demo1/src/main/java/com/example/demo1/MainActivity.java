package com.example.demo1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    EditText editTextWeb;
    Button buttonWeb;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextWeb = findViewById(R.id.edtWeb);
        buttonWeb = findViewById(R.id.btnWeb);
        webView = findViewById(R.id.wv);
        webView.setWebViewClient(new Test());
        AlertDialog.Builder ab = new AlertDialog.Builder(this);

        buttonWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             /*   String url = editTextWeb.getText().toString();
              //  webView.getSettings().setJavaScriptEnabled(true);
                webView.canGoBack();
                webView.canGoForward();
                webView.loadUrl(url);*/
                ab.setMessage("Do you want to Exit???");
                ab.setTitle("Alert...!!!");
                ab.setCancelable(false);
                ab.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                ab.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog ad = ab.create();
                ad.show();
            }
        });

    }
}