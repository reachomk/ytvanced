package defpackage;

import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaPositionType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cxq */
public final class cxq {
    public static final cxv a = new cxf();
    public static final boolean b = false;
    public static final aph c = new cxr();
    public static final boolean d = false;
    public static final boolean e = cuj.e;

    static cma a(cmg cmg, cwh cwh, cma cma, cma cma2, cma cma3, List list, boolean z, boolean z2, boolean z3, aph aph, int i, int i2, int i3, int i4, int i5, int i6, boolean z4, boolean z5, cxv cxv, boolean z6, cxw cxw, cxs cxs, cyf cyf, cwo cwo, cxu cxu, arm arm) {
        boolean z7;
        cwh cwh2 = cwh;
        cma cma4 = cma;
        cma cma5 = cma2;
        cma cma6 = cma3;
        List list2 = list;
        cxs cxs2 = cxs;
        cwo cwo2 = cwo;
        cxu.a = null;
        cwh cwh3;
        if (z6 && z4) {
            z7 = cwo2.a;
            synchronized (cwo) {
                cwh3 = cwo2.f;
                if (cwh3 != null) {
                    if (cwh3.f == cwh2.f) {
                    }
                }
                cwh3 = cwo2.g;
                if (cwh3 != null) {
                    if (cwh3.f == cwh2.f) {
                    }
                }
                cwo2.g = cwo.a(cwh, false);
                cwo2.e.a();
            }
        } else {
            cxm.g(cmg);
            synchronized (cwo) {
                z7 = cwo2.a;
                cwh3 = cwo2.f;
                if (cwh3 != null) {
                    if (cwh3.f == cwh2.f) {
                    }
                }
                cwh3 = cwo2.g;
                if (cwh3 != null) {
                    if (cwh3.f == cwh2.f) {
                    }
                }
                cwo2.g = cwo.a(cwh, false);
                cwh2 = cwo2.f;
                if (cwo2.c && cwh2 != null) {
                    cwo2.e.a();
                } else {
                    cwo2.a(0, null);
                }
            }
        }
        z7 = true;
        Object obj = (cxs2 == cxs.ERROR && cma6 == null) ? 1 : null;
        if ((cxs2 == cxs.EMPTY && cma5 == null) || obj != null) {
            return null;
        }
        coj a;
        if (cxv.d() == 0 || z5) {
            z7 = false;
        }
        dac g = czz.g(cmg);
        czz czz = g.a;
        czz.e = z;
        czz.x = i2;
        czz.H = i3;
        czz.K = i4;
        czz.c = i5;
        czz.d = z2;
        czz.y = z3;
        czz.I = 0;
        czz.D = i;
        czz.A = 0;
        czz.C = cxw;
        cmg cmg2;
        if (z7) {
            cmg2 = cmg;
            a = cxm.a(cmg, cwo2);
        } else {
            cmg2 = cmg;
            a = null;
        }
        czz czz2 = g.a;
        czz2.E = a;
        czz2.B = z7;
        czz2.w = null;
        czz2.u = false;
        czz2.M = false;
        czz2.g = g.c.a(0.0f);
        cxt cxt = new cxt();
        czz2 = g.a;
        if (czz2.z == null) {
            czz2.z = new ArrayList();
        }
        g.a.z.add(cxt);
        if (list2 != null) {
            List list3 = g.a.z;
            if (list3 == null || list3.isEmpty()) {
                g.a.z = list2;
            } else {
                g.a.z.addAll(list2);
            }
        }
        czz czz3 = g.a;
        czz3.F = null;
        czz3.G = i6;
        czz3.J = arm;
        czz3.L = null;
        czz3.b = cyf;
        g.d.set(0);
        aph aph2 = aph;
        if (c == aph2) {
            aph2 = new cxr();
        }
        g.a.v = aph2;
        clz clz = (dac) ((dac) g.b(0.0f)).c(null);
        if (!cyf.c()) {
            cxv.e();
            ((dac) clz.a(YogaPositionType.ABSOLUTE)).a(YogaEdge.ALL, 0);
        }
        clr clr = (clr) cls.a(cmg).b(0.0f);
        clr.a.c = YogaAlign.FLEX_START;
        clr a2 = clr.a(clz);
        ctb a3;
        if (cxs2 == cxs.LOADING && cma4 != null) {
            ctb a4 = ctc.a(cmg);
            a4.a(cma);
            a2.a(((ctb) ((ctb) a4.b(0.0f)).a(YogaPositionType.ABSOLUTE)).a(YogaEdge.ALL, 0));
        } else if (cxs2 == cxs.EMPTY) {
            a3 = ctc.a(cmg);
            a3.a(cma5);
            a2.a(((ctb) ((ctb) a3.b(0.0f)).a(YogaPositionType.ABSOLUTE)).a(YogaEdge.ALL, 0));
        } else if (cxs2 == cxs.ERROR) {
            a3 = ctc.a(cmg);
            a3.a(cma6);
            a2.a(((ctb) ((ctb) a3.b(0.0f)).a(YogaPositionType.ABSOLUTE)).a(YogaEdge.ALL, 0));
        }
        return (cls) a2.c();
    }

    static void a(cmg cmg, cwh cwh, cxv cxv, boolean z, boolean z2, cri cri, cri cri2, cri cri3, cri cri4, cri cri5, cri cri6) {
        cxk e = cxv.e();
        dbf dbf = new dbf();
        dbf.c = cxv.a(cmg);
        dbf.b = e.a;
        dbf.d = null;
        dbf.i = false;
        dbf.m = false;
        dbf.o = null;
        dbf.n = e.j;
        dbf.p = e.k;
        dbf.q = e.l;
        dbf.s = false;
        dbf.g = false;
        dbf.h = false;
        dbf.l = null;
        dbf.u = e.e;
        cwy cxy = new cxy(dbf.a(cmg), e.g);
        cwj cwj = new cwj(cmg);
        cri4.a = cxy;
        cri.a = cxv.b();
        cwr a = cwo.a(cwj, cxy);
        String str = cwh.e;
        if (str == null) {
            str = "";
        }
        a.e = str;
        a.d = z;
        a.c = z2;
        a.f = false;
        cwo cwo = new cwo(a);
        cri2.a = cwo;
        cxw cxw = new cxw();
        WeakReference weakReference = new WeakReference(cwo);
        cxv.c();
        cri6.a = cxw;
        cxu cxu = new cxu();
        cri3.a = cxu;
        cwo.d = cxu;
        cxy.a.A.a(new cxp(cwo));
        cxy.a.r = false;
        cri5.a = cxs.LOADING;
    }

    protected static boolean a(cmg cmg, cwo cwo) {
        cwh cwh;
        cxm.a(cmg);
        synchronized (cwo) {
            boolean z = cwo.a;
            cwh = cwo.f;
        }
        if (cwh != null) {
            cwo.a(cwh);
        }
        return true;
    }
}
