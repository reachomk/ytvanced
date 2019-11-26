package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: pbj */
public final class pbj {
    public final rnf a;

    public pbj(Context context) {
        this.a = new rnf(context);
        pzr.a((Object) context, (Object) "Context cannot be null");
    }

    public final void a(pbg pbg) {
        rnf rnf = this.a;
        rnb rnb = pbg.a;
        try {
            if (rnf.e == null) {
                rkz rkz;
                String str = "loadAd";
                if (rnf.f == null) {
                    rnf.a(str);
                }
                if (rnf.i) {
                    rkz rkz2 = new rkz("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
                } else {
                    rkz = new rkz();
                }
                rkz rkz3 = rkz;
                rle b = rlj.b();
                Context context = rnf.b;
                rnf.e = (rlz) new rli(b, context, rkz3, rnf.f, rnf.a).a(context, false);
                pbc pbc = rnf.c;
                if (pbc != null) {
                    rnf.e.a(new rku(pbc));
                }
                rks rks = rnf.d;
                if (rks != null) {
                    rnf.e.a(new rkr(rks));
                }
                pee pee = rnf.g;
                if (pee != null) {
                    rnf.e.a(new rkv(pee));
                }
                pec pec = rnf.h;
                if (pec != null) {
                    rnf.e.a(new qlz(pec));
                }
                rnf.e.a(rnf.j);
            }
            if (rnf.e.a(rla.a(rnf.b, rnb))) {
                rnf.a.a = rnb.h;
            }
        } catch (RemoteException e) {
            qml.c("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void a(String str) {
        rnf rnf = this.a;
        if (rnf.f == null) {
            rnf.f = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on InterstitialAd.");
    }

    public final void a() {
        rnf rnf = this.a;
        try {
            rnf.a("show");
            rnf.e.f();
        } catch (RemoteException e) {
            qml.c("#008 Must be called on the main UI thread.", e);
        }
    }

    public final void a(boolean z) {
        rnf rnf = this.a;
        try {
            rnf.j = z;
            rlz rlz = rnf.e;
            if (rlz != null) {
                rlz.a(z);
            }
        } catch (RemoteException e) {
            qml.c("#008 Must be called on the main UI thread.", e);
        }
    }
}
