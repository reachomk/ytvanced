package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiManager;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: mox */
public final class mox implements mnd {
    private static final bcaa a = bapz.a(ampo.a);
    private final bcaa A;
    private final bcaa B;
    private final bcaa C;
    private final bcaa D;
    private final bcaa E;
    private final bcaa F;
    private final bcaa G;
    private final bcaa H;
    private final bcaa I;
    private final bcaa J;
    private final bcaa K;
    private final bcaa L;
    private final bcaa M;
    private final bcaa N;
    private final bcaa O;
    private final bcaa P;
    private final bcaa Q;
    private final bcaa R;
    private final bcaa S;
    private final Context b;
    private final String c;
    private final xdp d;
    private final bcaa e = baqh.a(xtc.a);
    private final bcaa f = a;
    private final bcaa g;
    private final bcaa h;
    private final bcaa i;
    private final bcaa j;
    private final bcaa k;
    private final bcaa l;
    private final bcaa m;
    private final bcaa n;
    private final bcaa o;
    private final bcaa p;
    private final bcaa q;
    private final bcaa r;
    private final bcaa s;
    private final bcaa t;
    private final bcaa u;
    private final bcaa v;
    private final bcaa w;
    private final bcaa x;
    private final bcaa y;
    private final bcaa z;

    public static mng d() {
        return new mpa();
    }

    public final WifiManager P() {
        throw null;
    }

    public final xwa Q() {
        throw null;
    }

    public final ScheduledExecutorService x() {
        throw null;
    }

    public final ContentResolver s() {
        return wwl.a(this.b);
    }

    public final xta t() {
        return (xta) this.e.get();
    }

    public final ScheduledExecutorService u() {
        return (ScheduledExecutorService) this.m.get();
    }

    public final ExecutorService v() {
        return (ExecutorService) this.m.get();
    }

    public final ScheduledExecutorService w() {
        return (ScheduledExecutorService) this.n.get();
    }

    public final Executor y() {
        return (Executor) this.o.get();
    }

    public final Executor z() {
        return (Executor) this.p.get();
    }

    public final xgv A() {
        return (xgv) this.u.get();
    }

    public final Executor B() {
        return (Executor) this.v.get();
    }

    public final xax C() {
        return (xax) this.s.get();
    }

    public final Context D() {
        return this.b;
    }

    public final SharedPreferences E() {
        return (SharedPreferences) this.x.get();
    }

    public final xsc F() {
        return (xsc) this.z.get();
    }

    public final File k() {
        return (File) this.C.get();
    }

    public final File G() {
        return wvk.a(this.b, this.c);
    }

    public final xti H() {
        return (xti) this.F.get();
    }

    public final xtb I() {
        return (xtb) this.L.get();
    }

    public final Executor J() {
        return (Executor) this.m.get();
    }

    public final Executor K() {
        return (Executor) this.n.get();
    }

    public final Executor L() {
        return (Executor) this.h.get();
    }

    public final xci M() {
        return (xci) this.M.get();
    }

    public final bciz N() {
        return (bciz) this.I.get();
    }

    public final xhu O() {
        return (xhu) this.Q.get();
    }

    public final tnl e() {
        return (tnl) baqd.a(this.d.e(), "Cannot return null from a non-@Nullable component method");
    }

    public final tar f() {
        return (tar) baqd.a(this.d.f(), "Cannot return null from a non-@Nullable component method");
    }

    public final tbg g() {
        return (tbg) baqd.a(this.d.g(), "Cannot return null from a non-@Nullable component method");
    }

    public final tem h() {
        return (tem) baqd.a(this.d.h(), "Cannot return null from a non-@Nullable component method");
    }

    public final Context i() {
        return (Context) baqd.a(this.d.i(), "Cannot return null from a non-@Nullable component method");
    }

    public final tax j() {
        return (tax) baqd.a(this.d.j(), "Cannot return null from a non-@Nullable component method");
    }

    public final tbk l() {
        return (tbk) baqd.a(this.d.l(), "Cannot return null from a non-@Nullable component method");
    }

    public final zwv a() {
        return (zwv) this.S.get();
    }

    public final zzf b() {
        return (zzf) baqd.a(((zwv) this.S.get()).d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final aaly c() {
        return (aaly) baqd.a(((zwv) this.S.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* synthetic */ mox(xdp xdp, Context context, String str, amro amro, Boolean bool, String str2, xax xax) {
        this.b = context;
        this.c = str2;
        this.d = xdp;
        this.g = bapz.a(context);
        this.h = bapx.a(wzx.a);
        this.i = bapx.a(wzq.a(this.h));
        this.j = bapx.a(wzv.a);
        this.k = wzm.a(this.g, this.i, this.j);
        baqi a = baqf.a(1, 0);
        a.a(this.k);
        this.l = a.a();
        this.m = bapx.a(wzj.a(this.f, this.l));
        this.n = bapx.a(wzl.a(this.l));
        this.o = bapx.a(wzi.a(this.l));
        this.p = bapx.a(wzn.a(this.l));
        this.q = a;
        bapx.a(wzk.a(this.q, baqf.a));
        this.r = bapz.b(xax);
        this.s = bapx.a(wwk.a(this.r));
        this.t = bapz.b(null);
        this.u = bapx.a(wwq.a(this.s, this.t));
        this.v = bapx.a(wwr.a(this.s, this.m));
        this.w = bapz.b(amro);
        this.x = bapx.a(wwo.a(this.g, this.w));
        this.y = bapz.b(null);
        this.z = bapx.a(wwp.a(xvi.a, this.y));
        this.A = bapz.b(str2);
        this.B = wvp.a(this.m);
        this.C = bapx.a(wvo.a(this.g, this.A, this.B));
        this.D = wwl.a(this.g);
        this.E = bapz.a(str);
        this.F = bapx.a(xtj.a(this.D, this.E));
        this.G = bapz.b(bool);
        this.H = wwj.a(this.G);
        this.I = bapx.a(xim.a(this.g, this.s, this.C, this.F));
        this.J = new mpc(xdp);
        this.K = new moz(xdp);
        this.L = bapx.a(xtf.a(this.H, this.I, this.g, this.m, this.J, this.K, this.s));
        this.M = bapx.a(xco.a(this.h, this.z));
        this.N = wwi.a(this.g);
        this.O = wwt.a(this.g);
        this.P = bapx.a(xrr.a(this.g));
        this.Q = bapx.a(xhw.a(this.N, this.O, this.P));
        this.R = new wxa(this.g);
        this.S = bapx.a(new mnf(this.x, this.z, this.R, this.M));
    }
}
