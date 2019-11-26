package defpackage;

import android.os.Build.VERSION;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: adzq */
final class adzq extends WebViewClient {
    private final /* synthetic */ adzr a;

    adzq(adzr adzr) {
        this.a = adzr;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return false;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (VERSION.SDK_INT >= 21 && webResourceResponse.getStatusCode() == 400 && webResourceRequest.getUrl().toString().contains("oauth/consent")) {
            this.a.e.a();
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        this.a.c.setVisibility(0);
        this.a.b.setVisibility(8);
        this.a.c.evaluateJavascript("window.consentFlowCompleted = function(approved) { window.approvalJsInterface.consentFlowCompleted(approved); }", null);
        if (str.contains("oauth/consent")) {
            this.a.h.b(acwc.MDX_TV_SIGN_IN_PERMISSIONS_ALLOW_BUTTON, null);
            this.a.h.b(acwc.MDX_TV_SIGN_IN_PERMISSIONS_DENY_BUTTON, null);
        }
    }
}
