package com.gnulinuxusersgroup.nitdgp.glug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.gnulinuxusersgroup.nitdgp.glug.R;

public class FeedbackActivity extends AppCompatActivity {

    private WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        WebView web = (WebView) findViewById(R.id.feed);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("http://FeedbackActivity.nitdgplug.org");
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setSupportZoom(true);
        web.getSettings().setBuiltInZoomControls(true);

    }
}
