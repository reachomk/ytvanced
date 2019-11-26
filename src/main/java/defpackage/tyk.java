package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: tyk */
final class tyk implements tzu {
    tyk() {
    }

    public final /* synthetic */ Object a() {
        try {
            tyq tyq = tyo.a;
            tyn tyn = tyo.b;
            tyl tyl = new tyl();
            tyl.a(18, tyn.a, tyn.b);
            tyl.a(2, tyq.a, tyq.e);
            tyl.a(3, tyq.a, tyq.b);
            tyl.a(4, tyq.b, tyq.c);
            tyl.a(5, tyq.c, tyq.d);
            tup tup = tyn.a;
            tup tup2 = tyq.a;
            if (tup != null) {
                if (tup2 != null) {
                    tup2 = tup.a(tup2, tup);
                    bcen bcen = (bcen) bceo.d.createBuilder();
                    bced bced = (bced) bcee.d.createBuilder();
                    bced.a(tup2.a());
                    bcen.a(bced);
                    bcen.a(19);
                    tyl.a.add((bceo) ((anxl) bcen.build()));
                }
            }
            bceo[] bceoArr = (bceo[]) tyl.a.toArray(new bceo[0]);
            if (bceoArr == null) {
                return null;
            }
            if (bceoArr.length == 0) {
                return null;
            }
            bcel bcel = (bcel) bcem.b.createBuilder();
            List asList = Arrays.asList(bceoArr);
            bcel.copyOnWrite();
            bcem bcem = (bcem) bcel.instance;
            if (!bcem.a.a()) {
                bcem.a = anxl.mutableCopy(bcem.a);
            }
            anvf.addAll(asList, bcem.a);
            return (bcem) ((anxl) bcel.build());
        } catch (RuntimeException e) {
            tyv.b("PrimesForPrimes", "Exception getting Primes Init timers", e, new Object[0]);
            return null;
        }
    }
}
