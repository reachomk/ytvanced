package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bdap */
public final class bdap extends bcuf implements bdbi {
    public static final bdas a;
    private static final int c;
    private static final bdat d = new bdat(null, 0);
    public final AtomicReference b = new AtomicReference(d);
    private final ThreadFactory e;

    public bdap(ThreadFactory threadFactory) {
        this.e = threadFactory;
        bdat bdat = new bdat(this.e, c);
        if (!this.b.compareAndSet(d, bdat)) {
            bdat.b();
        }
    }

    public final bcue a() {
        return new bdao(((bdat) this.b.get()).a());
    }

    public final void b() {
        bdat bdat;
        bdat bdat2;
        do {
            bdat = (bdat) this.b.get();
            bdat2 = d;
            if (bdat == bdat2) {
                return;
            }
        } while (!this.b.compareAndSet(bdat, bdat2));
        bdat.b();
    }

    static {
        int intValue = Integer.getInteger("rx.scheduler.max-computation-threads", 0).intValue();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (intValue <= 0 || intValue > availableProcessors) {
            intValue = availableProcessors;
        }
        c = intValue;
        bdas bdas = new bdas(bdcg.a);
        a = bdas;
        bdas.b();
    }
}
