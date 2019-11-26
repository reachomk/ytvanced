package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bdak */
final class bdak extends bcue implements bcvl {
    private final bdfu a = new bdfu();
    private final bdaj b;
    private final bdam c;
    private final AtomicBoolean d;

    bdak(bdaj bdaj) {
        bdam bdam;
        this.b = bdaj;
        this.d = new AtomicBoolean();
        if (bdaj.d.b) {
            bdam = bdag.a;
        } else {
            while (!bdaj.c.isEmpty()) {
                bdam = (bdam) bdaj.c.poll();
                if (bdam != null) {
                    break;
                }
            }
            bdam = new bdam(bdaj.a);
            bdaj.d.a((bcuo) bdam);
        }
        this.c = bdam;
    }

    public final void b() {
        if (this.d.compareAndSet(false, true)) {
            this.c.a(this);
        }
        this.a.b();
    }

    public final void a() {
        bdaj bdaj = this.b;
        bdam bdam = this.c;
        bdam.a = System.nanoTime() + bdaj.b;
        bdaj.c.offer(bdam);
    }

    public final boolean c() {
        return this.a.b;
    }

    public final bcuo a(bcvl bcvl) {
        return a(bcvl, 0, null);
    }

    public final bcuo a(bcvl bcvl, long j, TimeUnit timeUnit) {
        if (this.a.b) {
            return bdfz.a;
        }
        bcuo b = this.c.b(new bdan(this, bcvl), j, timeUnit);
        this.a.a(b);
        b.a.a(new bdbg(b, this.a));
        return b;
    }
}
