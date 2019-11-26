package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahnq */
public final class ahnq implements ahnb, ahsp, ajan, xcp {
    private final baem A;
    private final ahxb B;
    private final Handler C;
    private ahos D;
    private volatile boolean E;
    private boolean F;
    private String G = "";
    private String H;
    private boolean I;
    private boolean J;
    private volatile int K;
    private volatile boolean L;
    private volatile boolean M;
    private volatile float N;
    private volatile float O;
    public final Context a;
    public final aiqf b;
    public final ajen c;
    public final ajex d;
    public final bcaa e;
    public final List f = new ArrayList();
    public final ahop g;
    public ahqh h;
    public ahni i;
    public ahmz j;
    public ahry k;
    public ahqp l;
    public ahrt m;
    public ahri n;
    public Runnable o;
    public afkm p;
    public Handler q;
    public ahsp r;
    public boolean s;
    public volatile boolean t;
    public volatile int u;
    public volatile int v;
    public aaju w = aaju.NOOP;
    public boolean x;
    public boolean y;
    private final xci z;

    public ahnq(Context context, xci xci, aiqf aiqf, ajen ajen, ajex ajex, bcaa bcaa, baem baem) {
        Object handler = new Handler(context.getMainLooper());
        this.a = (Context) amqw.a((Object) context);
        this.z = (xci) amqw.a((Object) xci);
        this.C = (Handler) amqw.a(handler);
        this.b = (aiqf) amqw.a((Object) aiqf);
        this.c = (ajen) amqw.a((Object) ajen);
        this.d = (ajex) amqw.a((Object) ajex);
        this.e = (bcaa) amqw.a((Object) bcaa);
        this.A = (baem) amqw.a((Object) baem);
        this.B = new ahxb(context);
        this.g = new ahop(context);
    }

    public final long e() {
        return 32;
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 32)).a(ajcg.a()).a(new ahnt(this), ahns.a), ajam.Q().b.a(ajcg.b(ajam.O(), 32)).a(ajcg.a()).a(new ahny(this), ahob.a), ajam.Q().d.a(ajcg.b(ajam.O(), 32)).a(ajcg.a()).a(new ahoa(this), ahod.a)};
    }

    public final void a(ahoj ahoj) {
        amqw.a((Object) ahoj);
        this.f.add(ahoj);
        a(new ahoc(this, ahoj));
    }

    public final void a() {
        amqw.a(this.j);
        try {
            this.k = new ahry(this.q, this.B, this.i, ((float) this.u) / ((float) this.v), this.A, i());
            this.l = this.k.b;
            this.l.a(this.g.b(), this.g.a(), this.g.a);
            if (this.t) {
                b();
            }
            this.j.a(this.t);
            ahmz ahmz = this.j;
            ahmz.g = this.D;
            ahmz.f = (ahor) amqw.a(this.k);
            a(this.w, this.F);
            if (this.s) {
                j();
            }
            this.k.c(this.x);
            ahry ahry = this.k;
            ahry.b.a(this.p);
        } catch (ahsj e) {
            b(e);
        }
    }

    public final void a(ahsj ahsj) {
        b(ahsj);
    }

    public final void b() {
        ahry ahry = this.k;
        if (ahry != null) {
            if (this.n == null) {
                try {
                    this.n = new ahri(this.a, ahry);
                    this.k.a(0, this.n);
                } catch (ahsj e) {
                    b(e);
                    return;
                }
            }
            if (this.m == null) {
                try {
                    this.m = new ahrt(this.a, this.i.e(), this.k);
                    this.m.a(this.I, this.J);
                    this.m.a(this.t);
                    this.k.a(this.m);
                    if (!(this.k == null || this.m == null)) {
                        for (ahoj a : this.f) {
                            a.a(this.k, this.m);
                        }
                    }
                    this.m.a(this.G, this.H);
                } catch (ahsj e2) {
                    b(e2);
                }
            }
        }
    }

    public final boolean c() {
        return (this.t || (this.w.a() ^ 1) == 0) ? false : true;
    }

    public final void d() {
        if (k()) {
            ahor ahor = this.j.f;
            if (ahor != null) {
                ahor.d = true;
            }
            this.z.d(new ahkp());
        }
    }

    public final void f() {
        if (k()) {
            this.i.c();
            this.j.a();
        }
        this.s = false;
    }

    public final void g() {
        h();
        this.s = true;
    }

    public final void h() {
        if (k()) {
            this.i.b();
            j();
        }
    }

    public final void a(ahos ahos, boolean z) {
        this.D = ahos;
        this.t = z;
        j();
        if (z && this.s) {
            this.z.d(new ahkp());
        }
    }

    private final void j() {
        if (k()) {
            this.j.a(this.t);
            this.j.g = this.D;
            this.b.b(this.t);
            boolean z = this.t;
            if (k()) {
                if (z) {
                    this.i.c(new ahnw(this));
                    this.i.e().setClickable(true);
                } else {
                    this.i.c(null);
                    this.i.e().setClickable(false);
                }
            }
            a(new ahnv(this));
            a(i());
            this.q.obtainMessage(2, this.t, 0).sendToTarget();
        }
    }

    /* Access modifiers changed, original: final */
    public final ahsq i() {
        ahst ahst = ahst.DISABLED;
        if (((this.L && !this.t) || (this.M && this.t)) && Math.min(this.u, this.v) <= this.K && this.N > 0.0f) {
            ahst = !this.E ? ahst.ENABLED : ahst.PAUSED;
        }
        return new ahsq(ahst, this.N, this.O);
    }

    public final void a(ahsq ahsq) {
        a(new ahnu(this, ahsq));
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0114  */
    /* JADX WARNING: Missing block: B:72:0x00f4, code skipped:
            if (r0 == 3) goto L_0x00e1;
     */
    public final void a(defpackage.ahkn r8) {
        /*
        r7 = this;
        r0 = r8.a;
        r1 = 2;
        r2 = 1;
        r3 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        goto L_0x002e;
    L_0x0008:
        r0 = r0.a();
        if (r0 == 0) goto L_0x002e;
    L_0x000e:
        r0 = r8.c;
        if (r0 == 0) goto L_0x0015;
    L_0x0012:
        r4 = r0.c;
        goto L_0x0016;
    L_0x0015:
        r4 = 0;
    L_0x0016:
        if (r4 != 0) goto L_0x0023;
    L_0x0018:
        r0 = "Could not retrieve VideoStreamingData for the Ad - unable to determine video type; falling back to 2D.";
        defpackage.xtl.c(r0);
        r0 = defpackage.aaju.RECTANGULAR_2D;
        r7.w = r0;
        goto L_0x012a;
    L_0x0023:
        r4 = r4.u();
        r7.w = r4;
        r7.a(r0);
        goto L_0x012a;
    L_0x002e:
        r0 = r8.b;
        if (r0 == 0) goto L_0x0126;
    L_0x0032:
        r4 = r0.n();
        r5 = r0.c;
        if (r5 == 0) goto L_0x003f;
    L_0x003a:
        r5 = r5.u();
        goto L_0x0041;
    L_0x003f:
        r5 = defpackage.aaju.NOOP;
    L_0x0041:
        r7.w = r5;
        r5 = r4.aD();
        r7.F = r5;
        r7.a(r0);
        r0 = r4.c;
        r5 = r0.b;
        r5 = r5 & 4;
        if (r5 == 0) goto L_0x0061;
    L_0x0054:
        r0 = r0.v;
        if (r0 != 0) goto L_0x005a;
    L_0x0058:
        r0 = defpackage.azfe.k;
    L_0x005a:
        r0 = r0.c;
        if (r0 != 0) goto L_0x005f;
    L_0x005e:
        goto L_0x0061;
    L_0x005f:
        r0 = 1;
        goto L_0x0062;
    L_0x0061:
        r0 = 0;
    L_0x0062:
        r7.I = r0;
        r0 = r4.aB();
        r7.J = r0;
        r0 = r4.c;
        r5 = r0.b;
        r5 = r5 & 4;
        if (r5 == 0) goto L_0x007f;
    L_0x0072:
        r0 = r0.v;
        if (r0 != 0) goto L_0x0078;
    L_0x0076:
        r0 = defpackage.azfe.k;
    L_0x0078:
        r0 = r0.e;
        if (r0 != 0) goto L_0x007d;
    L_0x007c:
        goto L_0x007f;
    L_0x007d:
        r0 = 1;
        goto L_0x0080;
    L_0x007f:
        r0 = 0;
    L_0x0080:
        r7.y = r0;
        r0 = r4.c;
        r5 = r0.b;
        r5 = r5 & 4;
        if (r5 == 0) goto L_0x0092;
    L_0x008a:
        r0 = r0.v;
        if (r0 != 0) goto L_0x0090;
    L_0x008e:
        r0 = defpackage.azfe.k;
    L_0x0090:
        r0 = r0.f;
    L_0x0092:
        r0 = r7.k();
        if (r0 == 0) goto L_0x00a3;
    L_0x0098:
        r0 = r7.m;
        if (r0 == 0) goto L_0x00a3;
    L_0x009c:
        r5 = r7.I;
        r6 = r7.J;
        r0.a(r5, r6);
    L_0x00a3:
        r0 = r7.j;
        if (r0 == 0) goto L_0x00ad;
    L_0x00a7:
        r5 = r4.aC();
        r0.j = r5;
    L_0x00ad:
        r0 = r4.c;
        r5 = r0.a;
        r5 = r5 & r1;
        if (r5 == 0) goto L_0x00bd;
    L_0x00b4:
        r0 = r0.d;
        if (r0 != 0) goto L_0x00ba;
    L_0x00b8:
        r0 = defpackage.arhh.bv;
    L_0x00ba:
        r0 = r0.aO;
        goto L_0x00be;
    L_0x00bd:
        r0 = 0;
    L_0x00be:
        r7.K = r0;
        r0 = r7.w;
        r0 = r4.a(r0);
        r7.L = r0;
        r0 = r4.c;
        r5 = r0.a;
        r5 = r5 & r1;
        if (r5 == 0) goto L_0x00f6;
    L_0x00cf:
        r0 = r0.d;
        if (r0 != 0) goto L_0x00d5;
    L_0x00d3:
        r0 = defpackage.arhh.bv;
    L_0x00d5:
        r0 = r0.aP;
        r0 = defpackage.axag.a(r0);
        if (r0 != 0) goto L_0x00de;
    L_0x00dd:
        goto L_0x00e3;
    L_0x00de:
        r5 = 6;
        if (r0 != r5) goto L_0x00e3;
    L_0x00e1:
        r0 = 1;
        goto L_0x00f7;
    L_0x00e3:
        r0 = r4.c;
        r0 = r0.d;
        if (r0 != 0) goto L_0x00eb;
    L_0x00e9:
        r0 = defpackage.arhh.bv;
    L_0x00eb:
        r0 = r0.aP;
        r0 = defpackage.axag.a(r0);
        if (r0 == 0) goto L_0x00f6;
    L_0x00f3:
        r5 = 3;
        if (r0 == r5) goto L_0x00e1;
    L_0x00f6:
        r0 = 0;
    L_0x00f7:
        r7.M = r0;
        r0 = r4.c;
        r5 = r0.a;
        r5 = r5 & r1;
        r6 = 0;
        if (r5 == 0) goto L_0x010a;
    L_0x0101:
        r0 = r0.d;
        if (r0 != 0) goto L_0x0107;
    L_0x0105:
        r0 = defpackage.arhh.bv;
    L_0x0107:
        r0 = r0.aQ;
        goto L_0x010b;
    L_0x010a:
        r0 = 0;
    L_0x010b:
        r7.N = r0;
        r0 = r4.c;
        r4 = r0.a;
        r4 = r4 & r1;
        if (r4 == 0) goto L_0x011c;
    L_0x0114:
        r0 = r0.d;
        if (r0 != 0) goto L_0x011a;
    L_0x0118:
        r0 = defpackage.arhh.bv;
    L_0x011a:
        r6 = r0.aR;
    L_0x011c:
        r7.O = r6;
        r0 = r7.i();
        r7.a(r0);
        goto L_0x012a;
    L_0x0126:
        r0 = defpackage.aaju.NOOP;
        r7.w = r0;
    L_0x012a:
        r0 = r7.w;
        r4 = r7.F;
        r7.a(r0, r4);
        r0 = r7.j;
        if (r0 != 0) goto L_0x0136;
    L_0x0135:
        goto L_0x015b;
    L_0x0136:
        r8 = r8.a;
        if (r8 == 0) goto L_0x015b;
    L_0x013a:
        r0 = new defpackage.airi[r1];
        r1 = defpackage.airi.INTERSTITIAL_PLAYING;
        r0[r3] = r1;
        r1 = defpackage.airi.VIDEO_PLAYING;
        r0[r2] = r1;
        r8 = r8.a(r0);
        if (r8 == 0) goto L_0x015b;
    L_0x014a:
        r8 = r7.j;
        r0 = r8.b;
        r1 = r0.a;
        r3 = r1.a();
        r0.e = r3;
        r0.a();
        r8.i = r2;
    L_0x015b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahnq.a(ahkn):void");
    }

    public final void a(ahkm ahkm) {
        ahqh ahqh = this.h;
        if (ahqh != null) {
            long j = ahkm.a;
            if (ahqh.c) {
                ahqj ahqj = ahqh.b;
                ahqj.j = j;
                ahqj.k = System.currentTimeMillis();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(ahkr ahkr) {
        ahqh ahqh = this.h;
        if (ahqh != null && ahqh.c) {
            ahqj ahqj = ahqh.b;
            int i = ahkr.a;
            if (i == 2) {
                if (ahqj.g) {
                    ahqj.g = false;
                    ahqj.a(30000);
                }
            } else if (!(i == 2 || ahqj.g)) {
                ahqj.g = true;
                Handler handler = ahqj.a;
                if (handler != null) {
                    handler.removeCallbacks(ahqj.h);
                }
                ahqj.a(0);
            }
        }
        this.E = ahkr.b();
        a(i());
    }

    private final void a(aakj aakj) {
        this.G = aakj.c();
        this.H = aakj.f();
        if (k()) {
            ahrt ahrt = this.m;
            if (ahrt != null) {
                ahrt.a(this.G, this.H);
            }
        }
    }

    private final void a(aaju aaju, boolean z) {
        if (k() && this.k != null) {
            String.valueOf(aaju).length();
            ahqn ahqn = !aaju.a() ? ahqn.RECTANGULAR : !z ? ahqn.FULL_SPHERICAL : ahqn.PARTIAL_SPHERICAL;
            a(new ahnx(this, aaju, ahqn));
        }
    }

    private final boolean k() {
        return (this.j == null || this.i == null) ? false : true;
    }

    public final void b(ahsj ahsj) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ahsj.getMessage());
        String str = "\n";
        stringBuilder.append(str);
        for (Object append : ahsj.getStackTrace()) {
            stringBuilder.append(append);
            stringBuilder.append(str);
        }
        xtl.c(stringBuilder.toString());
        this.C.post(new ahnz(this, ahsj));
    }

    public final void a(Runnable runnable) {
        ahmz ahmz = this.j;
        if (ahmz != null) {
            ahmz.a(runnable);
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
