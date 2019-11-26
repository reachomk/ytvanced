package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: bbyc */
final class bbyc implements Runnable {
    bbyc() {
    }

    public final void run() {
        ArrayList arrayList = new ArrayList(bbya.a.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) arrayList.get(i);
            if (scheduledThreadPoolExecutor.isShutdown()) {
                bbya.a.remove(scheduledThreadPoolExecutor);
            } else {
                scheduledThreadPoolExecutor.purge();
            }
        }
    }
}
