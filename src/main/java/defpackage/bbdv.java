package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: bbdv */
final class bbdv extends bavd {
    public final bbdr a;
    public final bava b;
    public final /* synthetic */ bbde c;

    bbdv(bbde bbde, bbdr bbdr, bava bava) {
        this.c = bbde;
        this.a = (bbdr) amqw.a((Object) bbdr, (Object) "helperImpl");
        this.b = (bava) amqw.a((Object) bava, (Object) "resolver");
    }

    public final void a(bavg bavg) {
        this.c.h.execute(new bbdx(this, bavg));
    }

    public final void a(bavx bavx) {
        amqw.a(bavx.a() ^ 1, (Object) "the error status must not be OK");
        this.c.h.execute(new bbdy(this, bavx));
    }

    public final void b(bavx bavx) {
        bbde.a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{this.c.d, bavx});
        Boolean bool = this.c.E;
        if (bool == null || bool.booleanValue()) {
            this.c.C.a(3, "Failed to resolve name: {0}", bavx);
            this.c.E = Boolean.valueOf(false);
        }
        bbdr bbdr = this.a;
        if (bbdr == this.c.p) {
            bbdr.a.a(bavx);
            bbde bbde = this.c;
            bawh bawh = bbde.O;
            if (bawh != null) {
                bawi bawi = bawh.a;
                if (!(bawi.b || bawi.a)) {
                    return;
                }
            }
            if (bbde.P == null) {
                bbde.P = bbde.n.a();
            }
            long a = this.c.P.a();
            this.c.C.a(1, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(a));
            bbde = this.c;
            bawg bawg = bbde.h;
            bbdo bbdo = new bbdo(bbde);
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            ScheduledExecutorService a2 = this.c.e.a();
            bawi bawi2 = new bawi(bbdo);
            bbde.O = new bawh(bawi2, a2.schedule(new bawf(bawg, bawi2, bbdo), a, timeUnit));
        }
    }
}
