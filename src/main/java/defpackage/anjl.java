package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: anjl */
public final class anjl {
    public boolean a = false;
    public boolean b = true;
    public final AtomicInteger c;
    public final anjv[] d;
    public volatile int e = 0;

    public final void a() {
        if (this.c.decrementAndGet() == 0 && this.a) {
            for (anjv anjv : this.d) {
                if (anjv != null) {
                    anjv.cancel(this.b);
                }
            }
        }
    }

    public /* synthetic */ anjl(anjv[] anjvArr) {
        this.d = anjvArr;
        this.c = new AtomicInteger(anjvArr.length);
    }
}
