package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbps */
public final class bbps extends AtomicReference implements bbmo, bbnc {
    public static final long serialVersionUID = -7251123623727029452L;
    private final bbnw a;
    private final bbnw b;
    private final bbnp c;
    private final bbnw d;

    public bbps(bbnw bbnw, bbnw bbnw2, bbnp bbnp, bbnw bbnw3) {
        this.a = bbnw;
        this.b = bbnw2;
        this.c = bbnp;
        this.d = bbnw3;
    }

    public final void a(bbnc bbnc) {
        if (bbnz.b(this, bbnc)) {
            try {
                this.d.accept(this);
            } catch (Throwable th) {
                bbnm.a(th);
                bbnc.bK_();
                a(th);
            }
        }
    }

    public final void b_(Object obj) {
        if (!c()) {
            try {
                this.a.accept(obj);
            } catch (Throwable th) {
                bbnm.a(th);
                ((bbnc) get()).bK_();
                a(th);
            }
        }
    }

    public final void a(Throwable th) {
        if (!c()) {
            lazySet(bbnz.a);
            try {
                this.b.accept(th);
            } catch (Throwable th2) {
                bbnm.a(th2);
                bbzf.a(new bbnf(th, th2));
            }
        }
    }

    public final void a() {
        if (!c()) {
            lazySet(bbnz.a);
            try {
                this.c.a();
            } catch (Throwable th) {
                bbnm.a(th);
                bbzf.a(th);
            }
        }
    }

    public final void bK_() {
        bbnz.a((AtomicReference) this);
    }

    public final boolean c() {
        return get() == bbnz.a;
    }
}
