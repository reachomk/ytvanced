package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bcwr */
final class bcwr extends bcwn {
    public static final long serialVersionUID = 4023437720691792495L;
    private final AtomicReference b = new AtomicReference();
    private Throwable c;
    private volatile boolean d;
    private final AtomicInteger e = new AtomicInteger();

    public bcwr(bcup bcup) {
        super(bcup);
    }

    public final void e_(Object obj) {
        this.b.set(bcwf.a(obj));
        f();
    }

    public final void a(Throwable th) {
        this.c = th;
        this.d = true;
        f();
    }

    public final void bM_() {
        this.d = true;
        f();
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        f();
    }

    /* Access modifiers changed, original: final */
    public final void e() {
        if (this.e.getAndIncrement() == 0) {
            this.b.lazySet(null);
        }
    }

    private final void f() {
        if (this.e.getAndIncrement() == 0) {
            bcup bcup = this.a;
            AtomicReference atomicReference = this.b;
            int i = 1;
            while (true) {
                Throwable th;
                long j = get();
                long j2 = 0;
                while (j2 != j) {
                    if (bcup.c()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z = this.d;
                    Object andSet = atomicReference.getAndSet(null);
                    if (z) {
                        if (andSet == null) {
                            th = this.c;
                            if (th != null) {
                                super.a(th);
                                return;
                            } else {
                                super.bM_();
                                return;
                            }
                        }
                    } else if (andSet == null) {
                        break;
                    }
                    bcup.e_(bcwf.e(andSet));
                    j2++;
                }
                if (j2 == j) {
                    if (bcup.c()) {
                        atomicReference.lazySet(null);
                        return;
                    }
                    boolean z2 = this.d;
                    Object obj = atomicReference.get();
                    if (z2 && obj == null) {
                        th = this.c;
                        if (th != null) {
                            super.a(th);
                            return;
                        } else {
                            super.bM_();
                            return;
                        }
                    }
                }
                if (j2 != 0) {
                    bcvu.b((AtomicLong) this, j2);
                }
                i = this.e.addAndGet(-i);
                if (i == 0) {
                    break;
                }
            }
        }
    }
}
