package defpackage;

import android.os.SystemClock;
import java.util.Collection;

/* renamed from: alvz */
public final class alvz implements xgv {
    public final void a(xgt xgt) {
        Object obj;
        long longValue;
        twm twm = new twm(xgt.a());
        String h = xgt.h();
        if (h != null) {
            twm.g = h;
        }
        h = xgt.b();
        if (!(h == null || h.isEmpty())) {
            twm.i = h;
        }
        Long c = xgt.c();
        int i = 0;
        int intValue = c != null ? c.intValue() : 0;
        Long d = xgt.d();
        if (d != null) {
            i = d.intValue();
        }
        twm.c = SystemClock.elapsedRealtime() - twm.a;
        twm.d = intValue;
        twm.e = i;
        Integer g = xgt.g();
        if (g != null) {
            intValue = g.intValue();
            if (intValue >= 0) {
                twm.h = intValue;
            }
        }
        c = xgt.e();
        if (c != null) {
            obj = tzy.a;
            longValue = c.longValue();
            uhy.a(obj);
            twm.b = longValue;
        }
        c = xgt.f();
        if (c != null) {
            obj = tzy.a;
            longValue = c.longValue();
            uhy.a(obj);
            twm.c = longValue;
        }
        intValue = bccd.a(xgt.j());
        if (intValue != 0) {
            twm.p = intValue;
        }
        g = xgt.k();
        if (g != null) {
            twm.l = g.intValue();
        }
        g = xgt.l();
        if (g != null) {
            twm.m = g.intValue();
        }
        Collection m = xgt.m();
        if (!(m == null || m.isEmpty())) {
            for (Object next : m) {
                if (next instanceof aals) {
                    aals aals = (aals) next;
                    twm.n = aals.d();
                    bcbe bcbe = (bcbe) bcbb.c.createBuilder();
                    bcbi bcbi = (bcbi) bcbf.c.createBuilder();
                    bcbg bcbg = (bcbg) bcbd.e.createBuilder();
                    long longValue2 = aals.a().longValue();
                    bcbg.copyOnWrite();
                    bcbd bcbd = (bcbd) bcbg.instance;
                    bcbd.a |= 1;
                    bcbd.b = longValue2;
                    int c2 = aals.c();
                    bcbg.copyOnWrite();
                    bcbd bcbd2 = (bcbd) bcbg.instance;
                    bcbd2.a |= 2;
                    bcbd2.c = c2;
                    amul e = aals.e();
                    bcbg.copyOnWrite();
                    bcbd bcbd3 = (bcbd) bcbg.instance;
                    if (!bcbd3.d.a()) {
                        bcbd3.d = anxl.mutableCopy(bcbd3.d);
                    }
                    anvf.addAll(e, bcbd3.d);
                    bcbd bcbd4 = (bcbd) ((anxl) bcbg.build());
                    bcbi.copyOnWrite();
                    bcbf bcbf = (bcbf) bcbi.instance;
                    if (bcbd4 != null) {
                        bcbf.b = bcbd4;
                        bcbf.a |= 1;
                        bcbe.copyOnWrite();
                        bcbb bcbb = (bcbb) bcbe.instance;
                        bcbb.b = (bcbf) ((anxl) bcbi.build());
                        bcbb.a |= 32;
                        twm.k = (bcbb) ((anxl) bcbe.build());
                    } else {
                        throw new NullPointerException();
                    }
                }
            }
        }
        txd.a().a.a(twm);
    }
}
