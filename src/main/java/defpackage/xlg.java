package defpackage;

import android.net.Uri;

/* renamed from: xlg */
public final class xlg {
    public static void a(String str) {
        str = Uri.parse(str).getScheme();
        if (str == null) {
            xtl.c("HttpsEnforcer: unexpected null host");
        } else if (!"https".equalsIgnoreCase(str)) {
            throw new xld("SSL Required");
        }
    }
}
