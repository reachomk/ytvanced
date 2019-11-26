package defpackage;

import android.os.Process;
import android.os.SystemClock;

/* renamed from: bchq */
public final class bchq {
    public final String a;
    public final int b = Process.myTid();
    public final long c = SystemClock.elapsedRealtimeNanos();
    public final long d = SystemClock.currentThreadTimeMillis();
    public long e;
    public long f;

    public bchq(String str) {
        this.a = str;
    }
}
