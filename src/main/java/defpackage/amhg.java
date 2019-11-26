package defpackage;

import java.util.Arrays;

/* renamed from: amhg */
public final class amhg implements amif {
    private final amir a;
    private final amgr b;
    private final amgb c;
    private final amhm d;
    private final amhf e;
    private final amga f;
    private final amhe g;
    private final amhz h;
    private final amfu i;
    private final amhc j;

    public amhg(amir amir, amgr amgr, amgb amgb, amhm amhm, amhf amhf, amga amga, amhe amhe, amhz amhz, amfu amfu, amhc amhc) {
        this.a = amir;
        this.b = amgr;
        this.c = amgb;
        this.d = amhm;
        this.e = amhf;
        this.f = amga;
        this.g = amhe;
        this.h = amhz;
        this.i = amfu;
        this.j = amhc;
    }

    public final amje a(String str) {
        amje a = this.a.a(str, this.b);
        amje a2 = this.a.a(str, this.e).a(this.f);
        a2 = this.a.a(Arrays.asList(new amje[]{a, a2}), this.c);
        amje a3 = a2.a(this.d);
        a2 = a2.a(this.g);
        return this.a.a(Arrays.asList(new amje[]{a2, a3}), this.i).a(this.h).a(this.j);
    }
}
