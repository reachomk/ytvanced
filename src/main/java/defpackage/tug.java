package defpackage;

import java.util.List;
import java.util.concurrent.Future;

/* renamed from: tug */
final /* synthetic */ class tug implements Runnable {
    private final tuc a;
    private final List b;

    tug(tuc tuc, List list) {
        this.a = tuc;
        this.b = list;
    }

    public final void run() {
        Throwable e;
        tuc tuc = this.a;
        List<Future> list = this.b;
        uao g = tuc.g();
        for (Future future : list) {
            uao a;
            try {
                a = ((uac) future.get()).a();
                if (g != null) {
                    try {
                        tuc.a(g, a);
                    } catch (Exception e2) {
                        e = e2;
                    }
                }
            } catch (Exception e3) {
                Throwable th = e3;
                a = g;
                e = th;
                tyv.c("BatteryMetricService", "unpexpected failure", e, new Object[0]);
                g = a;
            }
            g = a;
        }
        tuc.a(g);
    }
}
