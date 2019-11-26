package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: jgi */
public final class jgi extends akuz implements akui {
    private static final int q = 2;
    public final Context a;
    public final bcaa b;
    public final bcaa c;
    public final akxv d;
    public final akpk e;
    public boolean f;
    public apwm g;
    public hsq h;
    private final bcaa m;
    private final hsp n;
    private final jgk o = new jgk(this);
    private apwi p;

    public jgi(Context context, akvz akvz, bcaa bcaa, xci xci, xoi xoi, hsp hsp, bcaa bcaa2, bcaa bcaa3, aana aana, acvx acvx, akyd akyd, akxv akxv) {
        akyd akyd2 = akyd;
        akpk akpk = new akpk();
        akvz.get();
        super(aana, xci, xoi, acvx, akyd, akpk);
        this.a = context;
        this.m = bcaa;
        this.n = hsp;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = akxv;
        this.e = akpk;
        akvz akvz2 = akvz;
        akvz.a(apwm.class);
        if (akyd2 instanceof jgh) {
            jgh jgh = (jgh) akyd2;
            a(jgh.a, false);
            akpk.addAll(jgh.b);
            apwm apwm = jgh.a;
            if (apwm != null && (apwm.a & 16) != 0) {
                acvx.a(apwm.g.d());
            }
        }
    }

    public final void c() {
        ((hig) this.m.get()).b.remove(amqw.a(this.o));
        this.h = null;
        this.g = null;
        this.f = false;
    }

    public final void a(apwm apwm) {
        a(apwm, true);
    }

    public final void a(awzv awzv) {
        b();
        this.f = false;
        a(ajtj.a(awzv));
    }

    public final akyd E_() {
        Collection arrayList = new ArrayList(this.e.size());
        this.e.b(arrayList);
        return new jgh(super.E_(), this.g, arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a5  */
    private final void a(defpackage.apwm r5, boolean r6) {
        /*
        r4 = this;
        r0 = defpackage.amqw.a(r5);
        r0 = (defpackage.apwm) r0;
        r4.g = r0;
        r0 = r5.c;
        if (r0 != 0) goto L_0x000e;
    L_0x000c:
        r0 = defpackage.apwk.c;
    L_0x000e:
        r1 = r0.a;
        r2 = 140080728; // 0x8597658 float:6.5440175E-34 double:6.92090753E-316;
        if (r1 != r2) goto L_0x001a;
    L_0x0015:
        r0 = r0.b;
        r0 = (defpackage.apwi) r0;
        goto L_0x001c;
    L_0x001a:
        r0 = defpackage.apwi.f;
    L_0x001c:
        r0 = r0.c;
        r0 = r0.iterator();
    L_0x0022:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0049;
    L_0x0028:
        r1 = r0.next();
        r1 = (defpackage.apwe) r1;
        r3 = r1.c;
        if (r3 == 0) goto L_0x0022;
    L_0x0032:
        r0 = r1.d;
        if (r0 != 0) goto L_0x0038;
    L_0x0036:
        r0 = defpackage.apwo.c;
    L_0x0038:
        r0 = r0.b;
        r0 = defpackage.apwq.a(r0);
        if (r0 == 0) goto L_0x0041;
    L_0x0040:
        goto L_0x0042;
    L_0x0041:
        r0 = 1;
    L_0x0042:
        r1 = r1.e;
        r0 = defpackage.hsp.a(r0, r1);
        goto L_0x0050;
    L_0x0049:
        r0 = q;
        r1 = 0;
        r0 = defpackage.hsp.a(r0, r1);
    L_0x0050:
        r4.h = r0;
        if (r6 == 0) goto L_0x00a1;
    L_0x0054:
        r4.b();
        r6 = r5.c;
        if (r6 != 0) goto L_0x005d;
    L_0x005b:
        r6 = defpackage.apwk.c;
    L_0x005d:
        r6 = r6.a;
        if (r6 == r2) goto L_0x0062;
    L_0x0061:
        goto L_0x0075;
    L_0x0062:
        r6 = r5.c;
        if (r6 != 0) goto L_0x0068;
    L_0x0066:
        r6 = defpackage.apwk.c;
    L_0x0068:
        r0 = r6.a;
        if (r0 != r2) goto L_0x0071;
    L_0x006c:
        r6 = r6.b;
        r6 = (defpackage.apwi) r6;
        goto L_0x0073;
    L_0x0071:
        r6 = defpackage.apwi.f;
    L_0x0073:
        r4.p = r6;
    L_0x0075:
        r6 = r5.d;
        r6 = r6.size();
        if (r6 == 0) goto L_0x009e;
    L_0x007d:
        r6 = r5.d;
        r6 = r6.iterator();
    L_0x0083:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x009e;
    L_0x0089:
        r0 = r6.next();
        r0 = (defpackage.apws) r0;
        r1 = r0.a;
        r2 = 48602820; // 0x2e59ec4 float:3.3739653E-37 double:2.40129837E-316;
        if (r1 != r2) goto L_0x0083;
    L_0x0096:
        r0 = r0.b;
        r0 = (defpackage.aqey) r0;
        r4.b(r0);
        goto L_0x0083;
    L_0x009e:
        r4.az_();
    L_0x00a1:
        r5 = r5.b;
        if (r5 != 0) goto L_0x00a7;
    L_0x00a5:
        r5 = defpackage.apwa.c;
    L_0x00a7:
        r5 = r5.b;
        r5 = defpackage.apwc.a(r5);
        if (r5 == 0) goto L_0x00ca;
    L_0x00af:
        r6 = 2;
        if (r5 != r6) goto L_0x00ca;
    L_0x00b2:
        r5 = r4.m;
        r5 = r5.get();
        r5 = (defpackage.hig) r5;
        r6 = r4.o;
        r0 = r5.b;
        r6 = defpackage.amqw.a(r6);
        r6 = (defpackage.hii) r6;
        r0.add(r6);
        r5.a();
    L_0x00ca:
        r5 = r4.i;
        r6 = new akya;
        r6.<init>(r4);
        r5.a(r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jgi.a(apwm, boolean):void");
    }

    public final void az_() {
        if (this.f && this.e.size() == 1) {
            this.e.clear();
            this.f = false;
        } else if (this.p != null && !this.f && !this.e.isEmpty()) {
            b(this.p, 0);
            this.f = true;
        }
    }

    public static aqey a(aqey aqey, Map map) {
        awhh awhh;
        aqes aqes = aqey.k;
        if (aqes == null) {
            aqes = aqes.c;
        }
        if (aqes.a == 135739232) {
            awhh = (awhh) aqes.b;
        } else {
            awhh = awhh.c;
        }
        String str = awhh.b;
        return map.containsKey(str) ? (aqey) map.get(str) : aqey;
    }

    public static Object a(List list, int i) {
        return i < list.size() ? list.get(i) : null;
    }
}
