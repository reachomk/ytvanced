package defpackage;

import android.os.SystemClock;

/* renamed from: sds */
public final class sds implements sdp {
    public final long a() {
        return System.currentTimeMillis();
    }

    static {
        try {
            SystemClock.elapsedRealtimeNanos();
        } catch (Throwable unused) {
        }
    }
}
