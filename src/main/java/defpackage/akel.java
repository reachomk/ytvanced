package defpackage;

import android.os.SystemClock;

/* renamed from: akel */
final /* synthetic */ class akel implements szn {
    public static final szn a = new akel();

    private akel() {
    }

    public final long a() {
        xvf xvf = new xvf();
        return SystemClock.elapsedRealtimeNanos() / 1000;
    }
}
