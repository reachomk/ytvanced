package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.logging.Level;

/* renamed from: bayo */
final class bayo extends basi {
    private static final AtomicLongFieldUpdater g;
    private static final AtomicLongFieldUpdater h;
    private static final AtomicLongFieldUpdater i;
    private static final AtomicLongFieldUpdater j;
    private static final AtomicLongFieldUpdater k;
    private static final AtomicLongFieldUpdater l;
    public volatile long a;
    public volatile long b;
    public volatile long c;
    public volatile long d;
    public volatile long e;
    public volatile long f;
    private final bayj m;
    private final bbju n;

    bayo(bayj bayj, bbju bbju) {
        this.m = (bayj) amqw.a((Object) bayj, (Object) "module");
        this.n = (bbju) amqw.a((Object) bbju, (Object) "startCtx");
    }

    public final void a(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = i;
        if (atomicLongFieldUpdater != null) {
            atomicLongFieldUpdater.getAndAdd(this, j);
        } else {
            this.c += j;
        }
        this.m.a(this.n, (double) j);
    }

    public final void c(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = j;
        if (atomicLongFieldUpdater != null) {
            atomicLongFieldUpdater.getAndAdd(this, j);
        } else {
            this.d += j;
        }
        this.m.a(this.n, (double) j);
    }

    public final void b(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = k;
        if (atomicLongFieldUpdater != null) {
            atomicLongFieldUpdater.getAndAdd(this, j);
        } else {
            this.e += j;
        }
    }

    public final void d(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = l;
        if (atomicLongFieldUpdater != null) {
            atomicLongFieldUpdater.getAndAdd(this, j);
        } else {
            this.f += j;
        }
    }

    public final void c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = h;
        if (atomicLongFieldUpdater != null) {
            atomicLongFieldUpdater.getAndIncrement(this);
        } else {
            this.b++;
        }
        bayj.a(this.m, this.n);
    }

    public final void b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = g;
        if (atomicLongFieldUpdater != null) {
            atomicLongFieldUpdater.getAndIncrement(this);
        } else {
            this.a++;
        }
        bayj.a(this.m, this.n);
    }

    static {
        AtomicLongFieldUpdater newUpdater;
        AtomicLongFieldUpdater newUpdater2;
        AtomicLongFieldUpdater newUpdater3;
        AtomicLongFieldUpdater newUpdater4;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        Class cls = bayo.class;
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = null;
        try {
            AtomicLongFieldUpdater newUpdater5 = AtomicLongFieldUpdater.newUpdater(cls, "a");
            newUpdater = AtomicLongFieldUpdater.newUpdater(cls, "b");
            newUpdater2 = AtomicLongFieldUpdater.newUpdater(cls, "c");
            newUpdater3 = AtomicLongFieldUpdater.newUpdater(cls, "d");
            newUpdater4 = AtomicLongFieldUpdater.newUpdater(cls, "e");
            atomicLongFieldUpdater2 = AtomicLongFieldUpdater.newUpdater(cls, "f");
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            atomicLongFieldUpdater2 = newUpdater5;
        } catch (Throwable th) {
            bayj.a.logp(Level.SEVERE, "io.grpc.internal.CensusStatsModule$ClientTracer", "<clinit>", "Creating atomic field updaters failed", th);
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            newUpdater = atomicLongFieldUpdater;
            newUpdater2 = newUpdater;
            newUpdater3 = newUpdater2;
            newUpdater4 = newUpdater3;
        }
        g = atomicLongFieldUpdater2;
        h = newUpdater;
        i = newUpdater2;
        j = newUpdater3;
        k = newUpdater4;
        l = atomicLongFieldUpdater;
    }
}
