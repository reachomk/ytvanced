package defpackage;

/* renamed from: luv */
public final class luv extends lur {
    private final enl a;
    private final lrd b;
    private final lqu c = new lqu();

    public luv(enl enl, lrd lrd) {
        this.a = enl;
        this.b = lrd;
    }

    public final lqt b() {
        return this.c;
    }

    public final void a(eja eja) {
        Object obj;
        if (eja == null) {
            obj = null;
        } else {
            obj = new lqz((aamj) lrd.a((aamj) this.b.a.get(), 1), (enm) lrd.a(this.a.a(eja.a()), 2));
        }
        lqu lqu = this.c;
        if (!amqq.a(obj, lqu.c)) {
            lqz lqz = lqu.c;
            if (lqz != null) {
                lqz.a(false);
            }
            int d = lqu.d();
            lqu.c = obj;
            if (obj != null) {
                obj.a(true);
            }
            int d2 = lqu.d();
            if (d > d2) {
                for (akng g_ : lqu.a) {
                    g_.g_(0, d - d2);
                }
            } else if (d < d2) {
                for (akng g_2 : lqu.a) {
                    g_2.e_(0, d2 - d);
                }
            }
            for (lqw a : lqu.b) {
                a.a(lqu.c);
            }
        }
    }
}
