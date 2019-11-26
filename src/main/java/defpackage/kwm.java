package defpackage;

import com.google.android.libraries.youtube.ads.ui.webview.AdsWebView;

/* renamed from: kwm */
final /* synthetic */ class kwm implements Runnable {
    private final AdsWebView a;
    private final boolean b;
    private final String c;

    kwm(AdsWebView adsWebView, boolean z, String str) {
        this.a = adsWebView;
        this.b = z;
        this.c = str;
    }

    public final void run() {
        AdsWebView adsWebView = this.a;
        boolean z = this.b;
        kwk.a(adsWebView, z).a(this.c);
    }
}
