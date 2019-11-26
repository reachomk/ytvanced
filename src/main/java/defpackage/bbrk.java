package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbrk */
public final class bbrk extends AtomicReference implements bbmd, bbnc {
    public static final long serialVersionUID = -6076952298809384986L;
    private final bbnw a;
    private final bbnw b;
    private final bbnp c;

    public bbrk(bbnw bbnw, bbnw bbnw2, bbnp bbnp) {
        this.a = bbnw;
        this.b = bbnw2;
        this.c = bbnp;
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
    }

    public final boolean c() {
        return bbnz.a((bbnc) get());
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

    public final void a_(Throwable th) {
        lazySet(bbnz.a);
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            bbnm.a(th2);
            bbzf.a(new bbnf(th, th2));
        }
    }

    public final void bL_() {
        lazySet(bbnz.a);
        try {
            this.c.a();
        } catch (Throwable th) {
            bbnm.a(th);
            bbzf.a(th);
        }
    }
}
