package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* renamed from: bbde */
final class bbde extends bauk implements batq {
    private static final Pattern R = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
    private static final bavx S = bavx.j.a("Channel shutdownNow invoked");
    public static final Logger a = Logger.getLogger(bbde.class.getName());
    public static final bavx b = bavx.j.a("Channel shutdown invoked");
    public static final bavx c = bavx.j.a("Subchannel shutdown invoked");
    public final bayi A;
    public final bazc B;
    public final basa C;
    public final batm D;
    public Boolean E;
    public Map F;
    public final Map G;
    public final boolean H;
    public final bbgf I;
    public bbgs J;
    public final long K;
    public final long L;
    public final boolean M;
    public final bbcj N;
    public bawh O;
    public bayb P;
    public final bazj Q;
    private final String T;
    private final bave U;
    private final bauz V;
    private final baxw W;
    private final Executor X;
    private final bbew Y;
    private final bbdq Z;
    private final long aa;
    private final bbha ab;
    private final barx ac;
    private bava ad;
    private boolean ae;
    private final Set af = new HashSet(1, 0.75f);
    private final CountDownLatch ag;
    private final bbej ah;
    private final bbfl ai;
    public final batp d;
    public final bazp e;
    public final bbhs f;
    public final int g;
    public final bawg h = new bawg(new bbdd(this));
    public final boolean i;
    public final batc j;
    public final basq k;
    public final amro l;
    public final bazy m = new bazy();
    public final baye n;
    public final String o;
    public bbdr p;
    public volatile baud q;
    public boolean r;
    public final Set s = new HashSet(16, 0.75f);
    public final bbac t;
    public final bbed u = new bbed(this);
    public final AtomicBoolean v;
    public boolean w;
    public volatile boolean x;
    public volatile boolean y;
    public final bayk z;

    public final void e() {
        if (this.w) {
            for (bbcm b : this.s) {
                b.b(S);
            }
            for (bbev bbev : this.af) {
                bbev.a.b(S);
            }
        }
    }

    public final batp b() {
        return this.d;
    }

    public final void a(boolean z) {
        this.h.b();
        if (z) {
            amqw.b(this.ae, (Object) "nameResolver is not started");
            amqw.b(this.p != null, (Object) "lbHelper is null");
        }
        if (this.ad != null) {
            h();
            this.ad.b();
            this.ae = false;
            if (z) {
                this.ad = bbde.a(this.T, this.U, this.V);
            } else {
                this.ad = null;
            }
        }
        bbdr bbdr = this.p;
        if (bbdr != null) {
            bbdr.a.a();
            this.p = null;
        }
        this.q = null;
    }

    /* Access modifiers changed, original: final */
    public final void f() {
        this.h.b();
        if (!this.v.get() && !this.r) {
            if (this.N.a()) {
                b(false);
            } else {
                g();
            }
            if (this.p == null) {
                this.C.a(2, "Exiting idle mode");
                bbdr bbdr = new bbdr(this);
                bbdr.a = new baxv(this.W, bbdr);
                this.p = bbdr;
                this.ad.a(new bbdv(this, bbdr, this.ad));
                this.ae = true;
            }
        }
    }

    public final void b(boolean z) {
        bbfl bbfl = this.ai;
        bbfl.e = false;
        if (z) {
            ScheduledFuture scheduledFuture = bbfl.f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                bbfl.f = null;
            }
        }
    }

    public final void g() {
        long j = this.aa;
        if (j != -1) {
            bbfl bbfl = this.ai;
            j = TimeUnit.MILLISECONDS.toNanos(j);
            long a = bbfl.a() + j;
            bbfl.e = true;
            if (a - bbfl.d < 0 || bbfl.f == null) {
                ScheduledFuture scheduledFuture = bbfl.f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                bbfl.f = bbfl.a.schedule(new bbfn(bbfl), j, TimeUnit.NANOSECONDS);
            }
            bbfl.d = a;
        }
    }

    public final void h() {
        this.h.b();
        bawh bawh = this.O;
        if (bawh != null) {
            bawh.a.a = true;
            bawh.b.cancel(false);
            this.O = null;
            this.P = null;
        }
    }

    public final void i() {
        this.h.b();
        if (this.ae) {
            this.ad.c();
        }
    }

    bbde(baxe baxe, bazp bazp, baye baye, bbew bbew, amro amro, List list, bbhs bbhs) {
        Object obj;
        baxe baxe2 = baxe;
        Object obj2 = bbew;
        Object obj3 = bbhs;
        boolean z = false;
        this.v = new AtomicBoolean(false);
        this.ag = new CountDownLatch(1);
        this.I = new bbgf();
        this.ah = new bbdn(this);
        this.N = new bbdp(this);
        this.Q = new bbdj(this);
        this.T = (String) amqw.a(baxe2.f, (Object) "target");
        this.d = batp.a("Channel", this.T);
        String str = baxe2.h;
        this.U = baxe2.e;
        bavs bavs = baxe2.y;
        if (bbby.a) {
            obj = bbby.k;
        } else {
            obj = bbby.j;
        }
        boolean z2 = baxe2.r;
        this.M = false;
        this.W = new baxw(baxe2.i);
        bavk bavk = baxe2.d;
        bavc bavc = new bavc();
        bavc.a = Integer.valueOf(443);
        bavc.b = (bavs) amqw.a(obj);
        bavc.c = (bawg) amqw.a(this.h);
        int i = baxe2.n;
        i = baxe2.o;
        bavc.d = (bavi) amqw.a(new bbdz(this.W));
        this.V = new bauz(bavc.a, bavc.b, bavc.c, bavc.d);
        this.ad = bbde.a(this.T, this.U, this.V);
        this.f = (bbhs) amqw.a(obj3, (Object) "timeProvider");
        this.g = baxe2.t;
        batp batp = this.d;
        int i2 = baxe2.t;
        long a = bbhs.a();
        String str2 = this.T;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 14);
        stringBuilder.append("Channel for '");
        stringBuilder.append(str2);
        stringBuilder.append("'");
        this.B = new bazc(batp, 0, a, stringBuilder.toString());
        this.C = new bayz(this.B, obj3);
        this.Y = (bbew) amqw.a(baxe2.b, (Object) "executorPool");
        amqw.a(obj2, (Object) "balancerRpcExecutorPool");
        this.Z = new bbdq(obj2);
        this.X = (Executor) amqw.a((Executor) this.Y.a(), (Object) "executor");
        this.t = new bbac(this.X, this.h);
        bbac bbac = this.t;
        bbej bbej = this.ah;
        bbac.f = bbej;
        bbac.c = new bbab(bbej);
        bbac.d = new bbae(bbej);
        bbac.e = new bbad(bbej);
        this.n = baye;
        bazp bazp2 = bazp;
        this.e = new bayd(bazp, this.X);
        bbec bbec = new bbec(this.e.a());
        this.ab = new bbha(false, baxe2.n, baxe2.o);
        this.G = baxe2.u;
        this.F = this.G;
        this.H = baxe2.v;
        barx a2 = base.a(new bbea(this, this.ad.a()), this.ab);
        barr barr = baxe2.x;
        this.ac = base.a(a2, list);
        this.l = (amro) amqw.a((Object) amro, (Object) "stopwatchSupplier");
        long j = baxe2.m;
        if (j == -1) {
            this.aa = j;
        } else {
            if (j >= baxe.a) {
                z = true;
            }
            amqw.a(z, "invalid idleTimeoutMillis %s", baxe2.m);
            this.aa = baxe2.m;
        }
        this.ai = new bbfl(new bbds(this), this.h, this.e.a(), (amrj) amro.get());
        this.i = baxe2.j;
        this.j = (batc) amqw.a(baxe2.k, (Object) "decompressorRegistry");
        this.k = (basq) amqw.a(baxe2.l, (Object) "compressorRegistry");
        this.o = baxe2.g;
        this.L = baxe2.p;
        this.K = baxe2.q;
        this.z = new bbdf(obj3);
        this.A = this.z.a();
        this.D = (batm) amqw.a(baxe2.s);
        batm.a(this.D.b, this);
        if (!this.H) {
            if (this.G != null) {
                this.C.a(2, "Service config look-up disabled, using default service config");
            }
            j();
        }
    }

    public final void j() {
        Object bbei;
        bbha bbha = this.ab;
        Map map = this.F;
        if (map != null) {
            boolean z = bbha.b;
            int i = bbha.c;
            int i2 = bbha.d;
            if (z) {
                bbhd.a(map);
            }
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            List<Object> s = bbhd.s(map);
            if (s == null) {
                bbei = new bbei(hashMap, hashMap2);
            } else {
                for (Object obj : s) {
                    bbeh bbeh = new bbeh(obj, z, i, i2);
                    List<Map> n = bbhd.n(obj);
                    boolean z2 = false;
                    if (!(n == null || n.isEmpty())) {
                        z2 = true;
                    }
                    amqw.a(z2, "no names in method config %s", obj);
                    for (Map map2 : n) {
                        Object j = bbhd.j(map2);
                        amqw.a(amqu.a((String) j) ^ 1, (Object) "missing service name");
                        String k = bbhd.k(map2);
                        if (amqu.a(k)) {
                            amqw.a(hashMap2.containsKey(j) ^ 1, "Duplicate service %s", j);
                            hashMap2.put(j, bbeh);
                        } else {
                            Object a = bauw.a(j, k);
                            amqw.a(hashMap.containsKey(a) ^ 1, "Duplicate method name %s", a);
                            hashMap.put(a, bbeh);
                        }
                    }
                }
                bbei = new bbei(hashMap, hashMap2);
            }
        } else {
            bbei = new bbei(new HashMap(), new HashMap());
        }
        bbha.a.set(bbei);
        bbha.e = true;
    }

    private static bava a(String str, bave bave, bauz bauz) {
        URI uri;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            stringBuilder.append(e.getMessage());
            uri = null;
        }
        if (uri != null) {
            bava a = bave.a(uri, bauz);
            if (a != null) {
                return a;
            }
        }
        String str2 = "";
        if (!R.matcher(str).matches()) {
            try {
                String a2 = bave.a();
                String str3 = "/";
                String valueOf = String.valueOf(str);
                if (valueOf.length() == 0) {
                    valueOf = new String(str3);
                } else {
                    valueOf = str3.concat(valueOf);
                }
                bava a3 = bave.a(new URI(a2, str2, valueOf, null), bauz);
                if (a3 != null) {
                    return a3;
                }
            } catch (URISyntaxException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (stringBuilder.length() > 0) {
            str = String.valueOf(stringBuilder);
            StringBuilder stringBuilder2 = new StringBuilder(str.length() + 3);
            stringBuilder2.append(" (");
            stringBuilder2.append(str);
            stringBuilder2.append(")");
            str2 = stringBuilder2.toString();
        }
        objArr[1] = str2;
        throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", objArr));
    }

    public final void a(baud baud) {
        this.q = baud;
        this.t.a(baud);
    }

    public final boolean c() {
        return this.v.get();
    }

    public final barz a(bauw bauw, barv barv) {
        return this.ac.a(bauw, barv);
    }

    public final String a() {
        return this.ac.a();
    }

    public final Executor a(barv barv) {
        Executor executor = barv.c;
        return executor == null ? this.X : executor;
    }

    public final void k() {
        if (!this.y && this.v.get() && this.s.isEmpty() && this.af.isEmpty()) {
            this.C.a(2, "Terminated");
            batm.b(this.D.b, this);
            this.y = true;
            this.ag.countDown();
            this.Y.a(this.X);
            this.Z.a();
            this.e.close();
        }
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("logId", this.d.a);
        a.a("target", this.T);
        return a.toString();
    }

    public final void a(String str) {
        try {
            this.h.b();
        } catch (IllegalStateException e) {
            String str2 = "io.grpc.internal.ManagedChannelImpl";
            String str3 = "logWarningIfNotInSyncContext";
            a.logp(Level.WARNING, str2, str3, String.valueOf(str).concat(" should be called from SynchronizationContext. This warning will become an exception in a future release. See https://github.com/grpc/grpc-java/issues/5015 for more details"), e);
        }
    }

    public final /* synthetic */ bauk d() {
        this.C.a(1, "shutdownNow() called");
        this.C.a(1, "shutdown() called");
        if (this.v.compareAndSet(false, true)) {
            this.h.a(new bbdh(this));
            this.u.a(b);
            this.h.execute(new bbdg(this));
        }
        bbed bbed = this.u;
        bavx bavx = S;
        bbed.a(bavx);
        synchronized (bbed.a) {
            ArrayList<bazo> arrayList = new ArrayList(bbed.b);
        }
        for (bazo b : arrayList) {
            b.b(bavx);
        }
        bbed.d.t.b(bavx);
        this.h.execute(new bbdk(this));
        return this;
    }
}
