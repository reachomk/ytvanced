package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* renamed from: hsx */
public final class hsx {
    private static final long a = TimeUnit.MINUTES.toMillis(5);

    public static amul a(String str, Collection collection) {
        if (!agqr.a(asau.MAIN_DAILY_AUTO_OFFLINE).equals(str)) {
            return amul.a(collection);
        }
        amul g;
        if (collection.isEmpty()) {
            g = amul.g();
        } else {
            amul<agqy> a = amul.a(hta.a, (Iterable) collection);
            Iterable arrayList = new ArrayList();
            Iterable arrayList2 = new ArrayList();
            long j = 0;
            for (agqy agqy : a) {
                if (agqy.i - j > a) {
                    arrayList = amto.a(arrayList2, arrayList);
                    arrayList2 = new ArrayList();
                }
                j = agqy.i;
                arrayList2.add(agqy);
            }
            amto a2 = amto.a(arrayList2, arrayList);
            amuo a3 = amul.a(a.size());
            a3.b(a2);
            g = a3.a();
        }
        return g;
    }
}
