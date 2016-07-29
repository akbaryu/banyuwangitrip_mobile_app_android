package com.yudha.banyuwangitrip;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

@SuppressLint("SetJavaScriptEnabled") public class berita extends Activity {
	   
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.berita);
        WebView mainWebView = (WebView) findViewById(R.id.webView2);
        WebSettings webSettings = mainWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mainWebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        mainWebView.loadUrl("http://radarbanyuwangi.co.id/");
        mainWebView.setWebViewClient(new HelloWebClient());	
	}

private class HelloWebClient extends WebViewClient {
	
	public boolean shouldOverrideUrlLoading(WebView webview, String url)
	{
		webview.loadUrl(url);
		return true;
	}
}
}