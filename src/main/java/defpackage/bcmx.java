package defpackage;

import android.net.TrafficStats;

/* renamed from: bcmx */
final class bcmx implements Runnable {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ bcmy b;

    bcmx(bcmy bcmy, Runnable runnable) {
        this.b = bcmy;
        this.a = runnable;
    }

    public final void run() {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        TrafficStats.setThreadStatsTag(this.b.a);
        bcmy bcmy = this.b;
        if (bcmy.b) {
            bckt.a(bcmy.c);
        }
        try {
            this.a.run();
            if (this.b.b) {
                bckt.a();
            }
            TrafficStats.setThreadStatsTag(threadStatsTag);
        } catch (Throwable th) {
            if (this.b.b) {
                bckt.a();
            }
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
    }
}
