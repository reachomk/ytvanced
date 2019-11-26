package defpackage;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: anps */
final class anps {
    public final Intent a;
    private final PendingResult b;
    private boolean c = false;
    private final ScheduledFuture d;

    anps(Intent intent, PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.a = intent;
        this.b = pendingResult;
        this.d = scheduledExecutorService.schedule(new anpr(this, intent), 9500, TimeUnit.MILLISECONDS);
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a() {
        if (!this.c) {
            this.b.finish();
            this.d.cancel(false);
            this.c = true;
        }
    }
}
