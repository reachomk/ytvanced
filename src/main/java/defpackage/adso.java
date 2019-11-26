package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: adso */
public final class adso implements adtz {
    public static final String a = xtl.b("MDX.SessionRecoveryController");
    public final adtn b;
    public adto c;
    public volatile adqp d;
    public adty e;
    public adtl f;
    public volatile adtl g;
    public boolean h;
    private final xhu i;
    private final xsc j;
    private final adua k;
    private final Set l;
    private final Handler m;
    private final adub n;
    private final ajam o;
    private final bdfu p = new bdfu();
    private final adss q = new adss(this);
    private boolean r;
    private final Runnable s = new adsn(this);
    private final adtx t = new adsq(this);
    private final adug u = new adsp(this);

    public adso(adtn adtn, xhu xhu, xsc xsc, adua adua, adub adub, ajam ajam) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.b = adtn;
        this.i = xhu;
        this.j = xsc;
        this.k = adua;
        this.l = Collections.newSetFromMap(new ConcurrentHashMap());
        this.m = handler;
        this.n = adub;
        this.o = ajam;
        this.d = adqp.c().a();
    }

    public final void a() {
        xak.a();
        if (!this.r) {
            String string;
            this.r = true;
            adub adub = this.n;
            adug adug = this.u;
            xak.a();
            adub.d = adug;
            this.p.a(this.q.a(this.o));
            adtn adtn = this.b;
            int i = adtn.a.getInt("mdx.recovery.session_type", -1);
            adtl adtl = null;
            if (i != -1) {
                i = aurr.b(i);
                String str = "";
                String string2 = adtn.a.getString("mdx.recovery.route_id", str);
                if (!str.equals(string2)) {
                    long j = adtn.a.getLong("mdx.recovery.last_connected_time", -1);
                    if (j != -1) {
                        long j2 = adtn.a.getLong("mdx.recovery.expiration_time", -1);
                        if (j2 != -1) {
                            int i2 = adtn.a.getInt("mdx.recovery.disconnect_reason", -1);
                            if (i2 != -1) {
                                adto b = adtl.i().a(i).c(adtn.a.getString("mdx.recovery.screen_name", str)).b(string2).a(j).b(j2).a(adtn.a.getString("mdx.recovery.ssid", str)).b(aurp.a(i2));
                                if (i == 3) {
                                    string = adtn.a.getString("mdx.recovery.ssdp_id", str);
                                    if (!str.equals(string)) {
                                        b.a(adtd.b().a(new adjg(string)).a());
                                    }
                                }
                                adtl = b.a();
                            }
                        }
                    }
                }
            }
            if (adtl != null) {
                if (adtl.b() - this.j.a() <= 0) {
                    a(0);
                } else {
                    this.e = this.k.a(adtl.g());
                    adty adty = this.e;
                    if (adty == null) {
                        Object obj;
                        string = a;
                        i = adtl.g();
                        if (i == 0) {
                            obj = "null";
                        } else {
                            obj = aurr.c(i);
                        }
                        String valueOf = String.valueOf(obj);
                        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 52);
                        stringBuilder.append("No session recoverer for loaded SessionInfo of type ");
                        stringBuilder.append(valueOf);
                        xtl.b(string, stringBuilder.toString());
                        this.b.a();
                        return;
                    }
                    a(adty, adtl);
                }
            }
        }
    }

    public final void a(aduc aduc) {
        this.l.add(aduc);
    }

    public final void b() {
        xak.a();
        adtl adtl = this.f;
        if (this.e != null && adtl != null) {
            a(2);
        }
    }

    public final adqp c() {
        return this.d;
    }

    /* JADX WARNING: Missing block: B:7:0x0037, code skipped:
            if (((defpackage.adiq) r4).d().equals(((defpackage.adtd) defpackage.amqw.a(r0.d())).a()) != false) goto L_0x0049;
     */
    /* JADX WARNING: Missing block: B:11:0x0046, code skipped:
            if (r0.g() != 2) goto L_0x004b;
     */
    public final boolean a(defpackage.adis r4) {
        /*
        r3 = this;
        r0 = r3.g;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        goto L_0x004b;
    L_0x0005:
        r1 = r0.e();
        r2 = defpackage.adfv.a(r4);
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x004b;
    L_0x0013:
        r1 = r0.g();
        r2 = 3;
        if (r1 != r2) goto L_0x003a;
    L_0x001a:
        r1 = r4 instanceof defpackage.adiq;
        defpackage.amqw.b(r1);
        r4 = (defpackage.adiq) r4;
        r0 = r0.d();
        r0 = defpackage.amqw.a(r0);
        r0 = (defpackage.adtd) r0;
        r4 = r4.d();
        r0 = r0.a();
        r4 = r4.equals(r0);
        if (r4 == 0) goto L_0x004b;
    L_0x0039:
        goto L_0x0049;
    L_0x003a:
        r4 = r0.g();
        r1 = 4;
        if (r4 == r1) goto L_0x0049;
    L_0x0041:
        r4 = r0.g();
        r0 = 2;
        if (r4 == r0) goto L_0x0049;
    L_0x0048:
        goto L_0x004b;
    L_0x0049:
        r4 = 1;
        return r4;
    L_0x004b:
        r4 = 0;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adso.a(adis):boolean");
    }

    public final void a(adqe adqe) {
        xak.a();
        this.h = true;
        adty adty = this.e;
        if (!(adty == null || adty.a(adqe))) {
            a(0);
        }
        this.g = null;
    }

    public final void b(adqe adqe) {
        xak.a();
        a(null, 0);
        adtq adtq = (adtq) adqe;
        this.e = this.k.a(adtq.P());
        if (this.e == null) {
            a(0);
            return;
        }
        xhu xhu = this.i;
        int P = adtq.P();
        adto b = adtl.i().a(P).c(adqe.h().bv_()).a(xhu.a().getSSID()).b(adfv.a(adqe.h()));
        if (P == 3) {
            b.a(adtd.b().a(((adiq) adqe.h()).d()).a());
        }
        this.c = b;
        adub adub = this.n;
        xak.a();
        amqw.a(adub.d);
        adub.c = adqe;
        adub.c.a(adub.e);
        adub.a(adub.c);
        adub.a();
    }

    public final void c(adqe adqe) {
        xak.a();
        boolean z = false;
        this.h = false;
        adty adty = this.e;
        adto adto = this.c;
        if (!((adtq) adqe).K() || adty == null || adto == null) {
            a(0);
            return;
        }
        adub adub = this.n;
        xak.a();
        if (adub.c == adqe) {
            z = true;
        }
        amqw.a(z);
        amqw.a(adub.d);
        adub.a(adqe);
        adqe.b(adub.e);
        adub.a.removeCallbacks(adub.b);
        adub.c = null;
        adto.b(adqe.I());
        a(adty, adto.a());
        this.c = null;
    }

    private final void a(adty adty, adtl adtl) {
        xtl.c(a, "starting session recovery");
        this.j.a();
        this.f = adtl;
        a(this.f, 1);
        adty.a(adtl, this.t);
        long b = adtl.b();
        this.m.removeCallbacks(this.s);
        this.m.postDelayed(this.s, Math.max(0, b - this.j.a()));
    }

    private final void a(adtl adtl, int i) {
        adqs a = adqp.c().a(i);
        if (adtl != null) {
            a.a(adtl.f());
        }
        adqp a2 = a.a();
        if (!this.d.equals(a2)) {
            this.d = a2;
            for (aduc a3 : this.l) {
                a3.a(this.d);
            }
        }
    }

    public final void a(int i) {
        adty adty = this.e;
        if (adty != null) {
            adty.a();
            this.e = null;
        }
        this.c = null;
        adtl adtl = this.f;
        this.f = null;
        this.b.a();
        this.m.removeCallbacks(this.s);
        a(adtl, i);
    }

    public final void d() {
        amqw.a(this.f);
        a(3);
    }
}
