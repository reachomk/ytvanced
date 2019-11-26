package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bbgk */
final class bbgk implements Runnable {
    private final /* synthetic */ bbgh a;

    bbgk(bbgh bbgh) {
        this.a = bbgh;
    }

    public final void run() {
        Object obj;
        bbgi bbgi;
        bbfq bbfq = this.a.b;
        bbgp d = bbfq.d(bbfq.o.e);
        synchronized (this.a.b.j) {
            bbgh bbgh = this.a;
            obj = null;
            bbgi = null;
            if (bbgh.a.a) {
                obj = 1;
            } else {
                bbfq bbfq2 = bbgh.b;
                bbfq2.o = bbfq2.o.a(d);
                bbfq2 = this.a.b;
                if (bbfq2.a(bbfq2.o)) {
                    bbgs bbgs = this.a.b.n;
                    if (bbgs == null || bbgs.a()) {
                        bbfq2 = this.a.b;
                        bbgi = new bbgi(bbfq2.j);
                        bbfq2.t = bbgi;
                    }
                }
                bbfq2 = this.a.b;
                bbfq2.o = bbfq2.o.a();
                this.a.b.t = null;
            }
        }
        if (obj != null) {
            d.a.b(bavx.c.a("Unneeded hedging"));
            return;
        }
        if (bbgi != null) {
            bbfq bbfq3 = this.a.b;
            bbgi.a(bbfq3.e.schedule(new bbgh(bbfq3, bbgi), this.a.b.h.b, TimeUnit.NANOSECONDS));
        }
        this.a.b.c(d);
    }
}
