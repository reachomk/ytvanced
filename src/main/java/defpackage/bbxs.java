package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bbxs */
final class bbxs extends bbmp {
    private final bbmz a;
    private final bbxp b;
    private final bbxr c;
    private final AtomicBoolean d = new AtomicBoolean();

    bbxs(bbxp bbxp) {
        bbxr bbxr;
        this.b = bbxp;
        this.a = new bbmz();
        if (bbxp.c.a) {
            bbxr = bbxq.b;
        } else {
            while (!bbxp.b.isEmpty()) {
                bbxr = (bbxr) bbxp.b.poll();
                if (bbxr != null) {
                    break;
                }
            }
            bbxr = new bbxr(bbxp.d);
            bbxp.c.a((bbnc) bbxr);
        }
        this.c = bbxr;
    }

    public final void bK_() {
        if (this.d.compareAndSet(false, true)) {
            this.a.bK_();
            bbxp bbxp = this.b;
            bbxr bbxr = this.c;
            bbxr.a = System.nanoTime() + bbxp.a;
            bbxp.b.offer(bbxr);
        }
    }

    public final boolean c() {
        return this.d.get();
    }

    public final bbnc a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.a.a) {
            return bboc.INSTANCE;
        }
        return this.c.a(runnable, j, timeUnit, this.a);
    }
}
