package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: wbt */
public final class wbt extends was implements vcq {
    public final vso b;
    public final vqp c;
    public final vcp d;
    public ahjn e = null;
    public boolean f;
    private final vuh g;
    private final aaas h;
    private final Set i;
    private final SparseArray j;
    private bcuo k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;

    public wbt(vuh vuh, vqy vqy, vso vso, String str, ahjn ahjn, aiqh aiqh, vcp vcp, vqp vqp, aaas aaas) {
        this.g = (vuh) amqw.a((Object) vuh);
        this.b = (vso) amqw.a((Object) vso);
        this.c = vqp;
        this.h = aaas;
        SparseArray sparseArray = new SparseArray();
        if (!(vso.u() == null || vso.u().isEmpty())) {
            for (aojo aojo : vso.u()) {
                List list = (List) sparseArray.get(aojo.c);
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(aojo);
                sparseArray.put(aojo.c, list);
            }
        }
        this.j = sparseArray;
        this.i = new HashSet();
        for (int i = 1; i < 4; i++) {
            this.i.add(Integer.valueOf(i));
        }
        this.e = ahjn;
        this.d = vcp;
        if (vcp != null) {
            vcp.b = this;
        }
        vqp.a(vqy.d(), str);
        vqp.a(vqy);
        vqp.a = new vse(vso);
        vqp.c = this.e;
        this.k = aiqh.b.a(new wbw(this));
    }

    public final void a(int i, int i2) {
    }

    public final void a(aagw aagw) {
    }

    public final void a(aagw aagw, aaha aaha) {
    }

    public final void a(afif afif) {
    }

    public final void a(vqg vqg) {
    }

    public final void a(vqi vqi) {
    }

    public final void a(vra vra) {
    }

    public final void a(vtb vtb) {
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void h() {
    }

    public final void j() {
    }

    public final void k() {
    }

    public final void l() {
    }

    public final void m() {
    }

    private final void p() {
        vcp vcp = this.d;
        if (vcp != null) {
            vcp.h();
            this.d.b = null;
        }
    }

    public final void b() {
        if (this.f) {
            p();
        }
        bcuo bcuo = this.k;
        if (bcuo != null) {
            bcuo.b();
            this.k = null;
        }
    }

    public final tqg a() {
        return new tqg(this.b.f() * 1000, this.l);
    }

    public final Set a(tqh tqh) {
        Collection a;
        List linkedList = new LinkedList();
        vso vso = this.b;
        switch (tqh.ordinal()) {
            case 0:
                a = wbt.a(vso.q());
                break;
            case 1:
                a = wbt.a(vso.r());
                break;
            case 2:
                a = wbt.a(vso.s());
                break;
            case 3:
                a = wbt.a(vso.t());
                break;
            case 4:
                a = wbt.a(vso.w());
                break;
            case 5:
                a = wbt.a(vso.z());
                break;
            case 6:
                a = wbt.a(vso.y());
                break;
            case 8:
                a = wbt.a(vso.E());
                break;
            case 9:
                a = wbt.a(vso.v());
                break;
            case 12:
                a = wbt.a(vso.G());
                break;
            case 13:
                a = wbt.a(vso.H());
                break;
            case 14:
                a = wbt.a(vso.F());
                break;
            case 15:
                a = wbt.a(vso.A());
                break;
            case 16:
                a = wbt.a(vso.B());
                break;
            default:
                a = Collections.emptyList();
                break;
        }
        linkedList.addAll(a);
        return afti.a(linkedList, this.c.b);
    }

    public final void a(tps tps) {
        if (this.n) {
            a(this.b.F(), tps);
            if (this.b.I() != null) {
                a(this.b.I().l, tps, this.c);
            }
        }
    }

    public final void b(tps tps) {
        if (this.n) {
            a(this.b.G(), tps);
            if (this.b.I() != null) {
                a(this.b.I().j, tps, this.c);
            }
        }
    }

    public final void c(tps tps) {
        if (this.n) {
            a(this.b.H(), tps);
            if (this.b.I() != null) {
                a(this.b.I().k, tps, this.c);
            }
        }
    }

    public final vqp c() {
        return this.c;
    }

    public final String n() {
        vso vso = this.b;
        return vso != null ? vso.j : null;
    }

    public final void f() {
        if (this.f) {
            this.g.a(this.b.C());
            if (this.b.I() != null) {
                a(this.b.I().h, new aftl[0]);
            }
        }
    }

    public final void a(ahkr ahkr) {
        if (this.f) {
            int i = ahkr.a;
            if (i == 9 || i == 10) {
                p();
            }
        }
    }

    public final void g() {
        if (!this.m) {
            this.m = true;
            this.c.d = true;
            if (this.f) {
                vcp vcp = this.d;
                tps a = vcp != null ? vcp.a() : null;
                a(this.b.z(), a);
                if (this.b.I() != null) {
                    a(this.b.I().d, a, this.c);
                }
            }
        }
    }

    public final void i() {
        this.m = false;
        this.c.d = false;
        if (this.f) {
            vcp vcp = this.d;
            tps b = vcp != null ? vcp.b() : null;
            a(this.b.y(), b);
            if (this.b.I() != null) {
                a(this.b.I().c, b, this.c);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f0 A:{LOOP_END, LOOP:2: B:43:0x00ea->B:45:0x00f0} */
    public final void a(defpackage.ahkm r8) {
        /*
        r7 = this;
        r0 = r8.g;
        if (r0 == 0) goto L_0x0100;
    L_0x0004:
        r0 = r8.a;
        r8 = (int) r0;
        r7.l = r8;
        r0 = r7.c;
        r1 = (long) r8;
        r0.e = r1;
        r0 = r7.f;
        r1 = 0;
        r2 = 1;
        r3 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        if (r0 == 0) goto L_0x0017;
    L_0x0016:
        goto L_0x0050;
    L_0x0017:
        if (r8 > r3) goto L_0x0100;
    L_0x0019:
        r7.n = r2;
        r0 = r7.d;
        if (r0 == 0) goto L_0x0024;
    L_0x001f:
        r0 = r0.c();
        goto L_0x0025;
    L_0x0024:
        r0 = r1;
    L_0x0025:
        r4 = r7.g;
        r5 = r7.b;
        r5 = r5.p();
        r4.a(r5);
        r4 = r7.b;
        r4 = r4.q();
        r7.a(r4, r0);
        r4 = r7.b;
        r4 = r4.I();
        if (r4 == 0) goto L_0x004e;
    L_0x0041:
        r4 = r7.b;
        r4 = r4.I();
        r4 = r4.a;
        r5 = r7.c;
        r7.a(r4, r0, r5);
    L_0x004e:
        r7.f = r2;
    L_0x0050:
        r0 = r7.b;
        r0 = r0.f();
        r0 = r0 * 1000;
        r3 = r7.i;
        r3 = r3.iterator();
    L_0x005e:
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0095;
    L_0x0064:
        r4 = r3.next();
        r4 = (java.lang.Integer) r4;
        r4 = r4.intValue();
        r5 = r4 * r0;
        r5 = r5 / 4;
        r6 = r5 + -1000;
        if (r8 < r6) goto L_0x005e;
    L_0x0076:
        r5 = r5 + 1000;
        if (r8 > r5) goto L_0x005e;
    L_0x007a:
        r0 = r7.d;
        if (r0 == 0) goto L_0x0082;
    L_0x007e:
        r1 = r0.a(r4);
    L_0x0082:
        r0 = r7.b;
        r0 = defpackage.was.a(r0, r4);
        r7.a(r0, r1);
        r0 = r7.i;
        r1 = java.lang.Integer.valueOf(r4);
        r0.remove(r1);
        goto L_0x00b2;
    L_0x0095:
        r3 = r7.o;
        if (r3 != 0) goto L_0x00b2;
    L_0x0099:
        r3 = r0 + -1000;
        if (r8 < r3) goto L_0x00b2;
    L_0x009d:
        if (r8 > r0) goto L_0x00b2;
    L_0x009f:
        r0 = r7.d;
        if (r0 == 0) goto L_0x00a7;
    L_0x00a3:
        r1 = r0.d();
    L_0x00a7:
        r0 = r7.b;
        r0 = r0.w();
        r7.a(r0, r1);
        r7.o = r2;
    L_0x00b2:
        r0 = new java.util.HashSet;
        r0.<init>();
        r1 = 0;
    L_0x00b8:
        r2 = r7.j;
        r2 = r2.size();
        if (r1 >= r2) goto L_0x00e6;
    L_0x00c0:
        r2 = r7.j;
        r2 = r2.keyAt(r1);
        r3 = r2 + -1000;
        if (r8 >= r3) goto L_0x00cb;
    L_0x00ca:
        goto L_0x00e3;
    L_0x00cb:
        r3 = r2 + 1000;
        if (r8 > r3) goto L_0x00e3;
    L_0x00cf:
        r3 = r7.g;
        r4 = r7.j;
        r4 = r4.get(r2);
        r4 = (java.util.List) r4;
        r3.a(r4);
        r2 = java.lang.Integer.valueOf(r2);
        r0.add(r2);
    L_0x00e3:
        r1 = r1 + 1;
        goto L_0x00b8;
    L_0x00e6:
        r8 = r0.iterator();
    L_0x00ea:
        r0 = r8.hasNext();
        if (r0 == 0) goto L_0x0100;
    L_0x00f0:
        r0 = r8.next();
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r1 = r7.j;
        r1.remove(r0);
        goto L_0x00ea;
    L_0x0100:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wbt.a(ahkm):void");
    }

    public final void o() {
        if (this.f) {
            vcp vcp = this.d;
            if (vcp != null) {
                vcp.g();
            }
        }
    }

    private static List a(List list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        for (aojo aojo : list) {
            if (!(aojo == null || (aojo.a & 1) == 0)) {
                try {
                    Uri a = xvt.a(aojo.b);
                    if (!(a == null || Uri.EMPTY.equals(a))) {
                        linkedList.add(a);
                    }
                } catch (MalformedURLException unused) {
                }
            }
        }
        return linkedList;
    }

    public final boolean a(List list, tps tps) {
        return this.g.a(list, this.c.a(tps));
    }

    public final void a(List list, tps tps, vqp vqp) {
        vqo a = vqp.a(tps);
        a(list, a);
    }

    private final void a(List list, aftl... aftlArr) {
        if (this.h != null && !list.isEmpty()) {
            Map hashMap = new HashMap();
            if (aftlArr.length != 0) {
                hashMap.put("MacrosConverters.CustomConvertersKey", aftlArr);
            }
            aabd.a(this.h, list, hashMap);
        }
    }
}
