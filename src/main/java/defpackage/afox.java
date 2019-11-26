package defpackage;

import android.net.Uri;

/* renamed from: afox */
final class afox implements afnx {
    afox() {
    }

    public final /* synthetic */ Object b(Object obj) {
        xhg b = xhc.b(((Uri) obj).toString());
        b.b("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        return b.a();
    }
}
