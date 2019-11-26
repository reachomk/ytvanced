package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: amsb */
final class amsb extends amvv {
    private final /* synthetic */ amsc a;

    amsb(amsc amsc) {
        this.a = amsc;
    }

    /* Access modifiers changed, original: final */
    public final Map a() {
        return this.a;
    }

    public final Iterator iterator() {
        return new amse(this.a);
    }

    public final boolean contains(Object obj) {
        return amsr.a(this.a.a.entrySet(), obj);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Entry entry = (Entry) obj;
        amrz amrz = this.a.b;
        obj = entry.getKey();
        Object obj2 = amrz.a;
        amqw.a(obj2);
        try {
            obj = obj2.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj = null;
        }
        Collection collection = (Collection) obj;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            amrz.b -= size;
        }
        return true;
    }
}
