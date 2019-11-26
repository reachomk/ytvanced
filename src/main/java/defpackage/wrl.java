package defpackage;

import android.os.Looper;

/* renamed from: wrl */
public final class wrl implements swd {
    private final wsa a;

    public wrl(wsa wsa) {
        this.a = wsa;
    }

    public final anwy a() {
        return aqwp.b;
    }

    public final /* synthetic */ bblt a(Object obj, swg swg) {
        if (Looper.myLooper() == Looper.getMainLooper() && this.a.c()) {
            this.a.a();
            return bblt.a();
        }
        wsa wsa = this.a;
        wsa.getClass();
        return bblt.a(new wrk(wsa)).b(bbmt.a());
    }
}
