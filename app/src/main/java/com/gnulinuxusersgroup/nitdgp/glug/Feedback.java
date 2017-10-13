package com.gnulinuxusersgroup.nitdgp.glug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Feedback extends AppCompatActivity {

    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        WebView web = (WebView) findViewById(R.id.feed);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("http://Feedback.nitdgplug.org");
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setSupportZoom(true);
        web.getSettings().setBuiltInZoomControls(true);

    }
}
