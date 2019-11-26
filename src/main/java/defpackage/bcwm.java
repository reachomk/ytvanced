package defpackage;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bcwm */
final class bcwm extends bcwn {
    public static final long serialVersionUID = 2427151001689639875L;
    private final Queue b;
    private Throwable c;
    private volatile boolean d;
    private final AtomicInteger e;

    public bcwm(bcup bcup, int i) {
        Queue bddr;
        super(bcup);
        if (bddx.a()) {
            bddr = new bddr(i);
        } else {
            bddr = new bdcy(i);
        }
        this.b = bddr;
        this.e = new AtomicInteger();
    }

    public final void e_(Object obj) {
        this.b.offer(bcwf.a(obj));
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
            this.b.clear();
        }
    }

    private final void f() {
        if (this.e.getAndIncrement() == 0) {
            bcup bcup = this.a;
            Queue queue = this.b;
            int i = 1;
            while (true) {
                Throwable th;
                long j = get();
                long j2 = 0;
                while (j2 != j) {
                    if (bcup.c()) {
                        queue.clear();
                        return;
                    }
                    boolean z = this.d;
                    Object poll = queue.poll();
                    if (z) {
                        if (poll == null) {
                            th = this.c;
                            if (th != null) {
                                super.a(th);
                                return;
                            } else {
                                super.bM_();
                                return;
                            }
                        }
                    } else if (poll == null) {
                        break;
                    }
                    bcup.e_(bcwf.e(poll));
                    j2++;
                }
                if (j2 == j) {
                    if (bcup.c()) {
                        queue.clear();
                        return;
                    }
                    boolean z2 = this.d;
                    boolean isEmpty = queue.isEmpty();
                    if (z2 && isEmpty) {
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
