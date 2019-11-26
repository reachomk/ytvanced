package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: adqm */
public final class adqm implements adqi {
    public final xpt a;
    private final ScheduledExecutorService b;
    private ScheduledFuture c;

    public adqm(xpt xpt, ScheduledExecutorService scheduledExecutorService) {
        this.a = (xpt) amqw.a((Object) xpt);
        this.b = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
    }

    public final void b(adqe adqe) {
    }

    public final void c(adqe adqe) {
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.c = null;
        }
    }

    public final void a(adqe adqe) {
        this.c = this.b.scheduleAtFixedRate(new adql(this, adqe), 300000, 300000, TimeUnit.MILLISECONDS);
    }
}
