package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbte */
final class bbte extends AtomicReference implements bbmo {
    public static final long serialVersionUID = -7449079488798789337L;
    private final bbmo a;
    private final bbtb b;

    bbte(bbmo bbmo, bbtb bbtb) {
        this.a = bbmo;
        this.b = bbtb;
    }

    public final void a(bbnc bbnc) {
        bbnz.a((AtomicReference) this, bbnc);
    }

    public final void b_(Object obj) {
        this.a.b_(obj);
    }

    public final void a(Throwable th) {
        this.b.bK_();
        this.a.a(th);
    }

    public final void a() {
        bbtb bbtb = this.b;
        bbtb.a = false;
        bbtb.b();
    }
}
