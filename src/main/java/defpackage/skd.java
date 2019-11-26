package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* renamed from: skd */
public final class skd implements sns {
    private final Collection a;
    private final sxd b;

    public skd(Map map, sxd sxd) {
        this.a = map.values();
        this.b = sxd;
    }

    private final cma a(cmg cmg, swk swk, bdhc bdhc, swp swp) {
        int length = bdhc.c.length;
        swn swn = null;
        ArrayList arrayList = new ArrayList(Collections.nCopies(length, null));
        ArrayList arrayList2 = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList2.add(Integer.valueOf(i));
        }
        Collections.shuffle(arrayList2);
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.set(((Integer) arrayList2.get(i2)).intValue(), a(cmg, swk, bdhc.c[((Integer) arrayList2.get(i2)).intValue()], swp));
        }
        if (bdhc.a == null) {
            this.b.b(1, "The type is not present in Element");
        } else {
            for (sxc sxc : this.a) {
                Object a = szb.a(bdhc.a, sxc.a());
                if (a != null) {
                    swn = sxc.a(cmg, swk, a, bdhc.d, bdhc.b, arrayList, swp);
                    break;
                }
            }
            sxd sxd = this.b;
            String valueOf = String.valueOf(bdhc.a.getClass().getCanonicalName());
            String str = "Converter was not found ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            sxd.b(1, valueOf);
        }
        if (swn != null) {
            return swn.a(cmg);
        }
        return (cza) cza.a(cmg).c();
    }

    public final /* synthetic */ cma a(cmg cmg, swk swk, Object obj, swp swp, bbmz bbmz) {
        bdhc bdhc = (bdhc) obj;
        syb syb = syb.a;
        if (!(swk == null || swk.d() == null)) {
            syb = swk.d();
        }
        cma a = a(cmg, swk, bdhc, swp);
        sjz sjz = new sjz();
        sjz.a(sjz, cmg, new ska());
        sjz.a.c = a != null ? a.g() : null;
        sjz.d.set(1);
        sjz.a.d = this;
        sjz.d.set(2);
        sjz.a.e = syb;
        sjz.d.set(3);
        sjz.a.a = bbmz;
        sjz.d.set(0);
        if (swp != null) {
            sjz.a.b = swp;
        }
        String str = bdhc.d;
        if (str != null) {
            sjz.a(str);
        }
        return (ska) sjz.c();
    }
}
