package defpackage;

/* renamed from: lgr */
public final class lgr implements luy {
    private final lhg a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final xci e;
    private final bcaa f;
    private boolean g = false;

    public lgr(lhg lhg, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, xci xci, bcaa bcaa4) {
        this.a = lhg;
        this.b = bcaa;
        this.c = bcaa2;
        this.d = bcaa3;
        this.e = xci;
        this.f = bcaa4;
    }

    public final void a() {
        if (!this.g) {
            Enum enumR;
            this.g = true;
            aikc aikc = (aikc) this.b.get();
            this.a.b(aikc);
            this.a.a(aikc);
            aikd aikd = (lhb) this.f.get();
            aikd.b.a((Object) aikd);
            ((aikf) aikd.a.get()).a(aikd);
            if (((adqf) this.d.get()).c() != null) {
                enumR = adnw.REMOTE;
            } else {
                enumR = adnw.LOCAL;
            }
            this.e.a(((adnt) this.c.get()).a);
            ((adnt) this.c.get()).a(enumR);
        }
    }
}
