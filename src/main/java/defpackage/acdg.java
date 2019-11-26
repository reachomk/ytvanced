package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: acdg */
public final class acdg implements acaj {
    private final ScheduledExecutorService A;
    private ScheduledFuture B;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final achi b;
    public final achr c;
    public final int d;
    public final int e;
    public final Handler f;
    public final acid g;
    public final xsc h;
    public final ArrayDeque i = new ArrayDeque();
    public int j;
    public int k = Integer.MAX_VALUE;
    public acai l;
    public int m;
    public int n;
    public int o;
    public int p = -1;
    public long q = -1;
    public long r = -1;
    public int s = -1;
    public int t = -1;
    public long u = -1;
    public long v = -1;
    public long w = -1;
    public long x = -1;
    public long y;
    private final acib z;

    acdg(int i, int i2, int i3, achi achi, achm achm, achr achr, ScheduledExecutorService scheduledExecutorService, Handler handler, xsc xsc) {
        this.d = i;
        this.m = i2;
        this.e = i3;
        this.b = (achi) amqw.a((Object) achi);
        amqw.a((Object) achm);
        this.c = (achr) amqw.a((Object) achr);
        this.f = (Handler) amqw.a((Object) handler);
        this.h = (xsc) amqw.a((Object) xsc);
        this.A = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
        boolean z = true;
        boolean z2 = i <= i2 && i2 <= i3;
        amqw.a(z2);
        if (i2 <= 0) {
            z = false;
        }
        amqw.a(z);
        this.j = i2;
        this.g = new acid((byte) 0);
        this.z = new acib(3);
        if (achi.h() != i2) {
            achi.a(i2);
        }
    }

    public final long a() {
        return 0;
    }

    public final boolean a(boolean z) {
        if (z) {
            if (this.B == null) {
                this.k = acdg.a(0, 0, this.j);
                this.f.post(new acdj(this));
                this.g.a();
                this.z.a();
                this.x = this.h.b();
                this.s = -1;
                this.p = -1;
                this.B = this.A.scheduleWithFixedDelay(new acdk(this), 200, 200, TimeUnit.MILLISECONDS);
                acef.a().a(auhl.class, acaj.class, new acdm(this));
            }
        } else if (this.B != null) {
            acef.a().a(auhl.class, acaj.class, null);
            this.B.cancel(true);
            this.B = null;
        }
        return true;
    }

    public final void a(int i, acal acal) {
        amqw.b(i > 0);
        this.f.post(new acdi(this, i, acal));
        this.m = i;
    }

    public final void a(acai acai) {
        this.l = acai;
    }

    public final void a(int i) {
        this.t = i;
    }

    static int a(int i, int i2, int i3) {
        double d;
        double d2;
        if (i < 4000) {
            d = (double) (4000 - i);
            Double.isNaN(d);
            d /= 1000.0d;
            d2 = (double) (i3 + 144000);
            Double.isNaN(d2);
            return i2 + ((int) ((d * d2) / 8.0d));
        }
        d2 = (double) i;
        Double.isNaN(d2);
        d = 4000.0d / d2;
        double d3 = (double) i2;
        Double.isNaN(d3);
        return (int) (d * d3);
    }
}
