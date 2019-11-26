package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: gzr */
public final class gzr implements abkh {
    public final CopyOnWriteArraySet a;
    public final aant b;
    public final AtomicInteger c = new AtomicInteger(0);
    private final Executor d;

    public gzr(Executor executor, aant aant) {
        this.b = aant;
        this.d = executor;
        this.a = new CopyOnWriteArraySet();
    }

    public final void a(abkg abkg) {
        if (this.c.get() == 0) {
            this.d.execute(new gzq(this));
        }
        if (this.c.get() == 2) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                abkg.b(((Integer) it.next()).intValue());
            }
            return;
        }
        abkg.b(0);
    }
}
