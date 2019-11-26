package defpackage;

/* renamed from: acyu */
public final class acyu implements aebi {
    private final xci a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;
    private final bcaa h;
    private final bcaa i;
    private boolean j;
    private boolean k;

    public acyu(xci xci, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8) {
        this.a = xci;
        this.b = bcaa;
        this.c = bcaa2;
        this.d = bcaa3;
        this.e = bcaa4;
        this.f = bcaa5;
        this.g = bcaa6;
        this.h = bcaa7;
        this.i = bcaa8;
    }

    public final synchronized void a() {
        if (!this.j) {
            this.j = true;
            this.a.a(((adnc) this.b.get()).d);
            this.a.a(this.d.get());
            this.a.a(this.e.get());
            this.a.a(((adfv) this.c.get()).r);
            ((adcm) this.g.get()).a((acya) this.f.get());
            ((adhk) this.h.get()).a();
            ((adef) this.i.get()).a();
        }
    }

    public final synchronized void b() {
        if (!this.k) {
            this.k = true;
            ((adhk) this.h.get()).a();
        }
    }
}
