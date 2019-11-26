package defpackage;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bbdl */
final class bbdl extends bbfq {
    private final /* synthetic */ bauw w;
    private final /* synthetic */ barv x;
    private final /* synthetic */ basr y;
    private final /* synthetic */ bbdj z;

    bbdl(bbdj bbdj, bauw bauw, baum baum, barv barv, basr basr) {
        bbdj bbdj2 = bbdj;
        barv barv2 = barv;
        this.z = bbdj2;
        this.w = bauw;
        this.x = barv2;
        this.y = basr;
        bbde bbde = bbdj2.a;
        bbgf bbgf = bbde.I;
        long j = bbde.K;
        long j2 = bbde.L;
        Executor a = bbde.a(barv2);
        ScheduledExecutorService a2 = bbdj2.a.e.a();
        bbgu bbgu = (bbgu) barv2.a(bbha.f);
        bbci bbci = (bbci) barv2.a(bbha.g);
        bbgs bbgs = bbdj2.a.J;
        super(bauw, baum, bbgf, j, j2, a, a2, bbgu, bbci, bbgs);
    }

    /* Access modifiers changed, original: final */
    public final bavx a() {
        bbed bbed = this.z.a.u;
        synchronized (bbed.a) {
            bavx bavx = bbed.c;
            if (bavx != null) {
                return bavx;
            }
            bbed.b.add(this);
            return null;
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        bavx bavx;
        bbed bbed = this.z.a.u;
        synchronized (bbed.a) {
            bbed.b.remove(this);
            if (bbed.b.isEmpty()) {
                bavx = bbed.c;
                bbed.b = new HashSet();
            } else {
                bavx = null;
            }
        }
        if (bavx != null) {
            bbed.d.t.a(bavx);
        }
    }

    /* Access modifiers changed, original: final */
    public final bazo a(bash bash, baum baum) {
        barv a = this.x.a(bash);
        bazq a2 = this.z.a(new bbfc(this.w, baum, a));
        basr c = this.y.c();
        try {
            bazo a3 = a2.a(this.w, baum, a);
            return a3;
        } finally {
            this.y.a(c);
        }
    }
}
