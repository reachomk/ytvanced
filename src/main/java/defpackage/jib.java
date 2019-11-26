package defpackage;

/* renamed from: jib */
final class jib extends apc {
    private final jic a;
    private final akpd b;

    public jib(jic jic, akpd akpd) {
        this.a = jic;
        this.b = akpd;
        b();
    }

    public final void a() {
        b();
    }

    public final void a(int i, int i2) {
        b();
    }

    public final void b(int i, int i2) {
        b();
    }

    public final void c(int i, int i2) {
        b();
    }

    public final void d(int i, int i2) {
        b();
    }

    private final void b() {
        jic jic;
        if (this.b.a() > 0) {
            jic = this.a;
            jic.d.setVisibility(0);
            jic.e();
            if (jic.a == null) {
                jic.a = new jie(jic);
                jic.c.o.a(jic.a);
                return;
            }
            return;
        }
        jic = this.a;
        jic.d.setVisibility(8);
        jic.d();
        apv apv = jic.a;
        if (apv != null) {
            jic.c.o.b(apv);
            jic.a = null;
        }
    }
}
