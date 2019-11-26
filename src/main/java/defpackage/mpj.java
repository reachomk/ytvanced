package defpackage;

import com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLoggerCoordinator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: mpj */
final class mpj implements mmo {
    private final ajam a;
    private final /* synthetic */ mpb b;

    public final void a(mmk mmk) {
        mmk.g = (aizy) this.b.m.get();
        mmk.h = (ajam) this.b.d.get();
        this.b.Q.get();
        mmk.i = (ajgv) this.b.aa.get();
        mmk.j = (ajjl) this.b.ah.get();
        mmk.k = (ahnq) this.b.ab.get();
        mpb mpb = this.b;
        mmk.l = new aicn(mpb.m, mpb.q, mpb.e);
        mmk.m = ajbc.a(this.a);
        mmk.n = (ajql) this.b.Y.get();
        mmk.o = (aiaw) this.b.ai.get();
        mmk.p = (vvh) this.b.aj.get();
        mmk.q = (waw) this.b.U.get();
        mmk.r = (akkq) this.b.af.get();
        String str = "Cannot return null from a non-@Nullable component method";
        mmk.s = (Executor) baqd.a(this.b.a.L(), str);
        mmk.t = (ajoo) this.b.ak.get();
        mmk.u = (xsc) baqd.a(this.b.a.F(), str);
        mmk.v = (ScheduledExecutorService) baqd.a(this.b.a.u(), str);
        mmk.w = ajbe.a(this.a);
        mmk.x = (EmbedInteractionLoggerCoordinator) this.b.ae.get();
        mmk.y = (msd) this.b.y.get();
        mmk.z = (xci) baqd.a(this.b.a.M(), str);
        mmk.A = ahmi.a(ahme.a(this.b.m));
        mmk.B = (aeeu) this.b.E.get();
        mmk.C = (mln) this.b.ag.get();
        mmk.D = (zyw) baqd.a(this.b.b.c(), str);
        mmk.E = (zzl) baqd.a(this.b.b.b(), str);
        mmk.F = (mry) this.b.P.get();
        mmk.G = (mrw) this.b.al.get();
        mmk.H = (xpt) this.b.x.get();
        mrs a = mrr.a();
        a.a = (acxs) this.b.am.get();
        mmk.I = a;
    }

    /* synthetic */ mpj(mpb mpb, ajam ajam) {
        this.b = mpb;
        this.a = ajam;
    }
}
