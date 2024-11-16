package org.webpki.android.support;

import android.os.Bundle;
import android.util.Base64;
import android.webkit.WebView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.webpki.android.saturn.R;

public abstract class WebViewActivity extends AppCompatActivity {
    protected abstract String getMainHtml();

    protected abstract String getToolBarHtml();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        WebView toolBar = findViewById(R.id.toolbar);
        toolBar.loadData(Base64.encodeToString(
                getToolBarHtml().getBytes(), Base64.NO_PADDING), "text/html", "base64");

        WebView webView = findViewById(R.id.webview);
        webView.loadData(Base64.encodeToString(
                getMainHtml().getBytes(), Base64.NO_PADDING), "text/html", "base64");
    }
}
