package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: alvr */
final class alvr implements alvs {
    public final xsc a;
    public long b;
    private final bcaa c;
    private final int d;
    private final long e;

    public final boolean a() {
        boolean z = false;
        if (!((alwe) this.c.get()).b()) {
            long j = this.e;
            if (j <= 0) {
                z = true;
            } else if (j + this.b <= this.a.b()) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    public final int b() {
        return this.d;
    }

    /* synthetic */ alvr(bcaa bcaa, aycy aycy, xsc xsc) {
        this.c = bcaa;
        this.d = aycy.c;
        this.e = TimeUnit.SECONDS.toMillis((long) aycy.d);
        this.a = xsc;
    }
}
