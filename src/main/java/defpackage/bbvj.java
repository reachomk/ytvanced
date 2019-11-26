package defpackage;

/* renamed from: bbvj */
final class bbvj implements bbmo, bbnc {
    private final bbmo a;
    private final bbnv b;
    private bbnc c;

    bbvj(bbmo bbmo, bbnv bbnv) {
        this.a = bbmo;
        this.b = bbnv;
    }

    public final void a(bbnc bbnc) {
        if (bbnz.a(this.c, bbnc)) {
            this.c = bbnc;
            this.a.a((bbnc) this);
        }
    }

    public final void bK_() {
        this.c.bK_();
    }

    public final boolean c() {
        return this.c.c();
    }

    public final void b_(Object obj) {
        this.a.b_(obj);
    }

    public final void a(Throwable th) {
        Throwable nullPointerException;
        try {
            Object a = this.b.a(th);
            if (a == null) {
                nullPointerException = new NullPointerException("The supplied value is null");
                nullPointerException.initCause(th);
                this.a.a(nullPointerException);
                return;
            }
            this.a.b_(a);
            this.a.a();
        } catch (Throwable nullPointerException2) {
            bbnm.a(nullPointerException2);
            this.a.a(new bbnf(th, nullPointerException2));
        }
    }

    public final void a() {
        this.a.a();
    }
}
