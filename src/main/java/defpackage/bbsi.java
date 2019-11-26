package defpackage;

/* renamed from: bbsi */
final class bbsi implements bbmd, bbnc {
    private final bbmd a;
    private final bbsf b;
    private bbnc c;

    bbsi(bbmd bbmd, bbsf bbsf) {
        this.a = bbmd;
        this.b = bbsf;
    }

    public final void bK_() {
        try {
            this.b.g.a();
        } catch (Throwable th) {
            bbnm.a(th);
            bbzf.a(th);
        }
        this.c.bK_();
        this.c = bbnz.a;
    }

    public final boolean c() {
        return this.c.c();
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.c, bbnc)) {
            try {
                this.b.b.accept(bbnc);
                this.c = bbnc;
                this.a.a(this);
            } catch (Throwable th) {
                bbnm.a(th);
                bbnc.bK_();
                this.c = bbnz.a;
                bbmd bbmd = this.a;
                bbmd.a(bboc.INSTANCE);
                bbmd.a_(th);
            }
        }
    }

    public final void d_(Object obj) {
        if (this.c != bbnz.a) {
            try {
                this.b.c.accept(obj);
                this.c = bbnz.a;
                this.a.d_(obj);
                b();
            } catch (Throwable th) {
                bbnm.a(th);
                b(th);
            }
        }
    }

    public final void a_(Throwable th) {
        if (this.c == bbnz.a) {
            bbzf.a(th);
        } else {
            b(th);
        }
    }

    private final void b(Throwable th) {
        try {
            this.b.d.accept(th);
        } catch (Throwable th2) {
            bbnm.a(th2);
            th = new bbnf(th, th2);
        }
        this.c = bbnz.a;
        this.a.a_(th);
        b();
    }

    public final void bL_() {
        if (this.c != bbnz.a) {
            try {
                this.b.e.a();
                this.c = bbnz.a;
                this.a.bL_();
                b();
            } catch (Throwable th) {
                bbnm.a(th);
                b(th);
            }
        }
    }

    private final void b() {
        try {
            this.b.f.a();
        } catch (Throwable th) {
            bbnm.a(th);
            bbzf.a(th);
        }
    }
}
