package defpackage;

/* renamed from: liu */
public final class liu implements adqi, lra, lrm {
    private static final lid a = new lid(4, 2.4f);
    private final adqf b;
    private final lij c;

    public liu(adqf adqf, lij lij) {
        this.b = adqf;
        this.c = lij;
    }

    public final void a(adqe adqe) {
    }

    public final void a(int i, int i2) {
        boolean b = lrh.b(i);
        boolean b2 = lrh.b(i2);
        if (b == b2) {
            return;
        }
        if (b2) {
            this.b.a((adqi) this);
            a();
            return;
        }
        this.b.b((adqi) this);
    }

    public final void a(lqz lqz, lqz lqz2) {
        if (b()) {
            this.c.a(a);
        }
    }

    public final void b(adqe adqe) {
        a();
    }

    public final void c(adqe adqe) {
        a();
    }

    private final void a() {
        if (b()) {
            this.c.a(a);
            return;
        }
        if (this.c.a(4) != null) {
            this.c.a(0, false);
        }
    }

    private final boolean b() {
        return this.b.c() != null;
    }
}
