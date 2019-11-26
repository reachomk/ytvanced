package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: amsc */
final class amsc extends amwa {
    public final transient Map a;
    public final /* synthetic */ amrz b;

    amsc(amrz amrz, Map map) {
        this.b = amrz;
        this.a = map;
    }

    /* Access modifiers changed, original: protected|final */
    public final Set a() {
        return new amsb(this);
    }

    public final boolean containsKey(Object obj) {
        Object obj2 = this.a;
        amqw.a(obj2);
        try {
            return obj2.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final Set keySet() {
        return this.b.d();
    }

    public final int size() {
        return this.a.size();
    }

    public final boolean equals(Object obj) {
        return this == obj || this.a.equals(obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public final void clear() {
        Map map = this.a;
        amrz amrz = this.b;
        if (map == amrz.a) {
            amrz.b();
        } else {
            amve.b(new amse(this));
        }
    }

    public final /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection a = this.b.a();
        a.addAll(collection);
        amrz.b(this.b, collection.size());
        collection.clear();
        return a;
    }

    public final /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) amvr.a(this.a, obj);
        return collection != null ? this.b.a(obj, collection) : null;
    }
}
