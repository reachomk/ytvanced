package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbqh */
final class bbqh extends AtomicReference implements bblv, bbnc {
    public static final long serialVersionUID = 251330541679988317L;
    private final /* synthetic */ bbqi a;

    bbqh(bbqi bbqi) {
        this.a = bbqi;
    }

    public final void a(bbnc bbnc) {
        bbnz.b(this, bbnc);
    }

    public final void a_(Throwable th) {
        bbqi bbqi = this.a;
        bbqi.e.c(this);
        if (!bbqi.c) {
            bbqi.f.d();
            bbqi.e.bK_();
            if (!bbyw.a(bbqi.d, th)) {
                bbzf.a(th);
            } else if (bbqi.getAndSet(0) > 0) {
                bbqi.a.a_(bbyw.a(bbqi.d));
            }
        } else if (!bbyw.a(bbqi.d, th)) {
            bbzf.a(th);
        } else if (bbqi.decrementAndGet() == 0) {
            bbqi.a.a_(bbyw.a(bbqi.d));
        } else if (bbqi.b != Integer.MAX_VALUE) {
            bbqi.f.b(1);
        }
    }

    public final void bL_() {
        bbqi bbqi = this.a;
        bbqi.e.c(this);
        if (bbqi.decrementAndGet() == 0) {
            Throwable th = (Throwable) bbqi.d.get();
            if (th != null) {
                bbqi.a.a_(th);
            } else {
                bbqi.a.bL_();
            }
        } else if (bbqi.b != Integer.MAX_VALUE) {
            bbqi.f.b(1);
        }
    }

    public final boolean c() {
        return bbnz.a((bbnc) get());
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
    }
}
