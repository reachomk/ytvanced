package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbpx */
final class bbpx extends AtomicReference implements bblw, bbnc {
    public static final long serialVersionUID = -2467358622224974244L;
    private final bblv a;

    bbpx(bblv bblv) {
        this.a = bblv;
    }

    public final void a() {
        if (get() != bbnz.a) {
            bbnc bbnc = (bbnc) getAndSet(bbnz.a);
            if (bbnc != bbnz.a) {
                try {
                    this.a.bL_();
                    if (bbnc != null) {
                        bbnc.bK_();
                    }
                } catch (Throwable th) {
                    if (bbnc != null) {
                        bbnc.bK_();
                    }
                }
            }
        }
    }

    public final void a(Throwable th) {
        Throwable nullPointerException = th == null ? new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.") : th;
        if (get() != bbnz.a) {
            bbnc bbnc = (bbnc) getAndSet(bbnz.a);
            if (bbnc != bbnz.a) {
                try {
                    this.a.a_(nullPointerException);
                    if (bbnc != null) {
                        bbnc.bK_();
                    }
                    return;
                } catch (Throwable th2) {
                    if (bbnc != null) {
                        bbnc.bK_();
                    }
                }
            }
        }
        bbzf.a(th);
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
    }

    public final boolean c() {
        return bbnz.a((bbnc) get());
    }

    public final String toString() {
        return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
    }
}
