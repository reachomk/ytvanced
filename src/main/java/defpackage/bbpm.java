package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbpm */
public final class bbpm extends AtomicReference implements bbmr, bbnc {
    public static final long serialVersionUID = -7012088219455310787L;
    private final bbnw a;
    private final bbnw b;

    public bbpm(bbnw bbnw, bbnw bbnw2) {
        this.a = bbnw;
        this.b = bbnw2;
    }

    public final void a_(Throwable th) {
        lazySet(bbnz.a);
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            bbnm.a(th2);
            bbzf.a(new bbnf(th, th2));
        }
    }

    public final void a(bbnc bbnc) {
        bbnz.b(this, bbnc);
    }

    public final void d_(Object obj) {
        lazySet(bbnz.a);
        try {
            this.a.accept(obj);
        } catch (Throwable th) {
            bbnm.a(th);
            bbzf.a(th);
        }
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
    }

    public final boolean c() {
        return get() == bbnz.a;
    }
}
