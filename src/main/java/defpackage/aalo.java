package defpackage;

import android.content.Context;
import android.telephony.TelephonyManager;

/* renamed from: aalo */
public final class aalo implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;
    private final bcaa i;
    private final bcaa j;
    private final bcaa k;
    private final bcaa l;
    private final bcaa m;

    private aalo(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12, bcaa bcaa13) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
        this.g = bcaa7;
        this.h = bcaa8;
        this.i = bcaa9;
        this.j = bcaa10;
        this.k = bcaa11;
        this.l = bcaa12;
        this.m = bcaa13;
    }

    public static aalo a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12, bcaa bcaa13) {
        return new aalo(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7, bcaa8, bcaa9, bcaa10, bcaa11, bcaa12, bcaa13);
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        ashr ashr = (ashr) this.b.get();
        TelephonyManager telephonyManager = (TelephonyManager) this.c.get();
        xsc xsc = (xsc) this.d.get();
        bcaa bcaa = this.e;
        this.f.get();
        this.g.get();
        return new aalk(context, ashr, telephonyManager, xsc, bcaa, this.h, (zzl) this.i.get(), (zyw) this.j.get(), (aalp) this.k.get(), (xhv) this.l.get(), (aaex) this.m.get());
    }
}
