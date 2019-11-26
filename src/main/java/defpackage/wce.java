package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.libraries.youtube.ads.ui.webview.AdsWebView;

/* renamed from: wce */
public final class wce extends WebViewClient {
    private final /* synthetic */ AdsWebView a;

    public wce(AdsWebView adsWebView) {
        this.a = adsWebView;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl().toString();
        return false;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        wcg wcg = this.a.a;
        if (wcg != null) {
            wcg.c();
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        wcg wcg = this.a.a;
        if (wcg != null) {
            wcg.d();
        }
    }
}
