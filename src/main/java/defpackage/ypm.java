package defpackage;

import android.text.TextUtils;

/* renamed from: ypm */
final class ypm extends bbze {
    private final /* synthetic */ ypf a;

    ypm(ypf ypf) {
        this.a = ypf;
    }

    public final void a() {
    }

    public final void a(Throwable th) {
    }

    public final /* synthetic */ void b_(Object obj) {
        aadz aadz = (aadz) obj;
        ypf ypf = this.a;
        ykd ykd = (ykd) aadz.c();
        if (ykd != null && ykd.b() && !TextUtils.equals(ypf.u, ykd.getReadReceiptText())) {
            ypf.u = ykd.getReadReceiptText();
            if (ypf.t != null) {
                ypf.f();
            }
        }
    }
}
