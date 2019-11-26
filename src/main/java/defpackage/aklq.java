package defpackage;

import android.net.Uri;

/* renamed from: aklq */
final /* synthetic */ class aklq implements Runnable {
    private final brj a;
    private final wxg b;
    private final Uri c;

    aklq(brj brj, wxg wxg, Uri uri) {
        this.a = brj;
        this.b = wxg;
        this.c = uri;
    }

    public final void run() {
        brj brj = this.a;
        wxg wxg = this.b;
        Object obj = this.c;
        try {
            wxg.a(obj, (byte[]) brj.a(aocf.UNSET_ENUM_VALUE, aocf.UNSET_ENUM_VALUE).get());
        } catch (Exception e) {
            wxg.a(obj, e);
        }
    }
}
