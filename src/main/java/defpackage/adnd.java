package defpackage;

/* renamed from: adnd */
public final class adnd extends aiwh {
    private final adna b;
    private final bcaa c;
    private final aiqf d;

    public adnd(ajlm ajlm, adna adna, bcaa bcaa, aiqf aiqf) {
        super(ajlm);
        this.b = adna;
        this.c = bcaa;
        this.d = aiqf;
    }

    public final ajlm a() {
        if (e()) {
            return this.b;
        }
        return this.a;
    }

    public final boolean b() {
        return e() ^ 1;
    }

    public final boolean c() {
        return e() ^ 1;
    }

    private final boolean e() {
        return ((adqf) this.c.get()).c() != null;
    }

    public final void d() {
        aiqf aiqf = this.d;
        boolean e = e();
        if (e != aiqf.k) {
            aiqf.k = e;
            aiqf.g();
        }
    }
}
