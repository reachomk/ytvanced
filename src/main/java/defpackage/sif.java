package defpackage;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* renamed from: sif */
final class sif extends sho {
    private final /* synthetic */ shz a;

    sif(shz shz, Context context, String str) {
        this.a = shz;
        super(context, str);
    }

    public final void onPageFinished(WebView webView, String str) {
        shz shz = this.a;
        shz.l();
        shz.q = new Handler();
        shz.q.postDelayed(new sid(shz), shz.h);
        this.a.n.b();
        this.a.n.setVisibility(8);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.a.a((CharSequence) str, Integer.valueOf(i));
    }

    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (!shz.g.matcher(webResourceRequest.getUrl().toString()).matches()) {
            this.a.a(webResourceResponse.getReasonPhrase(), Integer.valueOf(webResourceResponse.getStatusCode()));
        }
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.a.a(webResourceError.getDescription(), Integer.valueOf(webResourceError.getErrorCode()));
    }
}
