package defpackage;

import android.net.Uri;

/* renamed from: egr */
public final class egr implements aftl {
    public volatile String a;

    public final String a(Uri uri, String str) {
        Integer num = (Integer) vqq.a.get(str);
        if (num == null || num.intValue() != 15) {
            return null;
        }
        return xvd.f(this.a);
    }

    public final String a() {
        return egr.class.getSimpleName();
    }
}
