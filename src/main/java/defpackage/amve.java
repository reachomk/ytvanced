package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: amve */
public final class amve {
    public static boolean a(Iterator it, Collection collection) {
        amqw.a((Object) collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean a(Collection collection, Iterator it) {
        amqw.a((Object) collection);
        amqw.a((Object) it);
        int i = 0;
        while (it.hasNext()) {
            i |= collection.add(it.next());
        }
        if (i != 0) {
            return true;
        }
        return false;
    }

    public static amxo a(Iterator it, amqv amqv) {
        amqw.a((Object) it);
        amqw.a((Object) amqv);
        return new amvd(it, amqv);
    }

    public static Iterator a(Iterator it, amqd amqd) {
        amqw.a((Object) amqd);
        return new amvg(it, amqd);
    }

    public static Object a(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    static void b(Iterator it) {
        amqw.a((Object) it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
