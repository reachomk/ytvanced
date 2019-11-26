package defpackage;

/* renamed from: bbpo */
public final class bbpo implements bbmo, bbnc {
    private final bbmo a;
    private final bbnw b;
    private final bbnp c;
    private bbnc d;

    public bbpo(bbmo bbmo, bbnw bbnw, bbnp bbnp) {
        this.a = bbmo;
        this.b = bbnw;
        this.c = bbnp;
    }

    public final void a(bbnc bbnc) {
        try {
            this.b.accept(bbnc);
            if (bbnz.a(this.d, bbnc)) {
                this.d = bbnc;
                this.a.a((bbnc) this);
            }
        } catch (Throwable th) {
            bbnm.a(th);
            bbnc.bK_();
            this.d = bbnz.a;
            bboc.a(th, this.a);
        }
    }

    public final void b_(Object obj) {
        this.a.b_(obj);
    }

    public final void a(Throwable th) {
        if (this.d != bbnz.a) {
            this.a.a(th);
        } else {
            bbzf.a(th);
        }
    }

    public final void a() {
        if (this.d != bbnz.a) {
            this.a.a();
        }
    }

    public final void bK_() {
        try {
            this.c.a();
        } catch (Throwable th) {
            bbnm.a(th);
            bbzf.a(th);
        }
        this.d.bK_();
    }

    public final boolean c() {
        return this.d.c();
    }
}
