package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.concurrent.TimeUnit;

/* renamed from: juv */
public class juv implements ffx, fhq, xcp {
    private static final long e = TimeUnit.MINUTES.toMillis(30);
    private static final amqv f = jux.a;
    public final zyw a;
    public final fhk b;
    public final jtw c;
    public Integer d = null;
    private final juw g;
    private final jty h;
    private final xci i;
    private final fgc j;
    private final xpt k;
    private final fga l;
    private final RecyclerView m;
    private final akpd n;
    private final aknu o;
    private final fho p;

    juv(zyw zyw, fhk fhk, jtw jtw, fga fga, jty jty, xci xci, fgc fgc, xpt xpt, RecyclerView recyclerView, akpd akpd, aknh aknh, ent ent) {
        this.a = zyw;
        this.b = fhk;
        this.c = (jtw) amqw.a((Object) jtw);
        this.m = (RecyclerView) amqw.a((Object) recyclerView);
        this.n = (akpd) amqw.a((Object) akpd);
        this.o = new aknu(aknh, f);
        this.g = new juw(this, recyclerView, ent);
        this.l = fga;
        this.h = jty;
        this.i = xci;
        this.j = fgc;
        this.k = xpt;
        this.p = new juu(this);
    }

    public Class[] a(Class cls, Object obj, int i) {
        return jua.a(this, obj, i);
    }

    public final void e() {
    }

    public final boolean f() {
        return false;
    }

    public final boolean g() {
        return false;
    }

    public final boolean i() {
        return true;
    }

    public int j() {
        return 1;
    }

    public int k() {
        return 1;
    }

    public void a(boolean z) {
        this.l.a(z);
        if (z) {
            this.i.a((Object) this);
            if (foh.I(this.a)) {
                this.n.a(this.b);
            } else {
                this.n.a(this.c);
            }
            apz apz = this.g;
            apz.b.a((apv) apz);
            apz.c.a(apz);
            return;
        }
        this.i.b(this);
        jty jty = this.h;
        jty.f();
        jty.c = null;
        this.n.b(this.b);
        this.n.b(this.c);
        apv apv = this.g;
        apv.b.b(apv);
        apv.c.b(apv);
        apv.b.removeCallbacks(apv.a);
    }

    public final void a(gzx gzx) {
        if (fod.a(gzx.d)) {
            fgc fgc = this.j;
            fob b = fod.b(gzx.d);
            if (foh.H(fgc.b)) {
                bbnc bbnc = fgc.e;
                if (!(bbnc == null || bbnc.c())) {
                    fgc.e.bK_();
                }
                fgc.e = fgc.c.a(b).a(fgp.a, fgo.a);
                return;
            }
            xak.a();
            if (fgc.d == null) {
                return;
            }
            if (fgc.b(b) || fgc.c(b)) {
                fgc.a(null, 0);
            }
        }
    }

    public final void d() {
        this.m.c(o());
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f9  */
    public void c() {
        /*
        r9 = this;
        r0 = r9.k;
        r0 = r0.b();
        r2 = 0;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 <= 0) goto L_0x0014;
    L_0x000c:
        r2 = e;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 > 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0014;
    L_0x0013:
        return;
    L_0x0014:
        r0 = r9.o();
        r1 = -1;
        if (r0 == r1) goto L_0x0114;
    L_0x001b:
        r2 = r9.n;
        r2 = r2.a();
        r3 = 1;
        r0 = r0 + r3;
        r4 = 0;
        r5 = r4;
    L_0x0025:
        if (r0 >= r2) goto L_0x0038;
    L_0x0027:
        r5 = r9.n;
        r5 = r5.getItem(r0);
        r6 = f;
        r6 = r6.a(r5);
        if (r6 != 0) goto L_0x0038;
    L_0x0035:
        r0 = r0 + 1;
        goto L_0x0025;
    L_0x0038:
        if (r0 >= r2) goto L_0x0114;
    L_0x003a:
        r2 = r9.m;
        r2 = r2.n;
        r6 = r2 instanceof defpackage.ans;
        if (r6 == 0) goto L_0x005b;
    L_0x0042:
        r2 = (defpackage.ans) r2;
        r6 = r2.p();
        if (r6 == r1) goto L_0x005b;
    L_0x004a:
        if (r0 != r6) goto L_0x0052;
    L_0x004c:
        r1 = r2.q();
        if (r0 == r1) goto L_0x005b;
    L_0x0052:
        r1 = r9.g;
        r1.d = r3;
        r1 = r9.m;
        r1.e(r0);
    L_0x005b:
        r1 = r9.a;
        r1 = defpackage.foh.I(r1);
        if (r1 == 0) goto L_0x0096;
    L_0x0063:
        r1 = r9.b;
        r2 = r1.b;
        if (r2 == 0) goto L_0x0114;
    L_0x0069:
        r5 = new android.util.Pair;
        r6 = r2.a;
        r6 = r6.keySet();
        r6 = r6.iterator();
    L_0x0075:
        r7 = r6.hasNext();
        if (r7 == 0) goto L_0x008a;
    L_0x007b:
        r7 = r6.next();
        r7 = (android.view.View) r7;
        r8 = r2.b(r7);
        if (r8 < 0) goto L_0x0075;
    L_0x0087:
        if (r8 != r0) goto L_0x0075;
    L_0x0089:
        r4 = r7;
    L_0x008a:
        r0 = java.lang.Integer.valueOf(r0);
        r5.<init>(r4, r0);
        r1.a(r5, r3, r3);
        goto L_0x0114;
    L_0x0096:
        r0 = defpackage.fod.b(r5);
        if (r0 == 0) goto L_0x0114;
    L_0x009c:
        r1 = r9.c;
        r0 = r0.b();
        if (r5 == 0) goto L_0x0114;
    L_0x00a4:
        if (r0 != 0) goto L_0x00a7;
    L_0x00a6:
        goto L_0x00f5;
    L_0x00a7:
        r2 = r1.e;
        if (r2 == 0) goto L_0x00f5;
    L_0x00ab:
        r2 = r2.a();
        if (r2 == 0) goto L_0x00f2;
    L_0x00b1:
        r3 = r1.b;
        r3 = defpackage.xpr.a(r3, r2);
        if (r3 != 0) goto L_0x00ba;
    L_0x00b9:
        goto L_0x00f2;
    L_0x00ba:
        r3 = r1.c;
        r3 = r3.values();
        r3 = r3.iterator();
    L_0x00c4:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x00ef;
    L_0x00ca:
        r4 = r3.next();
        r4 = (defpackage.ffu) r4;
        r6 = r4.b();
        r6 = defpackage.xpr.a(r2, r6);
        if (r6 == 0) goto L_0x00c4;
    L_0x00da:
        r6 = r4.b;
        r6 = r6.b();
        r6 = android.text.TextUtils.equals(r6, r0);
        if (r6 == 0) goto L_0x00c4;
    L_0x00e6:
        r6 = defpackage.jtw.a(r4);
        r6 = r6.c;
        if (r6 != r5) goto L_0x00c4;
    L_0x00ee:
        goto L_0x00f7;
    L_0x00ef:
        r4 = defpackage.ffu.a;
        goto L_0x00f7;
    L_0x00f2:
        r4 = defpackage.ffu.a;
        goto L_0x00f7;
    L_0x00f5:
        r4 = defpackage.ffu.a;
    L_0x00f7:
        if (r4 == 0) goto L_0x0114;
    L_0x00f9:
        r0 = defpackage.jtw.a(r4);
        r0 = r0.b;
        r0 = defpackage.jtw.a(r0);
        r0 = java.lang.String.valueOf(r0);
        r0.length();
        r0 = r4.b;
        r0 = (defpackage.foq) r0;
        r1.f = r0;
        r0 = 3;
        r1.a(r4, r0);
    L_0x0114:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.juv.c():void");
    }

    public final View a() {
        return this.m;
    }

    public final boolean b() {
        return this.o.isEmpty() ^ 1;
    }

    public final RecyclerView l() {
        return this.m;
    }

    public final int m() {
        for (int i = 0; i < this.n.a(); i++) {
            if (f.a(this.n.getItem(i))) {
                return i;
            }
        }
        return -1;
    }

    public final fho n() {
        return this.p;
    }

    public final Object h() {
        for (int i = 0; i < this.n.a(); i++) {
            Object item = this.n.getItem(i);
            if (f.a(item)) {
                return item;
            }
        }
        return null;
    }

    private final int o() {
        int i = -1;
        if (foh.I(this.a)) {
            Integer num = this.d;
            if (num == null || num.intValue() < 0) {
                return -1;
            }
            return this.d.intValue();
        }
        ffu ffu;
        jtw jtw = this.c;
        ffu ffu2 = jtw.g;
        if (ffu2 == null || ffu2.b() == null) {
            ffu = ffu.a;
        } else {
            ffu = jtw.g;
        }
        foq foq = (foq) ffu.b;
        if (foq != null) {
            Object obj = foq.c;
            int a = this.n.a();
            if (a != 0 && obj != null) {
                for (int i2 = 0; i2 < a; i2++) {
                    if (this.n.getItem(i2) == obj) {
                        i = i2;
                        break;
                    }
                }
            }
        }
        return i;
    }
}
