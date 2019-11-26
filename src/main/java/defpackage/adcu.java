package defpackage;

import android.net.Uri;

/* renamed from: adcu */
public final class adcu {
    public static final String a = xtl.b("MDX.discovery");
    public final String b;
    private final xgq c;

    public adcu(xgq xgq, String str) {
        this.c = xgq;
        this.b = str;
    }

    public final adhw a(Uri uri) {
        xhg a = xhc.a(uri.toString());
        a.b("Origin", "package:com.google.android.youtube");
        xhc a2 = a.a();
        adct adct = new adct(this, a2.b());
        aebj.a(this.c, a2, adct);
        return adct.a;
    }
}
