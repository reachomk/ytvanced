package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: wzp */
public final class wzp {
    private final xaa a;
    private final Executor b;
    private final amuw c;
    private final amuw d;

    public wzp(Executor executor) {
        this.a = null;
        this.b = executor;
        this.c = amwp.a;
        this.d = amwp.a;
    }

    public wzp(xaa xaa, Executor executor, List list, List list2) {
        this.a = xaa;
        this.b = executor;
        this.c = amuw.a((Collection) list);
        this.d = amuw.a((Collection) list2);
    }

    public final void a(aotr aotr, Runnable runnable) {
        a(aotr, runnable, true);
    }

    public final void a(aotr aotr, Runnable runnable, boolean z) {
        if (this.c.contains(aotr)) {
            xaa xaa = this.a;
            if (xaa != null) {
                xaa.a(runnable, true);
                return;
            }
        }
        if (this.d.contains(aotr)) {
            xaa xaa2 = this.a;
            if (xaa2 != null) {
                xaa2.a(runnable, false);
                return;
            }
        }
        if (z) {
            runnable.run();
        } else {
            this.b.execute(runnable);
        }
    }
}
