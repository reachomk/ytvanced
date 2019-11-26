package defpackage;

import android.webkit.WebView;

/* renamed from: wtn */
final /* synthetic */ class wtn implements xsd {
    private final WebView a;

    public wtn(WebView webView) {
        this.a = webView;
    }

    public final void a(Object obj) {
        this.a.loadUrl((String) obj);
    }
}
