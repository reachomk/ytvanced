package defpackage;

/* renamed from: bbtr */
final class bbtr implements bbmo, bbnc {
    private final bbmo a;
    private final bbnw b;
    private final bbnw c;
    private final bbnp d;
    private final bbnp e;
    private bbnc f;
    private boolean g;

    bbtr(bbmo bbmo, bbnw bbnw, bbnw bbnw2, bbnp bbnp, bbnp bbnp2) {
        this.a = bbmo;
        this.b = bbnw;
        this.c = bbnw2;
        this.d = bbnp;
        this.e = bbnp2;
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.f, bbnc)) {
            this.f = bbnc;
            this.a.a((bbnc) this);
        }
    }

    public final void bK_() {
        this.f.bK_();
    }

    public final boolean c() {
        return this.f.c();
    }

    public final void b_(Object obj) {
        if (!this.g) {
            try {
                this.b.accept(obj);
                this.a.b_(obj);
            } catch (Throwable th) {
                bbnm.a(th);
                this.f.bK_();
                a(th);
            }
        }
    }

    public final void a(Throwable th) {
        if (this.g) {
            bbzf.a(th);
            return;
        }
        this.g = true;
        try {
            this.c.accept(th);
        } catch (Throwable th2) {
            bbnm.a(th2);
            th = new bbnf(th, th2);
        }
        this.a.a(th);
        try {
            this.e.a();
        } catch (Throwable th3) {
            bbnm.a(th3);
            bbzf.a(th3);
        }
    }

    public final void a() {
        if (!this.g) {
            try {
                this.d.a();
                this.g = true;
                this.a.a();
                try {
                    this.e.a();
                } catch (Throwable th) {
                    bbnm.a(th);
                    bbzf.a(th);
                }
            } catch (Throwable th2) {
                bbnm.a(th2);
                a(th2);
            }
        }
    }
}
