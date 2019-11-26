package defpackage;

/* renamed from: cdw */
public final class cdw extends cdi implements bvp {
    public cdw(cdr cdr) {
        super(cdr);
    }

    public final Class a() {
        return cdr.class;
    }

    public final int c() {
        cdy cdy = ((cdr) this.a).a.a;
        return cdy.a.f() + chv.a(cdy.c().getWidth(), cdy.c().getHeight(), cdy.c().getConfig());
    }

    public final void d() {
        ((cdr) this.a).stop();
        cdr cdr = (cdr) this.a;
        cdr.b = true;
        cdy cdy = cdr.a.a;
        cdy.b.clear();
        cdy.e();
        cdy.b();
        cgu cgu = cdy.e;
        if (cgu != null) {
            cdy.c.a(cgu);
            cdy.e = null;
        }
        cgu = cdy.g;
        if (cgu != null) {
            cdy.c.a(cgu);
            cdy.g = null;
        }
        cgu = cdy.i;
        if (cgu != null) {
            cdy.c.a(cgu);
            cdy.i = null;
        }
        cdy.a.h();
        cdy.f = true;
    }

    public final void e() {
        ((cdr) this.a).a().prepareToDraw();
    }
}
