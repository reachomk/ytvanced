package defpackage;

/* renamed from: bbqn */
final class bbqn implements bblv, bbnc {
    private final bblv a;
    private bbnc b;
    private final /* synthetic */ bbqo c;

    bbqn(bbqo bbqo, bblv bblv) {
        this.c = bbqo;
        this.a = bblv;
    }

    public final void a(bbnc bbnc) {
        try {
            this.c.a.accept(bbnc);
            if (bbnz.a(this.b, bbnc)) {
                this.b = bbnc;
                this.a.a(this);
            }
        } catch (Throwable th) {
            bbnm.a(th);
            bbnc.bK_();
            this.b = bbnz.a;
            bboc.a(th, this.a);
        }
    }

    public final void a_(Throwable th) {
        if (this.b == bbnz.a) {
            bbzf.a(th);
            return;
        }
        try {
            this.c.b.accept(th);
            this.c.d.a();
        } catch (Throwable th2) {
            bbnm.a(th2);
            th = new bbnf(th, th2);
        }
        this.a.a_(th);
        b();
    }

    public final void bL_() {
        if (this.b != bbnz.a) {
            try {
                this.c.c.a();
                this.c.d.a();
                this.a.bL_();
                b();
            } catch (Throwable th) {
                bbnm.a(th);
                this.a.a_(th);
            }
        }
    }

    private final void b() {
        try {
            this.c.e.a();
        } catch (Throwable th) {
            bbnm.a(th);
            bbzf.a(th);
        }
    }

    public final void bK_() {
        try {
            this.c.f.a();
        } catch (Throwable th) {
            bbnm.a(th);
            bbzf.a(th);
        }
        this.b.bK_();
    }

    public final boolean c() {
        return this.b.c();
    }
}
