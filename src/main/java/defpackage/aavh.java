package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: aavh */
public final class aavh implements aavm {
    private static final long a = TimeUnit.HOURS.toSeconds(20);
    private static final long b = TimeUnit.HOURS.toSeconds(4);
    private static final long c = TimeUnit.HOURS.toSeconds(24);
    private final bcaa d;
    private final wya e;
    private final zyw f;

    public aavh(bcaa bcaa, wya wya, zyw zyw) {
        this.d = bcaa;
        this.e = wya;
        this.f = zyw;
    }

    public final void a(zzf zzf) {
        try {
            a(zzf.h(), false);
            a(zzf.h(), false, b);
        } catch (UnsupportedOperationException unused) {
            a(zzf.h(), false, c);
        }
    }

    public final void a() {
        xak.b();
        aavj aavj = (aavj) this.d.get();
        aavk a = aavj.a();
        a.g();
        aavj.a(a);
        auya auya = this.f.a().i;
        if (auya == null) {
            auya = auya.J;
        }
        awzj awzj = auya.c;
        if (awzj == null) {
            awzj = awzj.c;
        }
        int a2 = zzf.a(awzj);
        try {
            a(a2, true);
            a(a2, true, b);
        } catch (UnsupportedOperationException unused) {
            a(a2, true, c);
        }
    }

    private final void a(int i, boolean z) {
        wya wya = this.e;
        long j = (long) i;
        long j2 = a;
        j += j2;
        long j3 = b;
        wya.a("innertube_config_fetch_charging", j + j3, j3 + j2, z, 1, true, null, null, true);
    }

    private final void a(int i, boolean z, long j) {
        this.e.a("innertube_config_fetch", b + (((long) i) + a), j, z, 1, false, null, null, true);
    }
}
