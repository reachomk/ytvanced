package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: aive */
public final class aive {
    private static final amuw f = amuw.a("v", "i", "x", "l", "m");
    public final String a;
    public final int b;
    public final String c;
    public final long d;
    public final long e;

    private aive(String str, int i, String str2, long j, long j2) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = j;
        this.e = j2;
    }

    public static aive a(Uri uri) {
        if (uri.getQueryParameterNames().containsAll(f)) {
            String str = "v";
            if (!TextUtils.isEmpty(uri.getQueryParameter(str))) {
                return new aive(uri.getQueryParameter(str), Integer.parseInt(uri.getQueryParameter("i")), uri.getQueryParameter("x"), Long.parseLong(uri.getQueryParameter("l")), Long.parseLong(uri.getQueryParameter("m")));
            }
        }
        return null;
    }
}
