package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.regex.Pattern;

/* renamed from: sho */
public class sho extends WebViewClient {
    private final Context a;
    private final Pattern b;

    public sho(Context context, String str) {
        this.a = context;
        this.b = !TextUtils.isEmpty(str) ? Pattern.compile(str) : null;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Pattern pattern = this.b;
        if (pattern == null || pattern.matcher(str).find()) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(this.a.getPackageManager()) != null) {
            this.a.startActivity(intent);
        } else {
            String valueOf = String.valueOf(str);
            str = "No handler was found for ";
            Log.e("ConsentWebViewClient", valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        }
        return true;
    }
}
