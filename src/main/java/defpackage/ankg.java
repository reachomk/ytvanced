package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ankg */
public final class ankg extends ankd implements anjz {
    private final ScheduledExecutorService a;

    public ankg(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.a = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
    }

    /* renamed from: a */
    public final anjx schedule(Callable callable, long j, TimeUnit timeUnit) {
        anku a = anku.a(callable);
        return new ankf(a, this.a.schedule(a, j, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        anki anki = new anki(runnable);
        return new ankf(anki, this.a.scheduleWithFixedDelay(anki, j, j2, timeUnit));
    }

    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        anki anki = new anki(runnable);
        return new ankf(anki, this.a.scheduleAtFixedRate(anki, j, j2, timeUnit));
    }
}
