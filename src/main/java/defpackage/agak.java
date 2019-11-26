package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: agak */
public final class agak implements agbg, agvz, xcp {
    private static final long O = TimeUnit.DAYS.toMillis(1);
    public bcaa A;
    public bcaa B;
    public bcaa C;
    public bcaa D;
    public bcaa E;
    public bcaa F;
    public bcaa G;
    public bcaa H;
    public bcaa I;
    public bcaa J;
    public bcaa K;
    public final String L;
    public boolean M;
    public final amni N;
    private final agxk P = new agba(this);
    private final agbb Q;
    public Context a;
    public Handler b;
    public xsc c;
    public xci d;
    public SharedPreferences e;
    public zzl f;
    public zyw g;
    public agej h;
    public bcaa i;
    public bcaa j;
    public aguk k;
    public agxf l;
    public afym m;
    public agrq n;
    public ScheduledExecutorService o;
    public Executor p;
    public xah q;
    public bcaa r;
    public afzk s;
    public agdk t;
    public agfi u;
    public aghn v;
    public agif w;
    public agfd x;
    public bcaa y;
    public afzg z;

    public static String c(String str) {
        return TextUtils.join(".", new String[]{"offline", str, "db"});
    }

    public agak(Context context, String str) {
        Executor executor;
        this.L = xvd.a(str);
        this.Q = ((agbd) xse.a(context)).pu().a(str).a((agbg) this).a();
        this.Q.a(this);
        this.n.a(new agav(this));
        agfi agfi = this.u;
        Object agay = new agay(this);
        amqw.a(agay);
        agfi.a.add(agay);
        this.v.a(new agaz(this));
        this.w.h.add((agih) amqw.a(new agbc(this)));
        avnm a = ahda.a(this.g);
        if (a != null && a.h) {
            executor = this.o;
        } else {
            executor = aniv.a;
        }
        this.N = new amni(new agaj(this), executor);
    }

    public final synchronized void a() {
        this.M = true;
        xan.a(this.N.a(), aniv.a, agam.a);
    }

    public final synchronized void b() {
        this.e.edit().putString("current_offline_store_tag", this.L).apply();
        agvr agvr = this.z;
        agvr.a.a(agvr);
        this.w.f();
        this.u.a();
        this.k.b(this.L);
        this.l.a(this.L);
        this.m.b(this.L);
        ((agce) this.C.get()).a();
        n().e();
        avoa avoa = this.f.b().h;
        if (avoa == null) {
            avoa = avoa.w;
        }
        if (avoa.i) {
            String a = xuq.a("%s_offline_download_success", this.L);
            if (this.c.a() - this.e.getLong(a, 0) > O) {
                this.o.execute(new agaq(this, a));
            }
        }
        if (agxj.a(this.e, this.L)) {
            this.b.post(new agap(this));
        }
        a(new aglh());
        acxt acxt = ((agpq) this.K.get()).b;
        if (acxt != null) {
            acxt.a("st_i");
        }
    }

    public final synchronized void c() {
        this.M = false;
        agvr agvr = this.z;
        agvr.a.b(agvr);
        this.k.b();
        this.l.a();
        this.m.a();
        this.n.c();
        if (agxj.a(this.e, this.L)) {
            this.p.execute(new agas(this));
        }
        this.s.a();
        this.e.edit().remove("current_offline_store_tag").apply();
    }

    public final afzh d() {
        return (afzh) this.A.get();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized boolean e() {
        return this.M;
    }

    public final synchronized void a(Object obj) {
        if (this.M) {
            this.d.c(obj);
        }
    }

    public final String f() {
        return this.L;
    }

    public final agxk g() {
        return this.P;
    }

    public final agfi h() {
        if (v()) {
            return this.u;
        }
        return null;
    }

    public final agpi i() {
        return (agpi) this.y.get();
    }

    public final afzi j() {
        return this.z;
    }

    public final agwh k() {
        return (agwh) this.B.get();
    }

    public final agwi l() {
        return (agwi) this.C.get();
    }

    public final agvu m() {
        return (agvu) this.D.get();
    }

    public final agvx n() {
        return (agvx) this.E.get();
    }

    public final agwf o() {
        return (agwf) this.F.get();
    }

    public final aghl p() {
        return (aghl) this.G.get();
    }

    public final agvt q() {
        return (agvt) this.H.get();
    }

    public final agwb r() {
        return (agwb) this.I.get();
    }

    public final void a(String str, wxg wxg) {
        xvd.a(str);
        amqw.a((Object) wxg);
        this.p.execute(new agar(this, str, wxg));
    }

    public final void s() {
        a(new agau(this));
    }

    /* Access modifiers changed, original: final */
    public final agdo t() {
        return (agdo) this.J.get();
    }

    public final aesd a(String str) {
        if (!v()) {
            return null;
        }
        agpx y = this.u.y(str);
        if (y == null) {
            return null;
        }
        return new aesd(y.a, y.b, y.c, y.d, Uri.parse(y.e), y.f, y.g, y.h);
    }

    public final void b(String str) {
        if (v()) {
            this.u.z(str);
        }
    }

    public final void a(String str, String str2, byte[] bArr, byte[] bArr2, String str3, List list, String str4) {
        if (v()) {
            this.u.a(str, str2, bArr, bArr2, str3, this.c.a(), list, str4);
        }
    }

    public final void a(Runnable runnable) {
        this.p.execute(new agat(this, runnable));
    }

    public final void a(Runnable runnable, long j) {
        this.o.schedule(new agaw(this, runnable), j, TimeUnit.SECONDS);
    }

    public final anjv u() {
        if (this.M) {
            return anhk.a(this.N.a(), Throwable.class, agal.a, aniv.a);
        }
        return anjf.a(new agmd("Offline store is inactive."));
    }

    public final boolean v() {
        try {
            u().get();
            return true;
        } catch (IllegalStateException | InterruptedException | ExecutionException e) {
            xtl.a("Offline store initialization error", e);
            return false;
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{xlz.class};
        } else if (i == 0) {
            this.z.f();
            this.u.a();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
