package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: zzr */
public final class zzr implements zzo {
    public final List a(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof akcb) {
            akce akce = ((akcb) obj).a;
            if (akce != null) {
                akap akap = akce.a;
                if (akap != null) {
                    atom atom = akap.c;
                    if (atom != null && atom.a == 46659098) {
                        aozg aozg = (aozg) atom.b;
                        for (aozl a : aozg.b) {
                            zzr.a(a, arrayList);
                        }
                        for (aozl a2 : aozg.c) {
                            zzr.a(a2, arrayList);
                        }
                        for (aozl a3 : aozg.d) {
                            zzr.a(a3, arrayList);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private static void a(aozl aozl, ArrayList arrayList) {
        if ((aozl.a & 4) != 0) {
            aozk aozk = aozl.d;
            if (aozk == null) {
                aozk = aozk.c;
            }
            if (aozk.a == 84996305) {
                aoze aoze = (aoze) aozk.b;
                if ((aoze.a & 1) != 0) {
                    Object obj = aoze.b;
                    if (obj == null) {
                        obj = apxu.d;
                    }
                    arrayList.add(obj);
                }
            }
            if (aozk.a == 111631903) {
                aozd aozd = (aozd) aozk.b;
                if ((aozd.a & 1) != 0) {
                    Object obj2 = aozd.b;
                    if (obj2 == null) {
                        obj2 = apxu.d;
                    }
                    arrayList.add(obj2);
                }
            }
        }
    }
}
