package defpackage;

import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.android.youtube.R;

/* renamed from: adzr */
public final class adzr {
    public static final String a = xtl.b("MDX.PermissionsController");
    public final View b;
    public final WebView c;
    public final tbk d;
    public final adzv e;
    public final aeab f;
    public final adzs g = new adzs(this);
    public final acvx h;
    public String i;

    public adzr(View view, tbk tbk, adzv adzv, aeab aeab, acvx acvx) {
        CookieManager.getInstance().setAcceptCookie(true);
        this.f = aeab;
        CookieManager.getInstance().setAcceptCookie(true);
        this.b = view.findViewById(R.id.loading);
        this.c = (WebView) view.findViewById(R.id.webview);
        this.e = adzv;
        this.d = tbk;
        this.h = acvx;
    }
}
