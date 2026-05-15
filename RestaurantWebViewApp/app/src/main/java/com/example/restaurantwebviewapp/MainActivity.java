package com.example.restaurantwebviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);

        // Keep navigation inside app

        webView.setWebViewClient(
                new WebViewClient());

        // Enable JavaScript

        WebSettings webSettings =
                webView.getSettings();

        webSettings.setJavaScriptEnabled(true);

        // Load Website

        webView.loadUrl("https://www.zomato.com");
    }
}