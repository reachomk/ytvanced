package defpackage;

import android.text.TextUtils;

/* renamed from: jww */
final /* synthetic */ class jww implements jwv {
    private final jwx a;

    jww(jwx jwx) {
        this.a = jwx;
    }

    public final void a(auvj auvj, String str) {
        jwx jwx = this.a;
        if (TextUtils.equals(str, jwx.b())) {
            apxu d = abmk.d(auvj);
            if (d == null) {
                d = abmk.c(auvj);
            }
            if (d != null) {
                jwx.a.a(d, null);
            }
        }
    }
}
