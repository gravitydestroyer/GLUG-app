package com.gnulinuxusersgroup.nitdgp.glug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class muktiweb extends AppCompatActivity {
    private WebView webb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muktiweb);

        WebView webb=(WebView)findViewById(R.id.web1);
        webb.setWebViewClient(new WebViewClient());
        webb.loadUrl("http://www.mkti.in/");
        webb.getSettings().setJavaScriptEnabled(true);
        webb.getSettings().setSupportZoom(true);
        webb.getSettings().setBuiltInZoomControls(true);

    }

}
