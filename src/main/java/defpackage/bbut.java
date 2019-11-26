package defpackage;

/* renamed from: bbut */
final class bbut implements bbmb, bbnc {
    private final bbmo a;
    private bctr b;

    bbut(bbmo bbmo) {
        this.a = bbmo;
    }

    public final void a() {
        this.a.a();
    }

    public final void a(Throwable th) {
        this.a.a(th);
    }

    public final void c_(Object obj) {
        this.a.b_(obj);
    }

    public final void a(bctr bctr) {
        if (bbyq.a(this.b, bctr)) {
            this.b = bctr;
            this.a.a((bbnc) this);
            bctr.b(Long.MAX_VALUE);
        }
    }

    public final void bK_() {
        this.b.d();
        this.b = bbyq.a;
    }

    public final boolean c() {
        return this.b == bbyq.a;
    }
}
