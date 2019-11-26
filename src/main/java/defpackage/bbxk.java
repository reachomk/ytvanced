package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: bbxk */
public final class bbxk extends bbmn {
    public static final bbmn a = bbzi.a;
    private final Executor b;

    public bbxk(Executor executor) {
        this.b = executor;
    }

    public final bbmp a() {
        return new bbxl(this.b);
    }

    public final bbnc a(Runnable runnable) {
        runnable = bbzf.a(runnable);
        try {
            if (this.b instanceof ExecutorService) {
                bbxy bbxy = new bbxy(runnable);
                bbxy.a(((ExecutorService) this.b).submit(bbxy));
                return bbxy;
            }
            bbxo bbxo = new bbxo(runnable);
            this.b.execute(bbxo);
            return bbxo;
        } catch (RejectedExecutionException e) {
            bbzf.a(e);
            return bboc.INSTANCE;
        }
    }

    public final bbnc a(Runnable runnable, long j, TimeUnit timeUnit) {
        runnable = bbzf.a(runnable);
        if (this.b instanceof ScheduledExecutorService) {
            try {
                bbxy bbxy = new bbxy(runnable);
                bbxy.a(((ScheduledExecutorService) this.b).schedule(bbxy, j, timeUnit));
                return bbxy;
            } catch (RejectedExecutionException e) {
                bbzf.a(e);
                return bboc.INSTANCE;
            }
        }
        bbxm bbxm = new bbxm(runnable);
        bbnz.c(bbxm.a, a.a(new bbxj(this, bbxm), j, timeUnit));
        return bbxm;
    }
}
