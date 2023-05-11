package com.example.tutorial6_webview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    //WebView is used to create website like application on Android
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webViewVar = findViewById<WebView>(R.id.webView)
        WebViewSetup(webViewVar)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun WebViewSetup(webView: WebView) {
        webView.webViewClient = WebViewClient()

        webView.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl( "https://zoro.to/")
        }
    }
}