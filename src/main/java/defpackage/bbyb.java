package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bbyb */
public final class bbyb extends bbmn {
    private static final bbxw b = new bbxw("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    private final AtomicReference a = new AtomicReference();

    public bbyb() {
        bbxw bbxw = b;
        this.a.lazySet(bbya.a(bbxw));
    }

    public final bbmp a() {
        return new bbye((ScheduledExecutorService) this.a.get());
    }

    public final bbnc a(Runnable runnable, long j, TimeUnit timeUnit) {
        Future submit;
        bbxy bbxy = new bbxy(bbzf.a(runnable));
        if (j <= 0) {
            try {
                submit = ((ScheduledExecutorService) this.a.get()).submit(bbxy);
            } catch (RejectedExecutionException e) {
                bbzf.a(e);
                return bboc.INSTANCE;
            }
        }
        submit = ((ScheduledExecutorService) this.a.get()).schedule(bbxy, j, timeUnit);
        bbxy.a(submit);
        return bbxy;
    }

    static {
        Executors.newScheduledThreadPool(0).shutdown();
    }
}
