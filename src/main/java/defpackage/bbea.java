package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bbea */
final class bbea extends barx {
    private final String a;
    private final /* synthetic */ bbde b;

    public final barz a(bauw bauw, barv barv) {
        Executor a = this.b.a(barv);
        bbde bbde = this.b;
        bazj bazj = bbde.Q;
        ScheduledExecutorService a2 = !bbde.y ? this.b.e.a() : null;
        bbde = this.b;
        baze baze = new baze(bauw, a, barv, bazj, a2, bbde.A, bbde.M);
        bbde bbde2 = this.b;
        baze.h = bbde2.i;
        baze.i = bbde2.j;
        baze.j = bbde2.k;
        return baze;
    }

    public final String a() {
        return this.a;
    }

    /* synthetic */ bbea(bbde bbde, String str) {
        this.b = bbde;
        this.a = (String) amqw.a((Object) str, (Object) "authority");
    }
}
