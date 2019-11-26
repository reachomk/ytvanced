package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: xko */
public final class xko implements xky {
    public volatile int a = 0;
    public xla b;
    private final ScheduledExecutorService d;
    private final long e;
    private final long f;
    private final Runnable g = new xkn(this);
    private ScheduledFuture h;

    xko(ScheduledExecutorService scheduledExecutorService, long j, long j2) {
        this.d = scheduledExecutorService;
        this.e = j;
        this.f = j2;
    }

    public final void a(xla xla) {
        amqw.a((Object) xla);
        amqw.b(this.a == 0, (Object) "Other request is already being monitored");
        this.b = xla;
        this.a = 1;
        this.h = this.d.schedule(this.g, this.e, TimeUnit.MILLISECONDS);
    }

    public final void a() {
        amqw.a(this.h, (Object) "Redirect received without starting request first");
        boolean z = true;
        if (this.a != 1) {
            z = false;
        }
        amqw.b(z, (Object) "Redirect can only be received in CONNECTING state");
        this.h.cancel(false);
        this.h = this.d.schedule(this.g, this.e, TimeUnit.MILLISECONDS);
    }

    public final void b() {
        amqw.a(this.h, (Object) "Response started without starting a request first");
        boolean z = true;
        if (this.a != 1) {
            z = false;
        }
        amqw.b(z, (Object) "Response started can only be received in CONNECTING state");
        this.a = 2;
        this.h.cancel(false);
        this.h = this.d.schedule(this.g, this.f, TimeUnit.MILLISECONDS);
    }

    public final void c() {
        amqw.a(this.h, (Object) "Read completed without being connected");
        amqw.b(this.a == 2, (Object) "Read completed in non READING_RESPONSE state");
        this.h.cancel(false);
        this.h = this.d.schedule(this.g, this.f, TimeUnit.MILLISECONDS);
    }

    public final void d() {
        amqw.a(this.h, (Object) "Request succeeded without starting");
        this.a = 3;
        this.h.cancel(false);
    }

    public final void e() {
        this.a = 3;
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void f() {
        this.a = 3;
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }
}
