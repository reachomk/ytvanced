package defpackage;

import java.util.ArrayList;

/* renamed from: trt */
public final class trt {
    public static anbn a() {
        anbq anbq = (anbq) anbn.g.createBuilder();
        angm a = trq.a();
        anbq.copyOnWrite();
        anbn anbn = (anbn) anbq.instance;
        if (a != null) {
            anbn.b = a;
            anbn.a |= 1;
            return (anbn) ((anxl) anbq.build());
        }
        throw new NullPointerException();
    }

    public static void a(ArrayList arrayList, trv trv, int i, angm angm) {
        trs a = trv.a();
        if (a != null) {
            anbw anbw;
            anxo anxo;
            anbv anbv = (anbv) anbw.g.createBuilder();
            int i2 = a.a;
            anbv.copyOnWrite();
            anbw anbw2 = (anbw) anbv.instance;
            anbw2.a |= 1;
            anbw2.b = i2;
            if (!(a.b() == 0 || a.b() == 1)) {
                i2 = a.b();
                anbv.copyOnWrite();
                anbw = (anbw) anbv.instance;
                if (i2 != 0) {
                    anbw.a |= 32;
                    anbw.f = i2 - 1;
                } else {
                    throw new NullPointerException();
                }
            }
            i2 = a.c;
            if (i2 != -1) {
                anbv.copyOnWrite();
                anbw = (anbw) anbv.instance;
                anbw.a |= 8;
                anbw.e = i2;
            }
            i2 = a.d;
            if (i2 != -1) {
                anbv.copyOnWrite();
                anbw = (anbw) anbv.instance;
                anbw.a |= 2;
                anbw.c = i2;
            }
            arrayList.add((anbw) ((anxl) anbv.build()));
            int size = arrayList.size() - 1;
            if (i >= 0) {
                anbv anbv2 = (anbv) ((anxo) ((anbw) arrayList.get(i)).toBuilder());
                anbv2.copyOnWrite();
                anbw = (anbw) anbv2.instance;
                if (!anbw.d.a()) {
                    anbw.d = anxl.mutableCopy(anbw.d);
                }
                anbw.d.d(size);
                arrayList.set(i, (anbw) ((anxl) anbv2.build()));
            }
            i = arrayList.size() - 1;
            trx trx = a.b;
            if (trx == null) {
                anxo = (trw) trx.e.createBuilder();
            } else {
                anxo = (trw) ((anxo) trx.toBuilder());
            }
            anxo.copyOnWrite();
            trx trx2 = (trx) anxo.instance;
            if (angm != null) {
                trx2.b = angm;
                trx2.a |= 1;
                anxo.copyOnWrite();
                trx2 = (trx) anxo.instance;
                trx2.a |= 2;
                trx2.c = i;
                a.b = (trx) ((anxl) anxo.build());
            } else {
                throw new NullPointerException();
            }
        }
        for (trv a2 : trv.b()) {
            trt.a(arrayList, a2, i, angm);
        }
    }
}
