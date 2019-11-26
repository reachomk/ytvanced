package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbwx */
final class bbwx extends AtomicReference implements bbmr, bbnc, Runnable {
    public static final long serialVersionUID = 7000911171163930287L;
    public final bboe a = new bboe();
    private final bbmr b;
    private final bbmu c;

    bbwx(bbmr bbmr, bbmu bbmu) {
        this.b = bbmr;
        this.c = bbmu;
    }

    public final void a(bbnc bbnc) {
        bbnz.b(this, bbnc);
    }

    public final void d_(Object obj) {
        this.b.d_(obj);
    }

    public final void a_(Throwable th) {
        this.b.a_(th);
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
        bbnz.a(this.a);
    }

    public final boolean c() {
        return bbnz.a((bbnc) get());
    }

    public final void run() {
        this.c.a(this);
    }
}
