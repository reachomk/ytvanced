package defpackage;

import android.os.Looper;

/* renamed from: skv */
public final class skv implements swd {
    private final sko a;

    public skv(sko sko) {
        this.a = sko;
    }

    public final anwy a() {
        return aqwr.b;
    }

    public final /* synthetic */ bblt a(Object obj, swg swg) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.a.a();
            return bblt.a();
        }
        sko sko = this.a;
        sko.getClass();
        return bblt.a(new sky(sko)).b(bbmt.a());
    }
}
