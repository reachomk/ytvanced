package defpackage;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bcye */
final class bcye extends bcup implements bcvl {
    public final bcup a;
    public final bcue b;
    public final AtomicLong c = new AtomicLong();
    private final boolean d;
    private final Queue e;
    private final int f;
    private volatile boolean g;
    private final AtomicLong h = new AtomicLong();
    private Throwable i;
    private long j;

    public bcye(bcuf bcuf, bcup bcup, int i) {
        this.a = bcup;
        this.b = bcuf.a();
        this.d = false;
        if (i <= 0) {
            i = bdch.c;
        }
        this.f = i - (i >> 2);
        if (bddx.a()) {
            this.e = new bddj(i);
        } else {
            this.e = new bdcu(i);
        }
        a((long) i);
    }

    public final void e_(Object obj) {
        if (!(c() || this.g)) {
            if (this.e.offer(bcwf.a(obj))) {
                e();
            } else {
                a(new bcvd());
            }
        }
    }

    public final void bM_() {
        if (!c() && !this.g) {
            this.g = true;
            e();
        }
    }

    public final void a(Throwable th) {
        if (c() || this.g) {
            bdeh.a(th);
            return;
        }
        this.i = th;
        this.g = true;
        e();
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
        if (this.h.getAndIncrement() == 0) {
            this.b.a(this);
        }
    }

    public final void a() {
        long j = this.j;
        Queue queue = this.e;
        bcup bcup = this.a;
        long j2 = 1;
        while (true) {
            long j3 = this.c.get();
            while (j3 != j) {
                boolean z = this.g;
                Object poll = queue.poll();
                boolean z2 = poll == null;
                if (!a(z, z2, bcup, queue)) {
                    if (z2) {
                        break;
                    }
                    bcup.e_(bcwf.e(poll));
                    j++;
                    if (j == ((long) this.f)) {
                        j3 = bcvu.b(this.c, j);
                        a(j);
                        j = 0;
                    }
                } else {
                    return;
                }
            }
            if (j3 != j || !a(this.g, queue.isEmpty(), bcup, queue)) {
                this.j = j;
                j2 = this.h.addAndGet(-j2);
                if (j2 == 0) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final boolean a(boolean z, boolean z2, bcup bcup, Queue queue) {
        if (bcup.c()) {
            queue.clear();
            return true;
        }
        if (z) {
            Throwable th = this.i;
            if (th != null) {
                queue.clear();
                try {
                    bcup.a(th);
                    return true;
                } finally {
                    this.b.b();
                }
            } else if (z2) {
                try {
                    bcup.bM_();
                    return true;
                } finally {
                    this.b.b();
                }
            }
        }
        return false;
    }
}
