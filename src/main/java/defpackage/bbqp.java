package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbqp */
final class bbqp extends AtomicReference implements bblv, bbnc, Runnable {
    public static final long serialVersionUID = 7000911171163930287L;
    public final bboe a = new bboe();
    private final bblv b;
    private final bblx c;

    bbqp(bblv bblv, bblx bblx) {
        this.b = bblv;
        this.c = bblx;
    }

    public final void run() {
        this.c.a(this);
    }

    public final void a(bbnc bbnc) {
        bbnz.b(this, bbnc);
    }

    public final void a_(Throwable th) {
        this.b.a_(th);
    }

    public final void bL_() {
        this.b.bL_();
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
        bbnz.a(this.a);
    }

    public final boolean c() {
        return bbnz.a((bbnc) get());
    }
}
