package defpackage;

import android.os.SystemClock;

/* renamed from: ampj */
public final class ampj {
    public static final amrr a;

    static {
        amrr ampm;
        try {
            SystemClock.elapsedRealtimeNanos();
            ampm = new ampm();
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            ampm = new ampl();
        }
        a = ampm;
    }
}
