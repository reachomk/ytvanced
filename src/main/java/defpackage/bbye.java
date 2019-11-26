package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: bbye */
final class bbye extends bbmp {
    private final ScheduledExecutorService a;
    private final bbmz b = new bbmz();
    private volatile boolean c;

    bbye(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    public final bbnc a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.c) {
            return bboc.INSTANCE;
        }
        Future submit;
        bbnc bbxx = new bbxx(bbzf.a(runnable), this.b);
        this.b.a(bbxx);
        if (j <= 0) {
            try {
                submit = this.a.submit(bbxx);
            } catch (RejectedExecutionException e) {
                bK_();
                bbzf.a(e);
                return bboc.INSTANCE;
            }
        }
        submit = this.a.schedule(bbxx, j, timeUnit);
        bbxx.a(submit);
        return bbxx;
    }

    public final void bK_() {
        if (!this.c) {
            this.c = true;
            this.b.bK_();
        }
    }

    public final boolean c() {
        return this.c;
    }
}
