package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: acda */
public final class acda implements acaj {
    public static final int[] c = new int[]{1152000, 512000, 0};
    public static final int[] d = new int[]{384000, 128000, 32000};
    public final achi a;
    public final Handler b = new Handler(Looper.getMainLooper());
    private final achr e;
    private final int f;
    private final int g;
    private final Handler h;
    private final acdf i;

    acda(int i, int i2, int i3, achi achi, achr achr, ScheduledExecutorService scheduledExecutorService, Handler handler, xsc xsc) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        this.f = i4;
        this.g = i6;
        this.a = (achi) amqw.a((Object) achi);
        this.h = (Handler) amqw.a((Object) handler);
        this.e = (achr) amqw.a((Object) achr);
        boolean z = true;
        boolean z2 = i4 <= i5 && i5 <= i6;
        amqw.a(z2);
        if (i5 <= 0) {
            z = false;
        }
        amqw.a(z);
        achi achi2 = achi;
        if (achi.h() != i5) {
            achi.a(i2);
        }
        this.i = new acdf(achr, achi, handler, scheduledExecutorService, xsc, i2, i, i3);
    }

    public final void a(int i) {
    }

    public final void a(acai acai) {
    }

    private final boolean b() {
        return this.i.e != null;
    }

    public final boolean a(boolean z) {
        acdf acdf;
        if (!z) {
            acdf = this.i;
            ScheduledFuture scheduledFuture = acdf.e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                acdf.e = null;
            }
        } else if (!b()) {
            acdf = this.i;
            acdf.g = acdf.a(acdf.f);
            acdf.c.post(new acde(acdf));
            if (acdf.e == null) {
                acdf.e = acdf.d.scheduleWithFixedDelay(acdf, 1, 1, TimeUnit.SECONDS);
            }
        }
        return true;
    }

    public final void a(int i, acal acal) {
        this.h.post(new acdd(this, i, acal));
    }

    public final long a() {
        return this.e.j();
    }
}
