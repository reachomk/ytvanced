package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: amvx */
final class amvx extends AbstractCollection {
    private final Map a;

    amvx(Map map) {
        this.a = (Map) amqw.a((Object) map);
    }

    public final Iterator iterator() {
        return new amvt(this.a.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        try {
            obj = super.remove(obj);
            return obj;
        } catch (UnsupportedOperationException unused) {
            for (Entry entry : this.a.entrySet()) {
                if (amqq.a(obj, entry.getValue())) {
                    this.a.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean removeAll(Collection collection) {
        try {
            collection = super.removeAll((Collection) amqw.a((Object) collection));
            return collection;
        } catch (UnsupportedOperationException unused) {
            HashSet a = amws.a();
            for (Entry entry : this.a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    a.add(entry.getKey());
                }
            }
            return this.a.keySet().removeAll(a);
        }
    }

    public final boolean retainAll(Collection collection) {
        try {
            collection = super.retainAll((Collection) amqw.a((Object) collection));
            return collection;
        } catch (UnsupportedOperationException unused) {
            HashSet a = amws.a();
            for (Entry entry : this.a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    a.add(entry.getKey());
                }
            }
            return this.a.keySet().retainAll(a);
        }
    }

    public final int size() {
        return this.a.size();
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    public final void clear() {
        this.a.clear();
    }
}
