package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: szh */
final class szh implements bbmo {
    private final AtomicBoolean a = new AtomicBoolean();
    private final /* synthetic */ bbmo b;
    private final /* synthetic */ szi c;

    szh(szi szi, bbmo bbmo) {
        this.c = szi;
        this.b = bbmo;
    }

    public final void a(bbnc bbnc) {
        this.b.a(bbnc);
    }

    public final void b_(Object obj) {
        if (this.a.compareAndSet(false, true)) {
            try {
                this.c.a.accept(obj);
            } catch (Exception e) {
                throw new sxf("Error happened with doOnFirst Action", e);
            }
        }
        this.b.b_(obj);
    }

    public final void a(Throwable th) {
        this.b.a(th);
    }

    public final void a() {
        this.b.a();
    }
}
