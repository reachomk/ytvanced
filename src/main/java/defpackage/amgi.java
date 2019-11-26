package defpackage;

import java.util.Arrays;

/* renamed from: amgi */
public final class amgi implements amif {
    private final amir a;
    private final amhr b;
    private final amgr c;
    private final amgb d;
    private final amhm e;
    private final amfw f;
    private final amhz g;
    private final amhk h;
    private final amfu i;
    private final amhc j;

    public amgi(amir amir, amhr amhr, amgr amgr, amgb amgb, amhm amhm, amfw amfw, amhz amhz, amhk amhk, amfu amfu, amhc amhc) {
        this.a = amir;
        this.b = amhr;
        this.c = amgr;
        this.d = amgb;
        this.e = amhm;
        this.f = amfw;
        this.g = amhz;
        this.h = amhk;
        this.i = amfu;
        this.j = amhc;
    }

    public final amje a(String str) {
        amje a = this.a.a(str, this.b).a(this.c).a(this.d);
        amje a2 = a.a(this.e).a(this.i);
        a = a.a(this.f).a(this.h);
        return this.a.a(Arrays.asList(new amje[]{a2, a}), this.g).a(this.j);
    }
}
