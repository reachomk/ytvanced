package defpackage;

/* renamed from: bcxa */
final class bcxa extends bcup {
    private final bcup a;
    private final bcvq b;
    private boolean c;

    public bcxa(bcup bcup, bcvq bcvq) {
        this.a = bcup;
        this.b = bcvq;
    }

    public final void e_(Object obj) {
        try {
            obj = this.b.a(obj);
            this.a.e_(obj);
        } catch (Throwable th) {
            bcva.b(th);
            b();
            a(bcvh.a(th, obj));
        }
    }

    public final void a(Throwable th) {
        if (this.c) {
            bdeh.a(th);
            return;
        }
        this.c = true;
        this.a.a(th);
    }

    public final void bM_() {
        if (!this.c) {
            this.a.bM_();
        }
    }

    public final void a(bcuc bcuc) {
        this.a.a(bcuc);
    }
}
