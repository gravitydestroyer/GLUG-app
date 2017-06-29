package com.gnulinuxusersgroup.nitdgp.glug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class glugweb extends AppCompatActivity {
    private WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glugweb);

        WebView web=(WebView)findViewById(R.id.web2);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("http://nitdgplug.org/");
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setSupportZoom(true);
        web.getSettings().setBuiltInZoomControls(true);

    }

}
