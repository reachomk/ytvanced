package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: znd */
public final class znd {
    public static void a(Set set, Object obj) {
        if (obj == null) {
            xtl.c("EffectsProvider.addListener: Attempt to add null listener");
            return;
        }
        synchronized (set) {
            set.add(obj);
        }
    }

    public static void b(Set set, Object obj) {
        if (set != null) {
            synchronized (set) {
                HashSet<xsd> hashSet = new HashSet(set);
            }
            for (xsd a : hashSet) {
                a.a(obj);
            }
        }
    }
}
