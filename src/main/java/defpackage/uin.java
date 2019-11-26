package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: uin */
public final class uin implements ActivityLifecycleCallbacks, uik {
    private static final long a = TimeUnit.MINUTES.toMillis(1);
    private final ScheduledExecutorService b;
    private uil c;
    private final uim d;
    private long e;
    private long f;
    private boolean g;
    private final AtomicLong h = new AtomicLong(0);
    private ScheduledFuture i;
    private final Object j;

    public uin(uil uil, ScheduledExecutorService scheduledExecutorService, uim uim) {
        this.c = uil;
        this.b = scheduledExecutorService;
        this.d = uim;
        this.e = 100;
        this.f = a;
        this.g = true;
        this.j = new Object();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void a() {
        if (this.g) {
            if (this.e > 0 && this.h.incrementAndGet() >= this.e) {
                synchronized (this.j) {
                    if (this.h.get() < this.e) {
                    } else {
                        synchronized (this.j) {
                            ScheduledFuture scheduledFuture = this.i;
                            if (!(scheduledFuture == null || scheduledFuture.isDone())) {
                                if (!this.i.isCancelled()) {
                                    if (this.i.getDelay(TimeUnit.MILLISECONDS) > 100) {
                                        c();
                                        this.i = this.b.schedule(new uip(this), 1, TimeUnit.MILLISECONDS);
                                    }
                                }
                            }
                            this.i = this.b.schedule(new uiq(this), 1, TimeUnit.MILLISECONDS);
                        }
                        return;
                    }
                }
            }
            synchronized (this.j) {
                ScheduledFuture scheduledFuture2 = this.i;
                if (scheduledFuture2 == null || scheduledFuture2.isDone() || this.i.isCancelled()) {
                    this.i = this.b.schedule(new uis(this), this.f, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    private final void c() {
        synchronized (this.j) {
            ScheduledFuture scheduledFuture = this.i;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.i = null;
            }
        }
    }

    public final void b() {
        if (this.g) {
            this.h.set(0);
            this.c.a(this.d);
        }
    }

    public final void a(boolean z) {
        this.g = z;
        if (!z) {
            c();
        }
    }

    public final void a(uil uil) {
        this.c = uil;
    }

    public final void a(long j) {
        this.e = j;
    }

    public final void b(long j) {
        this.f = j;
    }

    public final void onActivityPaused(Activity activity) {
        synchronized (this.j) {
            b();
            c();
        }
    }
}
