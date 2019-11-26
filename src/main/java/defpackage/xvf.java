package defpackage;

import android.os.SystemClock;

/* renamed from: xvf */
public final class xvf implements xsc {
    public final long a() {
        return System.currentTimeMillis();
    }

    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    public final long c() {
        return SystemClock.uptimeMillis();
    }

    public final void a(long j) {
        Thread.sleep(j);
    }

    public final long d() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
