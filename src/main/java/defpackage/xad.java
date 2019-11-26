package defpackage;

import java.util.List;

/* renamed from: xad */
public final /* synthetic */ class xad implements Runnable {
    private final xaa a;

    public xad(xaa xaa) {
        this.a = xaa;
    }

    public final void run() {
        xaa xaa = this.a;
        synchronized (xaa.f) {
            List a;
            if (xaa.f.compareAndSet(true, false)) {
                a = amul.a(xaa.c);
                xaa.c.clear();
            } else {
                a = amul.g();
            }
        }
        for (xac xac : a) {
            if (xac.b) {
                xaa.a.post(xac.a);
            } else {
                xaa.b.execute(xac.a);
            }
        }
    }
}
