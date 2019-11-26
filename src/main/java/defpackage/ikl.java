package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: ikl */
public final class ikl extends akwe implements xcp {
    public final HashSet a = new HashSet();
    public final HashMap b = new HashMap();

    public ikl(akvz akvz, xci xci, xoi xoi, aana aana, acvx acvx, akyd akyd) {
        super(aana, akvz, xci, xoi, acvx, akyd.a(akyd), new akpk());
        this.i.a(new ikm(this));
        a(new ikn(this));
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (cls != ikl.class) {
            return super.a(cls, obj, i);
        }
        Class[] clsArr = null;
        int i2 = 0;
        if (i == -1) {
            clsArr = new Class[]{ilb.class};
        } else if (i == 0) {
            awjr awjr = ((ilb) obj).a;
            anxp anxp = awjr.e;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(awlf.a);
            anxp.a(access$000);
            obj = anxp.h.b(access$000.d);
            if (obj == null) {
                obj = access$000.b;
            } else {
                obj = access$000.a(obj);
            }
            awle awle = (awle) obj;
            i = awle.b.size();
            int i3 = 0;
            while (i3 < this.i.d()) {
                if (awjr.equals(this.i.c(i3))) {
                    i2 = 1;
                    break;
                }
                i3++;
            }
            i3 = 0;
            if (i2 != 0) {
                if (this.a.add(awjr)) {
                    this.i.a(i3 + 1, i);
                } else {
                    this.a.remove(awjr);
                    amuo amuo = new amuo();
                    for (awli awli : awle.b) {
                        Object obj2 = awli.b;
                        if (obj2 == null) {
                            obj2 = awlq.C;
                        }
                        amuo.c(obj2);
                    }
                    a(amuo.a(), i3 + 1);
                }
                if (this.b.containsKey(awjr)) {
                    iko iko = (iko) this.b.get(awjr);
                    if (iko != null) {
                        iko.a(this.a.contains(awjr));
                        return null;
                    }
                }
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
