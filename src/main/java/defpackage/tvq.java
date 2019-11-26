package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;

/* renamed from: tvq */
final class tvq implements Runnable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ tvn b;

    tvq(tvn tvn, Context context) {
        this.b = tvn;
        this.a = context;
    }

    public final void run() {
        if (this.b.a.j.compareAndSet(true, false)) {
            this.a.unregisterReceiver(this.b);
            this.b.a.i.set(SystemClock.elapsedRealtime());
            ucf ucf = this.b.a.e;
            Object a = tyu.a(this.a);
            uci uci = ucf.a;
            if (uci != null) {
                String str = "LeakWatcherThread";
                if (uci.e.c != null) {
                    uci.b = (File) uhy.a(a);
                    uci.interrupt();
                    tyv.b(str, "Schedule for heap dump", new Object[0]);
                    return;
                }
                tyv.b(str, "Skip heap dump. No leak suspects found.", new Object[0]);
            }
        }
    }
}
