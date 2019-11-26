package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbpj */
public final class bbpj extends AtomicReference implements bblv, bbnc, bbnw {
    public static final long serialVersionUID = -4361286194466301354L;
    private final bbnw a;
    private final bbnp b;

    public bbpj(bbnp bbnp) {
        this.a = this;
        this.b = bbnp;
    }

    public bbpj(bbnw bbnw, bbnp bbnp) {
        this.a = bbnw;
        this.b = bbnp;
    }

    public final void bL_() {
        try {
            this.b.a();
        } catch (Throwable th) {
            bbnm.a(th);
            bbzf.a(th);
        }
        lazySet(bbnz.a);
    }

    public final void a_(Throwable th) {
        try {
            this.a.accept(th);
        } catch (Throwable th2) {
            bbnm.a(th2);
            bbzf.a(th2);
        }
        lazySet(bbnz.a);
    }

    public final void a(bbnc bbnc) {
        bbnz.b(this, bbnc);
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
    }

    public final boolean c() {
        return get() == bbnz.a;
    }

    public final /* synthetic */ void accept(Object obj) {
        bbzf.a(new bbno((Throwable) obj));
    }
}
