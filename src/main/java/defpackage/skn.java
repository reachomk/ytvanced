package defpackage;

import android.os.Looper;

/* renamed from: skn */
public final class skn implements swd {
    public final skl a;

    public skn(skl skl) {
        this.a = skl;
    }

    public final anwy a() {
        return aqwh.j;
    }

    public final /* synthetic */ bblt a(Object obj, swg swg) {
        aqwh aqwh = (aqwh) obj;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return bblt.a(new skq(this, aqwh, swg)).b(bbmt.a());
        }
        this.a.a(aqwh, swg);
        return bblt.a();
    }
}
