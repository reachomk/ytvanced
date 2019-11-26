package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: bbxt */
public class bbxt extends bbmp implements bbnc {
    public final ScheduledExecutorService b;
    public volatile boolean c;

    public bbxt(ThreadFactory threadFactory) {
        this.b = bbya.a(threadFactory);
    }

    public final bbnc a(Runnable runnable) {
        return a(runnable, 0, null);
    }

    public final bbnc a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.c) {
            return bboc.INSTANCE;
        }
        return a(runnable, j, timeUnit, null);
    }

    public final bbnc b(Runnable runnable, long j, TimeUnit timeUnit) {
        Future submit;
        bbxy bbxy = new bbxy(bbzf.a(runnable));
        if (j <= 0) {
            try {
                submit = this.b.submit(bbxy);
            } catch (RejectedExecutionException e) {
                bbzf.a(e);
                return bboc.INSTANCE;
            }
        }
        submit = this.b.schedule(bbxy, j, timeUnit);
        bbxy.a(submit);
        return bbxy;
    }

    public final bbxx a(Runnable runnable, long j, TimeUnit timeUnit, bboa bboa) {
        bbxx bbxx = new bbxx(bbzf.a(runnable), bboa);
        if (bboa != null && !bboa.a(bbxx)) {
            return bbxx;
        }
        Future submit;
        if (j <= 0) {
            try {
                submit = this.b.submit(bbxx);
            } catch (RejectedExecutionException e) {
                if (bboa != null) {
                    bboa.b(bbxx);
                }
                bbzf.a(e);
            }
        } else {
            submit = this.b.schedule(bbxx, j, timeUnit);
        }
        bbxx.a(submit);
        return bbxx;
    }

    public final void bK_() {
        if (!this.c) {
            this.c = true;
            this.b.shutdownNow();
        }
    }

    public final boolean c() {
        return this.c;
    }
}
