package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: afyp */
public final class afyp implements aguk {
    private static final long c = TimeUnit.MINUTES.toSeconds(5);
    private static final long d = TimeUnit.MINUTES.toSeconds(5);
    private static final long e = TimeUnit.HOURS.toSeconds(4);
    private static final long f = TimeUnit.MINUTES.toSeconds(5);
    public final bcaa a;
    public final bcaa b;
    private final ScheduledExecutorService g;
    private final agvs h;
    private final wya i;
    private final xci j;

    public afyp(bcaa bcaa, ScheduledExecutorService scheduledExecutorService, bcaa bcaa2, wya wya, agvs agvs, xci xci) {
        this.a = bcaa;
        this.g = scheduledExecutorService;
        this.b = bcaa2;
        this.h = agvs;
        this.i = wya;
        this.j = xci;
    }

    public final void a(String str) {
        this.i.a("offline_r_charging");
        this.i.a("offline_r", c, d, true, 1, false, afyv.a(str), afyv.a, true, false);
        this.g.execute(new afys(this, str));
        this.j.d(new aglw());
    }

    public final void a(String str, long j) {
        if (j > 0) {
            a(str, j, true);
            this.h.a(str, j);
        }
    }

    public final void b(String str) {
        long a = this.h.a(str);
        if (a > 0) {
            a(str, a, false);
        }
    }

    public final void c(String str) {
        this.i.a("offline_r_inc", c, d, true, 1, false, afyv.a(str), afyv.a, true, false);
        this.g.execute(new afyr(this, str));
    }

    public final void b(String str, long j) {
        this.i.a("offline_r_inc", j, f, true, 1, false, afyv.a(str), afyv.a, true, false);
    }

    public final void a() {
        this.i.a("offline_r_inc");
    }

    public final void b() {
        this.i.a("offline_r");
        this.i.a("offline_r_charging");
        this.i.a("offline_r_inc");
    }

    public final void d(String str) {
        b();
        this.h.a(str, 0);
    }

    private final void a(String str, long j, boolean z) {
        long j2 = j + j;
        wya wya = this.i;
        long j3 = e;
        long j4 = j2 + j3;
        long j5 = j + j3;
        wya.a("offline_r_charging", j4, j5, z, 1, true, afyv.a(str), afyv.a, true);
        wya wya2 = this.i;
        long j6 = e;
        wya2.a("offline_r", j2 + j6, j6, z, 1, false, afyv.a(str), afyv.a, true);
    }
}
