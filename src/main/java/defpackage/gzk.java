package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: gzk */
public final class gzk implements abfg {
    public final CopyOnWriteArraySet a;
    public final aant b;
    public final AtomicInteger c = new AtomicInteger(0);
    private final Executor d;

    public gzk(Executor executor, aant aant) {
        this.b = aant;
        this.d = executor;
        this.a = new CopyOnWriteArraySet();
    }

    public final void a(abfj abfj) {
        if (this.c.get() == 0) {
            this.d.execute(new gzn(this));
        }
        if (this.c.get() == 2) {
            abfj.M.addAll(this.a);
            return;
        }
        abfj.M.add(Integer.valueOf(0));
    }
}
