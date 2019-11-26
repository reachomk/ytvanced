package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: tyc */
final class tyc implements tzu {
    private final /* synthetic */ ScheduledExecutorService a = null;
    private final /* synthetic */ int b = 0;
    private final /* synthetic */ int c;

    tyc(ScheduledExecutorService scheduledExecutorService, int i, int i2) {
        this.c = i2;
    }

    public final /* synthetic */ Object a() {
        ScheduledExecutorService scheduledExecutorService = this.a;
        if (scheduledExecutorService == null) {
            int i = this.b;
            int i2 = this.c;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i2, new tyd(i), new tye());
            scheduledThreadPoolExecutor.setMaximumPoolSize(i2);
            scheduledExecutorService = scheduledThreadPoolExecutor;
        }
        return new tzd(scheduledExecutorService, new tyb());
    }
}
