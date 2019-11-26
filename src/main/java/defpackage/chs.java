package defpackage;

import android.os.SystemClock;

/* renamed from: chs */
public final class chs {
    private static final double a = (1.0d / Math.pow(10.0d, 6.0d));

    public static long a() {
        return SystemClock.elapsedRealtimeNanos();
    }

    public static double a(long j) {
        double elapsedRealtimeNanos = (double) (SystemClock.elapsedRealtimeNanos() - j);
        double d = a;
        Double.isNaN(elapsedRealtimeNanos);
        return elapsedRealtimeNanos * d;
    }
}
