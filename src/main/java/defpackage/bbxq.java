package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbxq */
public final class bbxq extends bbmn {
    public static final bbxw a;
    public static final bbxr b;
    private static final bbxw c;
    private static final TimeUnit d = TimeUnit.SECONDS;
    private static final bbxp g;
    private final ThreadFactory e = c;
    private final AtomicReference f = new AtomicReference(g);

    public bbxq() {
        bbxp bbxp = new bbxp(60, d, this.e);
        if (!this.f.compareAndSet(g, bbxp)) {
            bbxp.a();
        }
    }

    public final bbmp a() {
        return new bbxs((bbxp) this.f.get());
    }

    static {
        bbxr bbxr = new bbxr(new bbxw("RxCachedThreadSchedulerShutdown"));
        b = bbxr;
        bbxr.bK_();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        c = new bbxw("RxCachedThreadScheduler", max);
        a = new bbxw("RxCachedWorkerPoolEvictor", max);
        bbxp bbxp = new bbxp(0, null, c);
        g = bbxp;
        bbxp.a();
    }
}
