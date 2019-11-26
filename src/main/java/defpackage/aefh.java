package defpackage;

/* renamed from: aefh */
public final class aefh {
    public aefk a;
    private final xci b;
    private final xsc c;

    public aefh(xci xci, xsc xsc) {
        this.b = xci;
        this.c = xsc;
    }

    public final void a(aefs aefs) {
        this.b.d(aefs);
        aefk aefk = this.a;
        if (aefk != null) {
            acxt a = aefk.a();
            if (a != null) {
                a(a, aefs);
                aefs.a(a);
            }
        }
    }

    public final void a(aehe aehe) {
        this.b.d(aehe);
        aefk aefk = this.a;
        if (aefk != null) {
            acxt a = aefk.a();
            if (a != null) {
                a(a, aehe);
            }
        }
    }

    private final void a(acxt acxt, xbb xbb) {
        if (!amqu.a(xbb.g)) {
            if (xbb.b()) {
                long b = this.c.b();
                acxt.a(xbb.g, this.c.a() - (b - xbb.a()));
                return;
            }
            acxt.a(xbb.g);
        }
    }
}
