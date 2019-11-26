package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: aicw */
public final class aicw implements aict, ajan, t, wxg, xcp {
    public final aicu a;
    public final Resources b;
    public final yx c;
    public final aidk d;
    public xsc e;
    public aujh f;
    public boolean g;
    public boolean h;
    private final Executor i;
    private final akkq j;
    private final Runnable k;
    private final Runnable l;
    private zzl m;
    private final ScheduledExecutorService n;
    private final aaas o;
    private final ajoo p;
    private final bcvk q;
    private Future r;
    private bcuo s;
    private long t;
    private long u;
    private int v;

    @Deprecated
    public aicw(Context context, aicu aicu, ajoo ajoo, Executor executor, akkq akkq, ScheduledExecutorService scheduledExecutorService, xsc xsc, zzl zzl) {
        this(context, aicu, ajoo, executor, akkq, scheduledExecutorService, xsc, null, null, zzl);
    }

    public final void B_() {
    }

    public final void C_() {
    }

    public final void aw_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final long e() {
        return 16384;
    }

    public aicw(Context context, aicu aicu, ajoo ajoo, Executor executor, akkq akkq, ScheduledExecutorService scheduledExecutorService, xsc xsc, aaas aaas, aidk aidk, zzl zzl) {
        this.a = (aicu) amqw.a((Object) aicu);
        this.i = (Executor) amqw.a((Object) executor);
        this.j = (akkq) amqw.a((Object) akkq);
        this.n = (ScheduledExecutorService) amqw.a((Object) scheduledExecutorService);
        this.p = (ajoo) amqw.a((Object) ajoo);
        this.e = (xsc) amqw.a((Object) xsc);
        this.o = aaas;
        this.b = context.getResources();
        this.d = aidk;
        this.m = (zzl) amqw.a((Object) zzl);
        this.c = yx.a();
        this.q = new aicv(this);
        this.k = new aicy(this);
        this.l = new aidc(this);
        aicu.a((aict) this);
    }

    public final void a(af afVar) {
        j();
    }

    private final void j() {
        i();
        this.a.a(null);
        this.f = null;
        Future future = this.r;
        if (future != null) {
            future.cancel(true);
            this.r = null;
        }
        bcuo bcuo = this.s;
        if (!(bcuo == null || bcuo.c())) {
            this.s.b();
        }
        this.s = null;
        this.t = 0;
        this.u = 0;
        this.v = 0;
    }

    public final void a() {
        aphg b = aicw.b(this.f);
        if (this.o != null && b != null) {
            Map hashMap = new HashMap();
            hashMap.put("ALLOW_RELOAD", Boolean.valueOf(true));
            aaas aaas = this.o;
            apxu apxu = b.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, hashMap);
        }
    }

    public final void b() {
        aphy aphy = (aphy) ((anxo) aicw.a(this.f).toBuilder());
        if (this.o != null && aphy != null) {
            apxu e = (aphy.a() && aphy.d()) ? aphy.e() : null;
            if (!aphy.a() && aphy.b()) {
                e = aphy.c();
            }
            this.o.a(e, null);
            aphy.a(aphy.a() ^ 1);
            aujk aujk = (aujk) ((anxo) this.f.toBuilder());
            aphv aphv = (aphv) ((anxl) aphy.build());
            if (((aujh) aujk.instance).g.size() > 0 && (aujk.a().a & 2) != 0) {
                aphv aphv2 = aujk.a().c;
                if (aphv2 == null) {
                    aphv2 = aphv.s;
                }
                if (!aphv2.c) {
                    aphm aphm = (aphm) ((anxo) aujk.a().toBuilder());
                    aphm.a(aphv);
                    aphj aphj = (aphj) ((anxl) aphm.build());
                    aujk.copyOnWrite();
                    aujh aujh = (aujh) aujk.instance;
                    if (aphj != null) {
                        if (!aujh.g.a()) {
                            aujh.g = anxl.mutableCopy(aujh.g);
                        }
                        aujh.g.set(0, aphj);
                    } else {
                        throw new NullPointerException();
                    }
                }
            }
            this.f = (aujh) ((anxl) aujk.build());
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 16384)).a(ajcg.a(ajam.O(), 16384, 1)).a(new aidb(this), aide.a), ajam.Q().b.a(ajcg.b(ajam.O(), 16384)).a(ajcg.a(ajam.O(), 16384, 1)).a(new aidd(this), aidg.a), ajam.Q().d.a(ajcg.b(ajam.O(), 16384)).a(ajcg.a(ajam.O(), 16384, 1)).a(new aidf(this), aidi.a)};
    }

    public final void a(ahkm ahkm) {
        if (!this.h) {
            this.t = ahkm.a;
            this.u = ahkm.d;
            n();
        }
    }

    public final void a(ahkr ahkr) {
        if (!this.h) {
            int i = ahkr.a;
            this.v = i;
            if (i == 5 || i == 2) {
                n();
            }
        }
    }

    public final void a(ahkn ahkn) {
        int ordinal = ahkn.a.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            if (aipo.g(this.m)) {
                this.h = false;
            }
            j();
            return;
        }
        if (ordinal == 2) {
            if (aipo.g(this.m)) {
                this.h = false;
            }
            bcuo bcuo = this.s;
            if (bcuo == null || bcuo.c()) {
                this.s = this.p.c.c().a(bdfe.a(this.n)).a(this.q);
            }
            if (!(this.f == null || this.g || !aipo.g(this.m))) {
                f();
                g();
            }
        } else if (ordinal == 4 || ordinal == 5) {
            if (aipo.g(this.m)) {
                this.i.execute(new aidh(this));
                this.h = true;
            }
        } else if (aipo.g(this.m)) {
            this.h = false;
        }
    }

    public final void f() {
        aujh aujh = this.f;
        if ((aujh.a & 16) != 0) {
            aygk aygk = aujh.f;
            if (aygk == null) {
                aygk = aygk.f;
            }
            if (!m() || k()) {
                if (this.d != null) {
                    this.i.execute(new aicx(this, aygk));
                    return;
                }
                Uri c = aklb.c(aygk, this.a.getWidth(), this.a.getHeight());
                if (!(c == null || c.equals(null))) {
                    this.j.b(c, this);
                }
            }
        }
    }

    public static aujh a(atdv atdv) {
        if (atdv != null) {
            atdj atdj = atdv.m;
            if (atdj == null) {
                atdj = atdj.c;
            }
            aujn aujn = atdj.b;
            if (aujn == null) {
                aujn = aujn.f;
            }
            if ((aujn.a & 32) != 0) {
                atdj atdj2 = atdv.m;
                if (atdj2 == null) {
                    atdj2 = atdj.c;
                }
                aujn aujn2 = atdj2.b;
                if (aujn2 == null) {
                    aujn2 = aujn.f;
                }
                aujl aujl = aujn2.d;
                if (aujl == null) {
                    aujl = aujl.c;
                }
                aujh aujh = aujl.b;
                if (aujh == null) {
                    aujh = aujh.i;
                }
                return aujh;
            }
        }
        return null;
    }

    private final boolean k() {
        long j = this.u;
        if (j > 0 && j - this.t <= 1000) {
            int i = this.v;
            if (!(i == 2 || i == 3)) {
                return true;
            }
        }
        return false;
    }

    private final boolean l() {
        return this.v == 5;
    }

    private final boolean m() {
        return this.u > 0;
    }

    public static int a(arwf arwf) {
        arwh a = arwh.a(arwf.b);
        if (a == null) {
            a = arwh.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal != 221) {
            return ordinal != 222 ? 0 : R.drawable.quantum_ic_notifications_active_white_18;
        } else {
            return R.drawable.quantum_ic_notifications_none_white_18;
        }
    }

    public static aphv a(aujh aujh) {
        if (aujh.g.size() > 0 && (((aphj) aujh.g.get(0)).a & 2) != 0) {
            aphv aphv = ((aphj) aujh.g.get(0)).c;
            if (aphv == null) {
                aphv = aphv.s;
            }
            if (!aphv.c) {
                aphv aphv2 = ((aphj) aujh.g.get(0)).c;
                if (aphv2 == null) {
                    aphv2 = aphv.s;
                }
                return aphv2;
            }
        }
        return null;
    }

    public static aphg b(aujh aujh) {
        if (aujh.g.size() > 0 && (((aphj) aujh.g.get(0)).a & 1) != 0) {
            aphg aphg = ((aphj) aujh.g.get(0)).b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if (!aphg.f) {
                aphg aphg2 = ((aphj) aujh.g.get(0)).b;
                if (aphg2 == null) {
                    aphg2 = aphg.s;
                }
                return aphg2;
            }
        }
        return null;
    }

    public final void g() {
        aujh aujh = this.f;
        if (aujh != null) {
            if ((aujh.a & 2) == 0) {
                Future future = this.r;
                if (future != null) {
                    future.cancel(true);
                    this.r = null;
                }
                if (!m() || k()) {
                    h();
                }
            } else if (this.r == null) {
                this.r = this.n.scheduleAtFixedRate(this.l, 0, 1, TimeUnit.SECONDS);
            }
        }
    }

    public final void h() {
        this.i.execute(this.k);
    }

    private final void n() {
        if (!this.g && this.f != null && l()) {
            f();
            g();
        } else if (this.g && m() && !l()) {
            this.i.execute(new aicz(this));
        }
    }

    public final void i() {
        this.g = false;
        this.a.ag_();
        aidk aidk = this.d;
        if (aidk != null) {
            aidk.a(false);
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class, ahkm.class, ahkr.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else if (i == 1) {
            a((ahkm) obj);
            return null;
        } else if (i == 2) {
            a((ahkr) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
