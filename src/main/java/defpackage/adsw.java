package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: adsw */
public final class adsw extends adsu {
    public static final String e = xtl.b("MDX.Dial");
    private volatile Handler A;
    private volatile HandlerThread B;
    private volatile Handler C;
    private boolean D;
    private boolean E;
    private final adtm F;
    private final int G;
    public final SharedPreferences f;
    public final adea g;
    public final adcu h;
    public final adly i;
    public final admf j;
    public final addo k;
    public final adzb l;
    public final adby p;
    public final String q;
    public Uri r;
    public volatile adiq s;
    public volatile addv t;
    public final acxt u;
    public final AtomicBoolean v = new AtomicBoolean(false);
    public int w;
    public final int x = 5000;
    private final addx y;
    private volatile HandlerThread z;

    public adsw(adiq adiq, adtm adtm, Context context, adtw adtw, xoi xoi, SharedPreferences sharedPreferences, adea adea, adcu adcu, adly adly, admf admf, addo addo, String str, acxt acxt, addx addx, int i, adzb adzb, int i2, adby adby) {
        Context context2 = context;
        adtw adtw2 = adtw;
        xoi xoi2 = xoi;
        super(context, adtw, xoi, i2);
        this.s = adiq;
        this.F = adtm;
        this.f = sharedPreferences;
        this.g = adea;
        this.h = adcu;
        this.i = adly;
        this.j = admf;
        this.k = addo;
        this.q = str;
        this.u = acxt;
        this.y = addx;
        this.l = adzb;
        this.G = i;
        this.p = adby;
    }

    /* Access modifiers changed, original: final */
    public final boolean M() {
        return true;
    }

    public final int P() {
        return 3;
    }

    public final void L() {
        amqw.a(this.D ^ 1, (Object) "Cannot call launchApp() more than once.");
        this.D = true;
        V();
        if (this.G == 1) {
            U();
            if (this.C != null) {
                this.C.post(new adsz(this));
            }
        }
        if (!this.s.o()) {
            this.u.a("d_l");
            if (this.A != null) {
                this.A.post(new adsy(this));
            }
        } else if (e()) {
            b(7);
        } else {
            int i;
            this.u.a("d_lw");
            adiq adiq = this.s;
            if (adiq.i() > 0) {
                i = adiq.i();
                i += i;
            } else {
                i = 30;
            }
            this.w = i;
            addx addx = this.y;
            addv addv = new addv(addx.a, this.s.h());
            addv.a();
            this.t = addv;
            b(0);
        }
    }

    public final void a(boolean z, boolean z2) {
        W();
        if (this.z != null) {
            if (!z || !this.E) {
                T();
            } else if (this.A != null) {
                this.A.post(new adta(this));
            }
        }
        if (this.G == 1 && this.C != null) {
            this.C.post(new adtc(this));
        }
    }

    public final adis h() {
        return this.s;
    }

    public final void a(adio adio) {
        this.E = true;
        adjb br_ = adio.br_();
        adiq adiq = this.s;
        if (!adir.a(this.q)) {
            this.f.edit().putString(adiq.d().a, br_.a).apply();
        }
        this.u.a("d_las");
        a(this.F.a(adio, Q(), this, this.u, this.c));
    }

    public final void b(long j) {
        if (this.A != null) {
            this.A.postDelayed(new adsv(this), j);
        }
    }

    public final void N() {
        if (this.A != null) {
            this.A.post(new adsx(this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A:{SYNTHETIC, RETURN} */
    public final void O() {
        /*
        r5 = this;
        r0 = r5.r;
        r1 = 0;
        if (r0 != 0) goto L_0x002e;
    L_0x0005:
        r0 = r5.s;
        r0 = r0.a();
        if (r0 == 0) goto L_0x002f;
    L_0x000d:
        r2 = r5.h;
        r2 = r2.a(r0);
        if (r2 == 0) goto L_0x002f;
    L_0x0015:
        r3 = r2.b();
        r4 = 1;
        if (r3 != r4) goto L_0x002f;
    L_0x001c:
        r2 = r2.h();
        if (r2 == 0) goto L_0x002f;
    L_0x0022:
        r0 = r0.buildUpon();
        r0 = r0.appendPath(r2);
        r0 = r0.build();
    L_0x002e:
        r1 = r0;
    L_0x002f:
        if (r1 != 0) goto L_0x0032;
    L_0x0031:
        goto L_0x0057;
    L_0x0032:
        r0 = e;
        r2 = java.lang.String.valueOf(r1);
        r3 = r2.length();
        r4 = new java.lang.StringBuilder;
        r3 = r3 + 24;
        r4.<init>(r3);
        r3 = "Sending stop request to ";
        r4.append(r3);
        r4.append(r2);
        r2 = r4.toString();
        defpackage.xtl.c(r0, r2);
        r0 = r5.g;
        r0.a(r1);
    L_0x0057:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adsw.O():void");
    }

    public final boolean R() {
        return this.s.k.b() == 1;
    }

    private final synchronized void U() {
        if (this.B == null) {
            this.B = new HandlerThread(getClass().getName(), 10);
            this.B.start();
            this.C = new Handler(this.B.getLooper());
        }
    }

    public final synchronized void S() {
        if (this.B != null) {
            this.B.quit();
            this.B = null;
            this.C = null;
        }
    }

    private final synchronized void V() {
        if (this.z == null) {
            this.z = new HandlerThread(getClass().getName(), 10);
            this.z.start();
            this.A = new Handler(this.z.getLooper());
        }
    }

    public final synchronized void T() {
        if (this.z != null) {
            this.z.quit();
            this.z = null;
            this.A = null;
        }
    }

    private final void W() {
        addv addv = this.t;
        if (addv != null) {
            addv.b();
            this.t = null;
        }
        this.g.a();
        Handler handler = this.A;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(adpr adpr, int i) {
        W();
        this.u.a("d_laf");
        super.a(adpr, i);
    }
}
