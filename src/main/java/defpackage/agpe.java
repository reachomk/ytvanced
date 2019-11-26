package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: agpe */
public final class agpe {
    public static List a(azpz azpz, List list) {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        if (list.size() == 1 && azpz.d == (((azpz) list.get(0)).d + ((azpz) list.get(0)).e) + 1) {
            azpy azpy = (azpy) ((anxo) ((azpz) list.get(0)).toBuilder());
            azpy.b(((azpz) azpy.instance).e + azpz.e);
            list.set(0, (azpz) ((anxl) azpy.build()));
            return list;
        }
        for (azpz azpz2 : list) {
            long j = azpz.d;
            long j2 = azpz2.d;
            if (j > (azpz2.e + j2) + 1) {
                arrayList.add(azpz2);
            } else if (j2 <= (j + azpz.e) + 1) {
                azpy azpy2 = (azpy) azpz.g.createBuilder();
                azpy2.a(Math.min(azpz.d, azpz2.d));
                azpy2.b(Math.max(azpz.d + azpz.e, azpz2.d + azpz2.e) - ((azpz) azpy2.instance).d);
                azpz = (azpz) ((anxl) azpy2.build());
            } else {
                arrayList.add(azpz2);
            }
        }
        if (!arrayList.isEmpty() && azpz.d >= ((azpz) arrayList.get(0)).d) {
            while (i < arrayList.size()) {
                if (azpz.d <= ((azpz) arrayList.get(i - 1)).d || azpz.d >= ((azpz) arrayList.get(i)).d) {
                    i++;
                } else {
                    arrayList.add(i, azpz);
                    return arrayList;
                }
            }
            arrayList.add(azpz);
            return arrayList;
        }
        arrayList.add(0, azpz);
        return arrayList;
    }
}
