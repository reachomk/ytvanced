package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: amsd */
final class amsd extends amvy {
    public final /* synthetic */ amrz a;

    amsd(amrz amrz, Map map) {
        this.a = amrz;
        super(map);
    }

    public final Iterator iterator() {
        return new amsg(this, this.b.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            amrz.b(this.a, size);
            if (size > 0) {
                return true;
            }
        }
        return false;
    }

    public final void clear() {
        amve.b(iterator());
    }

    public final boolean containsAll(Collection collection) {
        return this.b.keySet().containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.b.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.b.keySet().hashCode();
    }
}
