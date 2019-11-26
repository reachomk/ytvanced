package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bdag */
public final class bdag extends bcuf implements bdbi {
    public static final bdam a;
    private static final long b = ((long) Integer.getInteger("rx.io-scheduler.keepalive", 60).intValue());
    private static final TimeUnit c = TimeUnit.SECONDS;
    private static final bdaj d;
    private final ThreadFactory e;
    private final AtomicReference f = new AtomicReference(d);

    public bdag(ThreadFactory threadFactory) {
        this.e = threadFactory;
        bdaj bdaj = new bdaj(this.e, b, c);
        if (!this.f.compareAndSet(d, bdaj)) {
            bdaj.a();
        }
    }

    public final void b() {
        bdaj bdaj;
        bdaj bdaj2;
        do {
            bdaj = (bdaj) this.f.get();
            bdaj2 = d;
            if (bdaj == bdaj2) {
                return;
            }
        } while (!this.f.compareAndSet(bdaj, bdaj2));
        bdaj.a();
    }

    public final bcue a() {
        return new bdak((bdaj) this.f.get());
    }

    static {
        bdam bdam = new bdam(bdcg.a);
        a = bdam;
        bdam.b();
        bdaj bdaj = new bdaj(null, 0, null);
        d = bdaj;
        bdaj.a();
    }
}
