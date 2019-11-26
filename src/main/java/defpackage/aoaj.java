package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: aoaj */
final class aoaj extends AbstractSet {
    private final /* synthetic */ aoae a;

    public final Iterator iterator() {
        return new aoak(this.a);
    }

    public final int size() {
        return this.a.size();
    }

    public final boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.a.get(entry.getKey());
        obj = entry.getValue();
        boolean z = true;
        if (obj2 != obj) {
            if (obj2 == null) {
                z = false;
            } else if (obj2.equals(obj)) {
                return z;
            } else {
                return false;
            }
        }
        return z;
    }

    public final boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.a.remove(entry.getKey());
        return true;
    }

    public final void clear() {
        this.a.clear();
    }

    public final /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    /* synthetic */ aoaj(aoae aoae) {
        this.a = aoae;
    }
}
