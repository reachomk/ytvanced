package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: amsr */
public final class amsr {
    public static Collection a(Collection collection, amqv amqv) {
        if (!(collection instanceof amsu)) {
            return new amsu((Collection) amqw.a((Object) collection), (amqv) amqw.a((Object) amqv));
        }
        amsu amsu = (amsu) collection;
        Collection collection2 = amsu.a;
        amqv amqv2 = (amqv) amqw.a(amsu.b);
        amqv = (amqv) amqw.a((Object) amqv);
        return new amsu(collection2, new amqy(Arrays.asList(new amqv[]{amqv2, amqv})));
    }

    static boolean a(Collection collection, Object obj) {
        amqw.a((Object) collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static boolean a(Collection collection, Collection collection2) {
        for (Object contains : collection2) {
            if (!collection.contains(contains)) {
                return false;
            }
        }
        return true;
    }
}
