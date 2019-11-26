package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* renamed from: bayl */
final class bayl extends bash {
    public static final AtomicIntegerFieldUpdater a;
    private static final AtomicReferenceFieldUpdater g;
    public final bayj b;
    public final amrj c;
    public volatile bayo d;
    public volatile int e;
    public final bbju f;
    private final bbju h;

    bayl(bayj bayj, bbju bbju, String str) {
        this.b = (bayj) amqw.a((Object) bayj);
        this.h = (bbju) amqw.a((Object) bbju);
        this.f = bayj.c.a(bbju).a(bbbb.b, bbjy.a(str)).a();
        amrj amrj = (amrj) bayj.e.get();
        amrj.b();
        this.c = amrj;
        if (bayj.h) {
            bayj.d.a().a(1).a(this.f);
        }
    }

    public final basi a(baum baum) {
        bayo bayo = new bayo(this.b, this.f);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        Object obj = "Are you creating multiple streams per call? This class doesn't yet support this case";
        if (atomicReferenceFieldUpdater != null) {
            amqw.b(atomicReferenceFieldUpdater.compareAndSet(this, null, bayo), obj);
        } else {
            amqw.b(this.d == null, obj);
            this.d = bayo;
        }
        bayj bayj = this.b;
        if (bayj.g) {
            baum.b(bayj.f);
            if (!this.b.c.a().equals(this.h)) {
                baum.a(this.b.f, this.h);
            }
        }
        return bayo;
    }

    static {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        Class cls = bayl.class;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = null;
        try {
            AtomicReferenceFieldUpdater newUpdater = AtomicReferenceFieldUpdater.newUpdater(cls, bayo.class, "d");
            atomicReferenceFieldUpdater = AtomicIntegerFieldUpdater.newUpdater(cls, "e");
            atomicIntegerFieldUpdater = atomicReferenceFieldUpdater;
            atomicReferenceFieldUpdater = newUpdater;
        } catch (Throwable th) {
            bayj.a.logp(Level.SEVERE, "io.grpc.internal.CensusStatsModule$ClientCallTracer", "<clinit>", "Creating atomic field updaters failed", th);
            atomicIntegerFieldUpdater = atomicReferenceFieldUpdater;
        }
        g = atomicReferenceFieldUpdater;
        a = atomicIntegerFieldUpdater;
    }
}
