package defpackage;

import android.os.Looper;

/* renamed from: skr */
public final class skr implements swd {
    private final skl a;

    public skr(skl skl) {
        this.a = skl;
    }

    public final anwy a() {
        return aqwl.b;
    }

    public final /* synthetic */ bblt a(Object obj, swg swg) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.a.a();
            return bblt.a();
        }
        skl skl = this.a;
        skl.getClass();
        return bblt.a(new sku(skl)).b(bbmt.a());
    }
}
