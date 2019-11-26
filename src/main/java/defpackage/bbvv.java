package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbvv */
final class bbvv extends AtomicReference implements bbmo, bbnc {
    public static final long serialVersionUID = 8094547886072529208L;
    private final bbmo a;
    private final AtomicReference b = new AtomicReference();

    bbvv(bbmo bbmo) {
        this.a = bbmo;
    }

    public final void a(bbnc bbnc) {
        bbnz.b(this.b, bbnc);
    }

    public final void b_(Object obj) {
        this.a.b_(obj);
    }

    public final void a(Throwable th) {
        this.a.a(th);
    }

    public final void a() {
        this.a.a();
    }

    public final void bK_() {
        bbnz.a(this.b);
        bbnz.a((AtomicReference) this);
    }

    public final boolean c() {
        return bbnz.a((bbnc) get());
    }
}
