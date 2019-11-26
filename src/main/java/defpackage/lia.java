package defpackage;

/* renamed from: lia */
public final class lia implements lra {
    public boolean a;
    public leh b;
    private final lij c;
    private final lix d;
    private final lix e;
    private lix f;

    public lia(lij lij) {
        lib lib = new lib();
        liq liq = new liq();
        this.c = lij;
        this.d = lib;
        this.e = liq;
    }

    public final void a() {
        leh leh = this.b;
        if (leh == null) {
            if (this.a) {
                a(this.d);
            } else {
                b();
            }
        } else if (leh instanceof lfk) {
            a(this.e);
        } else {
            a(this.d);
        }
    }

    private final void b() {
        this.f = null;
        if (this.c.a(0) != null) {
            this.c.a(0, false);
        }
    }

    private final void a(lix lix) {
        if (lix != this.f) {
            this.c.a(lix);
            if (lix instanceof lib) {
                this.c.a(1, false);
            }
            this.f = lix;
        }
    }

    public final void a(lqz lqz, lqz lqz2) {
        b();
    }
}
