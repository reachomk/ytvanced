package defpackage;

import android.os.Looper;

/* renamed from: skz */
public final class skz implements swd {
    public final skm a;

    public skz(skm skm) {
        this.a = skm;
    }

    public final anwy a() {
        return azxd.e;
    }

    public final /* synthetic */ bblt a(Object obj, swg swg) {
        azxd azxd = (azxd) obj;
        if ((azxd.a & 1) == 0) {
            return bblt.a();
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return bblt.a(new slc(this, azxd)).b(bbmt.a());
        }
        skm skm = this.a;
        azuj azuj = azxd.b;
        if (azuj == null) {
            azuj = azuj.c;
        }
        int a = azwt.a(azxd.c);
        if (a == 0) {
            a = 1;
        }
        skm.a(azuj, a);
        return bblt.a();
    }
}
