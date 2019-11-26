package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbri */
final class bbri extends AtomicInteger implements bbmb, bctr {
    public static final long serialVersionUID = 163080509307634843L;
    private final bcto a;
    private bctr b;
    private volatile boolean c;
    private Throwable d;
    private volatile boolean e;
    private final AtomicLong f = new AtomicLong();
    private final AtomicReference g = new AtomicReference();

    bbri(bcto bcto) {
        this.a = bcto;
    }

    public final void a(bctr bctr) {
        if (bbyq.a(this.b, bctr)) {
            this.b = bctr;
            this.a.a((bctr) this);
            bctr.b(Long.MAX_VALUE);
        }
    }

    public final void c_(Object obj) {
        this.g.lazySet(obj);
        b();
    }

    public final void a(Throwable th) {
        this.d = th;
        this.c = true;
        b();
    }

    public final void a() {
        this.c = true;
        b();
    }

    public final void b(long j) {
        if (bbyq.a(j)) {
            bbyu.a(this.f, j);
            b();
        }
    }

    public final void d() {
        if (!this.e) {
            this.e = true;
            this.b.d();
            if (getAndIncrement() == 0) {
                this.g.lazySet(null);
            }
        }
    }

    private final void b() {
        if (getAndIncrement() == 0) {
            bcto bcto = this.a;
            AtomicLong atomicLong = this.f;
            AtomicReference atomicReference = this.g;
            int i = 1;
            while (true) {
                boolean z;
                boolean z2;
                long j = 0;
                while (true) {
                    z = false;
                    if (j == atomicLong.get()) {
                        break;
                    }
                    z2 = this.c;
                    Object andSet = atomicReference.getAndSet(null);
                    boolean z3 = andSet == null;
                    if (!a(z2, z3, bcto, atomicReference)) {
                        if (z3) {
                            break;
                        }
                        bcto.c_(andSet);
                        j++;
                    } else {
                        return;
                    }
                }
                if (j == atomicLong.get()) {
                    z2 = this.c;
                    if (atomicReference.get() == null) {
                        z = true;
                    }
                    if (a(z2, z, bcto, atomicReference)) {
                        return;
                    }
                }
                if (j != 0) {
                    long j2;
                    long j3;
                    do {
                        j2 = atomicLong.get();
                        if (j2 == Long.MAX_VALUE) {
                            break;
                        }
                        j3 = j2 - j;
                        if (j3 < 0) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("More produced than requested: ");
                            stringBuilder.append(j3);
                            bbzf.a(new IllegalStateException(stringBuilder.toString()));
                            j3 = 0;
                        }
                    } while (!atomicLong.compareAndSet(j2, j3));
                }
                i = addAndGet(-i);
                if (i == 0) {
                    break;
                }
            }
        }
    }

    private final boolean a(boolean z, boolean z2, bcto bcto, AtomicReference atomicReference) {
        if (this.e) {
            atomicReference.lazySet(null);
            return true;
        }
        if (z) {
            Throwable th = this.d;
            if (th != null) {
                atomicReference.lazySet(null);
                bcto.a(th);
                return true;
            } else if (z2) {
                bcto.a();
                return true;
            }
        }
        return false;
    }
}
