package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: rhj */
final class rhj extends AbstractSet {
    private final /* synthetic */ rhb a;

    public final Iterator iterator() {
        return new rhk(this.a);
    }

    public final int size() {
        return this.a.size();
    }

    public final boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.a.get(entry.getKey());
        obj = entry.getValue();
        return obj2 == obj || (obj2 != null && obj2.equals(obj));
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

    /* synthetic */ rhj(rhb rhb) {
        this.a = rhb;
    }
}
