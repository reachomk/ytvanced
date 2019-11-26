package defpackage;

import android.os.SystemClock;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: ajqo */
final class ajqo {
    public final azdi a;
    public long b;
    public final long c;
    public final long d;
    public final long e;
    public long f = 0;
    public long g = 0;
    public long h = 0;
    public final /* synthetic */ ajql i;
    public int j = 8;
    private final Runnable k = new ajqn(this);

    public final void a() {
        b();
        a(8);
    }

    public final void b() {
        ScheduledFuture scheduledFuture = this.i.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void a(long j) {
        ScheduledFuture scheduledFuture = this.i.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ajql ajql = this.i;
        ajql.b = ajql.a.schedule(this.k, j, TimeUnit.MILLISECONDS);
    }

    /* synthetic */ ajqo(ajql ajql, azdm azdm, azdi azdi) {
        this.i = ajql;
        this.a = azdi;
        this.c = TimeUnit.SECONDS.toMillis((long) azdm.d);
        this.d = TimeUnit.SECONDS.toMillis((long) azdm.e);
        this.e = TimeUnit.SECONDS.toMillis((long) azdm.f);
    }

    public final void a(int i) {
        int i2 = this.j;
        int i3 = i2 - 1;
        if (i2 != 0) {
            switch (i3) {
                case 0:
                case 1:
                    this.f += b(i);
                    break;
                case 2:
                    this.g += b(i);
                    return;
                case 3:
                    this.h += b(i);
                    return;
                case 4:
                case 5:
                case 6:
                    b(i);
                    return;
            }
            return;
        }
        throw null;
    }

    private final long b(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.b;
        this.j = i;
        this.b = elapsedRealtime;
        return elapsedRealtime - j;
    }
}
