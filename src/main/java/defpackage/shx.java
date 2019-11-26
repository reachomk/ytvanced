package defpackage;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* renamed from: shx */
final class shx extends sho {
    private final /* synthetic */ shr a;

    shx(shr shr, Context context, String str) {
        this.a = shr;
        super(context, str);
    }

    public final void onPageFinished(WebView webView, String str) {
        shr shr = this.a;
        shr.l();
        shr.q = new Handler();
        shr.q.postDelayed(new shv(shr), shr.i);
        this.a.l.b();
        this.a.l.setVisibility(8);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.a.a((CharSequence) str, Integer.valueOf(i));
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (!shr.h.matcher(webResourceRequest.getUrl().toString()).matches()) {
            this.a.a(webResourceResponse.getReasonPhrase(), Integer.valueOf(webResourceResponse.getStatusCode()));
        }
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.a.a(webResourceError.getDescription(), Integer.valueOf(webResourceError.getErrorCode()));
    }
}
