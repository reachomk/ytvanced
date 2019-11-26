package defpackage;

import android.animation.Animator;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Property;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ahkw */
public class ahkw implements ahkx, ahln, ahlo, ajan, xcp {
    private static final ahlg g = new ahlg();
    private static final Property h = new ahle(Long.class, "countDownProgress");
    public final ahku a;
    public final ahll b = new ahll();
    public final xci c;
    public final Set d;
    public int e;
    public Animator f;
    private final ahlm i;
    private final ahlk j;
    private final aaas k;
    private final acvx l;
    private final aizy m;
    private final xpt n;
    private final xhv o;
    private final Handler p;
    private final Runnable q;
    private String r;
    private boolean s;
    private awfe t;
    private int u;
    private final ahlh v;
    private airc w;

    public ahkw(ahku ahku, ahlm ahlm, ahlk ahlk, aaas aaas, acvx acvx, aizy aizy, xpt xpt, xhv xhv, xci xci) {
        this.a = (ahku) amqw.a((Object) ahku);
        this.i = (ahlm) amqw.a((Object) ahlm);
        this.j = (ahlk) amqw.a((Object) ahlk);
        this.k = (aaas) amqw.a((Object) aaas);
        this.l = (acvx) amqw.a((Object) acvx);
        this.m = (aizy) amqw.a((Object) aizy);
        this.n = (xpt) amqw.a((Object) xpt);
        this.o = (xhv) amqw.a((Object) xhv);
        this.c = (xci) amqw.a((Object) xci);
        this.i.a(this);
        this.j.a(this);
        this.v = new ahlh(this);
        this.p = new Handler(Looper.getMainLooper());
        this.e = 0;
        this.u = 0;
        this.q = new ahkz(this);
        this.d = Collections.newSetFromMap(new WeakHashMap());
    }

    /* Access modifiers changed, original: protected */
    public boolean a() {
        return true;
    }

    public Class[] a(Class cls, Object obj, int i) {
        return ahlz.a(this, obj, i);
    }

    public final long e() {
        return 2;
    }

    public final void a(boolean z) {
        c();
    }

    public final void b() {
        c();
    }

    public final void a(ahli ahli) {
        this.b.a.add(ahli);
    }

    public final void as_() {
        aphg c = ahlr.c(this.t);
        if (c != null) {
            this.l.a(3, new acvs(c.r), null);
        }
        this.s = true;
        f();
        c();
    }

    public final void b(boolean z) {
        if (z) {
            this.m.b(aizl.d);
            return;
        }
        aphg b = ahlr.b(this.t);
        if (b != null) {
            this.l.a(3, new acvs(b.r), null);
            acvx acvx = this.l;
            apxu apxu = b.m;
            if (apxu == null) {
                apxu = apxu.d;
            }
            this.k.a(acvx.a(apxu), null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARNING: Missing block: B:29:0x0068, code skipped:
            if (r9.n.b() >= java.util.concurrent.TimeUnit.MINUTES.toMillis((long) r0)) goto L_0x0076;
     */
    public final void c() {
        /*
        r9 = this;
        r0 = r9.r;
        r0 = android.text.TextUtils.isEmpty(r0);
        r1 = 1;
        r2 = 2;
        r3 = 0;
        if (r0 != 0) goto L_0x0075;
    L_0x000b:
        r0 = r9.t;
        if (r0 == 0) goto L_0x0075;
    L_0x000f:
        r0 = r9.e;
        r4 = 3;
        if (r0 != r2) goto L_0x0015;
    L_0x0014:
        goto L_0x0018;
    L_0x0015:
        if (r0 == r4) goto L_0x0018;
    L_0x0017:
        goto L_0x0075;
    L_0x0018:
        r0 = r9.i;
        r0 = r0.a();
        if (r0 == 0) goto L_0x0075;
    L_0x0020:
        r0 = r9.m;
        r5 = defpackage.aizl.c;
        r0 = r0.a(r5);
        if (r0 != 0) goto L_0x0075;
    L_0x002a:
        r0 = r9.w;
        r5 = defpackage.airc.REMOTE;
        if (r0 == r5) goto L_0x0075;
    L_0x0030:
        r0 = r9.s;
        if (r0 != 0) goto L_0x0075;
    L_0x0034:
        r0 = r9.a();
        if (r0 == 0) goto L_0x0075;
    L_0x003a:
        r0 = r9.e;
        if (r0 != r4) goto L_0x003f;
    L_0x003e:
        goto L_0x0076;
    L_0x003f:
        r0 = r9.t;
        r0 = defpackage.ahlr.a(r0);
        if (r0 == 0) goto L_0x006b;
    L_0x0047:
        r4 = r9.o;
        r4 = r4.g();
        if (r4 != 0) goto L_0x0052;
    L_0x004f:
        r0 = r0.c;
        goto L_0x0054;
    L_0x0052:
        r0 = r0.d;
    L_0x0054:
        if (r0 == 0) goto L_0x006b;
    L_0x0056:
        r4 = -1;
        if (r0 == r4) goto L_0x006b;
    L_0x0059:
        r4 = r9.n;
        r4 = r4.b();
        r6 = java.util.concurrent.TimeUnit.MINUTES;
        r7 = (long) r0;
        r6 = r6.toMillis(r7);
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 < 0) goto L_0x006b;
    L_0x006a:
        goto L_0x0076;
    L_0x006b:
        r0 = r9.j;
        r0 = r0.a();
        if (r0 != 0) goto L_0x0076;
    L_0x0073:
        r2 = 1;
        goto L_0x0076;
    L_0x0075:
        r2 = 0;
    L_0x0076:
        r0 = r9.u;
        if (r0 == r2) goto L_0x00f0;
    L_0x007a:
        r0 = r9.f;
        if (r0 == 0) goto L_0x0089;
    L_0x007e:
        r9.d();
        r0 = r9.f;
        r0.cancel();
        r0 = 0;
        r9.f = r0;
    L_0x0089:
        r0 = r9.v;
        if (r0 == 0) goto L_0x009e;
    L_0x008d:
        r4 = 0;
        r6 = java.lang.Long.valueOf(r4);
        r0.b = r6;
        r6 = r0.c;
        r6 = r6.a;
        r7 = r0.a;
        r6.b(r4, r7);
    L_0x009e:
        r9.u = r2;
        if (r2 == 0) goto L_0x00e6;
    L_0x00a2:
        if (r2 == r1) goto L_0x00a8;
    L_0x00a4:
        r9.c(r1);
        return;
    L_0x00a8:
        r0 = java.util.concurrent.TimeUnit.SECONDS;
        r2 = r9.t;
        r2 = r2.n;
        r4 = (long) r2;
        r4 = r0.toMillis(r4);
        r0 = r9.v;
        r0.a = r4;
        r2 = h;
        r6 = g;
        r1 = new java.lang.Long[r1];
        r7 = java.lang.Long.valueOf(r4);
        r1[r3] = r7;
        r0 = android.animation.ObjectAnimator.ofObject(r0, r2, r6, r1);
        r9.f = r0;
        r0 = r9.f;
        r0.setDuration(r4);
        r0 = r9.f;
        r1 = new android.view.animation.LinearInterpolator;
        r1.<init>();
        r0.setInterpolator(r1);
        r9.d();
        r0 = r9.p;
        r1 = r9.q;
        r0.post(r1);
        r9.c(r3);
        return;
    L_0x00e6:
        r0 = r9.a;
        r0.ag_();
        r0 = r9.b;
        r0.a(r3);
    L_0x00f0:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahkw.c():void");
    }

    private final void d() {
        this.p.removeCallbacks(this.q);
    }

    public bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().a.a(ajcg.b(ajam.O(), 2)).a(ajcg.a(ajam.O(), 2, 1)).a(new ahky(this), ahlb.a), ajam.t().a(ajcg.b(ajam.O(), 2)).a(ajcg.a(ajam.O(), 2, 1)).a(new ahla(this), ahld.a), ajam.P().b.a(ajcg.b(ajam.O(), 2)).a(ajcg.a(ajam.O(), 2, 0)).a(new ahlc(this), ahlf.a)};
    }

    public final void a(ahkn ahkn) {
        aakj aakj = ahkn.b;
        CharSequence b = aakj != null ? aakj.b() : null;
        if (!TextUtils.equals(b, this.r)) {
            this.r = null;
            this.t = null;
            this.e = 0;
            c();
            this.r = b;
            this.s = false;
            f();
        }
        airi airi = ahkn.a;
        if (this.e == 0 || airi != airi.ENDED) {
            this.e = airi.a(airi.VIDEO_PLAYING, airi.PLAYBACK_INTERRUPTED, airi.INTERSTITIAL_PLAYING);
        } else if (this.e == 1) {
            this.e = 2;
        }
        c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0013  */
    public final void a(defpackage.ahkf r3) {
        /*
        r2 = this;
        r3 = r3.c;
        if (r3 == 0) goto L_0x0040;
    L_0x0004:
        r3 = r3.a;
        r0 = 0;
        if (r3 == 0) goto L_0x0010;
    L_0x0009:
        r3 = r3.e;
        if (r3 == 0) goto L_0x0010;
    L_0x000d:
        r3 = r3.b;
        goto L_0x0011;
    L_0x0010:
        r3 = r0;
    L_0x0011:
        if (r3 == 0) goto L_0x0040;
    L_0x0013:
        r3 = r3.c;
        if (r3 == 0) goto L_0x0023;
    L_0x0017:
        r1 = r3.a;
        r1 = r1 & 1;
        if (r1 == 0) goto L_0x0023;
    L_0x001d:
        r0 = r3.b;
        if (r0 != 0) goto L_0x0023;
    L_0x0021:
        r0 = defpackage.awfe.p;
    L_0x0023:
        r3 = r2.m;
        r1 = defpackage.aizl.d;
        r3 = r3.a(r1);
        if (r3 == 0) goto L_0x0040;
    L_0x002d:
        if (r0 == 0) goto L_0x0040;
    L_0x002f:
        r3 = defpackage.ahlr.b(r0);
        if (r3 == 0) goto L_0x0040;
    L_0x0035:
        r3 = defpackage.ahlr.c(r0);
        if (r3 == 0) goto L_0x0040;
    L_0x003b:
        r2.t = r0;
        r2.c();
    L_0x0040:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahkw.a(ahkf):void");
    }

    public final void a(ahjn ahjn) {
        this.w = ahjn.a;
    }

    private final void c(boolean z) {
        this.a.b(this.t, z);
        this.l.a(new acvs(this.t.o.d()), null);
        this.b.a(true);
    }

    private final void f() {
        for (ahlj b : this.d) {
            b.b(this.s);
        }
    }
}
