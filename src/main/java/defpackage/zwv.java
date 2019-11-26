package defpackage;

import android.content.SharedPreferences;

/* renamed from: zwv */
public final class zwv implements zxb {
    public final SharedPreferences a;
    public final xsc b;
    public final bcaa c;
    public final xci d;
    private final amro e = amrn.a(new zwu(this));
    private final amro f = amrn.a(new zwx(this));
    private final amro g = amrn.a(new zww(this));
    private final amro h = amrn.a(new zwz(this));

    public zwv(SharedPreferences sharedPreferences, xsc xsc, bcaa bcaa, xci xci) {
        this.a = sharedPreferences;
        this.b = xsc;
        this.c = bcaa;
        this.d = xci;
    }

    public final aaly a() {
        return (aaly) this.e.get();
    }

    public final zzl b() {
        return (zzl) this.f.get();
    }

    public final zyw c() {
        return (zyw) this.g.get();
    }

    public final zzf d() {
        return (zzf) this.h.get();
    }
}
