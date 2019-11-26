package defpackage;

import android.os.Looper;

/* renamed from: skt */
public final class skt implements swd {
    private final sko a;

    public skt(sko sko) {
        this.a = sko;
    }

    public final anwy a() {
        return aqwn.b;
    }

    public final /* synthetic */ bblt a(Object obj, swg swg) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.a.a();
            return bblt.a();
        }
        sko sko = this.a;
        sko.getClass();
        return bblt.a(new skw(sko)).b(bbmt.a());
    }
}
