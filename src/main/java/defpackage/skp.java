package defpackage;

import android.os.Looper;

/* renamed from: skp */
public final class skp implements swd {
    private final skm a;

    public skp(skm skm) {
        this.a = skm;
    }

    public final anwy a() {
        return azwv.b;
    }

    public final /* synthetic */ bblt a(Object obj, swg swg) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.a.a();
            return bblt.a();
        }
        skm skm = this.a;
        skm.getClass();
        return bblt.a(new sks(skm)).b(bbmt.a());
    }
}
