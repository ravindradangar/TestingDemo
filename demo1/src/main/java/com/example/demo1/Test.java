package com.example.demo1;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Test extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
