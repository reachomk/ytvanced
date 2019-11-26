package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbxd */
public final class bbxd extends bbmn {
    public static final bbxi a;
    private static final bbxf b;
    private static final bbxw c = new bbxw("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
    private static final int d;
    private final ThreadFactory e = c;
    private final AtomicReference f = new AtomicReference(b);

    public bbxd() {
        bbxf bbxf = new bbxf(d, this.e);
        if (!this.f.compareAndSet(b, bbxf)) {
            bbxf.b();
        }
    }

    public final bbmp a() {
        return new bbxg(((bbxf) this.f.get()).a());
    }

    public final bbnc a(Runnable runnable, long j, TimeUnit timeUnit) {
        return ((bbxf) this.f.get()).a().b(runnable, j, timeUnit);
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        d = availableProcessors;
        bbxi bbxi = new bbxi(new bbxw("RxComputationShutdown"));
        a = bbxi;
        bbxi.bK_();
        bbxf bbxf = new bbxf(0, c);
        b = bbxf;
        bbxf.b();
    }
}
