package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bbpv */
final class bbpv extends AtomicInteger implements bblv {
    public static final long serialVersionUID = -7965400327305809232L;
    public final bboe a = new bboe();
    private final bblv b;
    private final bblx[] c;
    private int d;

    bbpv(bblv bblv, bblx[] bblxArr) {
        this.b = bblv;
        this.c = bblxArr;
    }

    public final void a(bbnc bbnc) {
        bbnz.c(this.a, bbnc);
    }

    public final void a_(Throwable th) {
        this.b.a_(th);
    }

    public final void bL_() {
        b();
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (!this.a.c() && getAndIncrement() == 0) {
            bblx[] bblxArr = this.c;
            while (!this.a.c()) {
                int i = this.d;
                this.d = i + 1;
                if (i != bblxArr.length) {
                    bblxArr[i].a(this);
                    if (decrementAndGet() == 0) {
                        break;
                    }
                }
                this.b.bL_();
                return;
            }
        }
    }
}
