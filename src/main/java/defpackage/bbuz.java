package defpackage;

/* renamed from: bbuz */
final class bbuz implements bbmo, bbnc {
    private final bblv a;
    private bbnc b;

    bbuz(bblv bblv) {
        this.a = bblv;
    }

    public final void b_(Object obj) {
    }

    public final void a(bbnc bbnc) {
        this.b = bbnc;
        this.a.a(this);
    }

    public final void a(Throwable th) {
        this.a.a_(th);
    }

    public final void a() {
        this.a.bL_();
    }

    public final void bK_() {
        this.b.bK_();
    }

    public final boolean c() {
        return this.b.c();
    }
}
