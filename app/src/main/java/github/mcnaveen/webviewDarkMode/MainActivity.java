package github.mcnaveen.webviewDarkMode;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    WebView webView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.poc);
        webView = findViewById(R.id.webView);
        WebSettings webSetting = webView.getSettings();
        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://coliff.github.io/dark-mode-switch/index.html");

        //Adding the Below Line will Make coliff/dark-mode-switch work.
        //But this is Deprecated API.
        webSetting.setDomStorageEnabled(true);

        Toast toast = Toast.makeText(getApplicationContext(),
                "POC by https://github.com/mcnaveen",
                Toast.LENGTH_SHORT);

        toast.show();

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }


    private class WebViewClient extends android.webkit.WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }

}
