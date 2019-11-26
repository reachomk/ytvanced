package defpackage;

import android.os.SystemClock;

/* renamed from: axg */
public final class axg extends axm {
    private final long a = 500;
    private long b;

    public final long a() {
        if (this.b == 0) {
            this.b = SystemClock.uptimeMillis();
            return 0;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.b;
        return uptimeMillis <= this.a ? Math.min(Math.max(uptimeMillis, 1000), this.a - uptimeMillis) : -1;
    }
}
