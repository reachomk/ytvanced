package defpackage;

import com.google.android.libraries.youtube.ads.ui.webview.AdsWebView;

/* renamed from: kwn */
final /* synthetic */ class kwn implements xsd {
    private final AdsWebView a;
    private final boolean b;

    kwn(AdsWebView adsWebView, boolean z) {
        this.a = adsWebView;
        this.b = z;
    }

    public final void a(Object obj) {
        AdsWebView adsWebView = this.a;
        boolean z = this.b;
        adsWebView.loadUrl((String) obj);
        if (z) {
            adsWebView.onPause();
        }
    }
}
