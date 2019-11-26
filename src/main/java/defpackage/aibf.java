package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: aibf */
public final class aibf {
    public final /* synthetic */ aibd a;
    private final Runnable b = new aibi(this);
    private ScheduledFuture c;

    public aibf(aibd aibd) {
        this.a = aibd;
    }

    public final void a() {
        b();
        this.c = this.a.f.scheduleAtFixedRate(this.b, 0, 1, TimeUnit.SECONDS);
    }

    public final synchronized void b() {
        ScheduledFuture scheduledFuture = this.c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.c = null;
        }
    }
}
