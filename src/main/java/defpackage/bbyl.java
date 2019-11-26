package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbyl */
public final class bbyl extends AtomicInteger implements bbmb, bctr {
    public static final long serialVersionUID = -4945028590049415624L;
    private final bcto a;
    private final bbyr b = new bbyr();
    private final AtomicLong c = new AtomicLong();
    private final AtomicReference d = new AtomicReference();
    private final AtomicBoolean e = new AtomicBoolean();
    private volatile boolean f;

    public bbyl(bcto bcto) {
        this.a = bcto;
    }

    public final void b(long j) {
        if (j <= 0) {
            d();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("§3.9 violated: positive request amount required but it was ");
            stringBuilder.append(j);
            a(new IllegalArgumentException(stringBuilder.toString()));
            return;
        }
        bbyq.a(this.d, this.c, j);
    }

    public final void d() {
        if (!this.f) {
            bbyq.a(this.d);
        }
    }

    public final void a(bctr bctr) {
        if (this.e.compareAndSet(false, true)) {
            this.a.a((bctr) this);
            AtomicReference atomicReference = this.d;
            AtomicLong atomicLong = this.c;
            if (bbyq.a(atomicReference, bctr)) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    bctr.b(andSet);
                }
            }
            return;
        }
        bctr.d();
        d();
        a(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    public final void c_(Object obj) {
        bcto bcto = this.a;
        AtomicReference atomicReference = this.b;
        if (get() == 0 && compareAndSet(0, 1)) {
            bcto.c_(obj);
            if (decrementAndGet() != 0) {
                Throwable a = bbyw.a(atomicReference);
                if (a != null) {
                    bcto.a(a);
                } else {
                    bcto.a();
                }
            }
        }
    }

    public final void a(Throwable th) {
        this.f = true;
        bcto bcto = this.a;
        AtomicReference atomicReference = this.b;
        if (bbyw.a(atomicReference, th)) {
            if (getAndIncrement() == 0) {
                bcto.a(bbyw.a(atomicReference));
            }
            return;
        }
        bbzf.a(th);
    }

    public final void a() {
        this.f = true;
        bcto bcto = this.a;
        AtomicReference atomicReference = this.b;
        if (getAndIncrement() == 0) {
            Throwable a = bbyw.a(atomicReference);
            if (a != null) {
                bcto.a(a);
            } else {
                bcto.a();
            }
        }
    }
}
