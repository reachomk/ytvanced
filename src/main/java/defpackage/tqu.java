package defpackage;

/* renamed from: tqu */
public class tqu {
    public double a = -1.0d;
    public double b = -1.0d;
    public final trn c = new trn();
    public final trn d = new trn(new double[]{tqx.k.l, tqx.j.l, tqx.i.l, tqx.h.l, tqx.g.l, tqx.f.l, tqx.e.l, tqx.d.l, tqx.c.l, tqx.b.l, tqx.a.l});

    /* Access modifiers changed, original: protected */
    public int c() {
        return 1000;
    }

    public final void a(long j, double d, double d2) {
        if (j > 0) {
            this.c.a(d, j);
            this.d.a(d2, j);
        }
        this.b = Math.max(d, this.b);
        double d3 = this.a;
        if (d3 != -1.0d) {
            d = Math.min(d, d3);
        }
        this.a = d;
    }

    public final boolean a() {
        return this.c.a(3, tqw.HALF.f) >= ((long) c());
    }

    public final Long[] b() {
        return this.c.a(3, true);
    }
}
