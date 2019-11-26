package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbym */
public final class bbym extends AtomicReference implements bbmb, bbnc, bctr {
    public static final long serialVersionUID = -7251123623727029452L;
    private final bbnw a;
    private final bbnw b;
    private final bbnp c;
    private final bbnw d;

    public bbym(bbnw bbnw, bbnw bbnw2, bbnp bbnp, bbnw bbnw3) {
        this.a = bbnw;
        this.b = bbnw2;
        this.c = bbnp;
        this.d = bbnw3;
    }

    public final void a(bctr bctr) {
        if (bbyq.a((AtomicReference) this, bctr)) {
            try {
                this.d.accept(this);
            } catch (Throwable th) {
                bbnm.a(th);
                bctr.d();
                a(th);
            }
        }
    }

    public final void c_(Object obj) {
        if (!c()) {
            try {
                this.a.accept(obj);
            } catch (Throwable th) {
                bbnm.a(th);
                ((bctr) get()).d();
                a(th);
            }
        }
    }

    public final void a(Throwable th) {
        if (get() != bbyq.a) {
            lazySet(bbyq.a);
            try {
                this.b.accept(th);
                return;
            } catch (Throwable th2) {
                bbnm.a(th2);
                bbzf.a(new bbnf(th, th2));
                return;
            }
        }
        bbzf.a(th);
    }

    public final void a() {
        if (get() != bbyq.a) {
            lazySet(bbyq.a);
            try {
                this.c.a();
            } catch (Throwable th) {
                bbnm.a(th);
                bbzf.a(th);
            }
        }
    }

    public final void bK_() {
        bbyq.a((AtomicReference) this);
    }

    public final boolean c() {
        return get() == bbyq.a;
    }

    public final void b(long j) {
        ((bctr) get()).b(j);
    }

    public final void d() {
        bbyq.a((AtomicReference) this);
    }
}
