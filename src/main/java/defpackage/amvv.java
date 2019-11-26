package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: amvv */
abstract class amvv extends amwr {
    amvv() {
    }

    public abstract Map a();

    public final int size() {
        return a().size();
    }

    public final void clear() {
        a().clear();
    }

    public boolean contains(Object obj) {
        boolean z = false;
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            Object a = amvr.a(a(), key);
            if (amqq.a(a, entry.getValue())) {
                if (a == null) {
                    return !a().containsKey(key) ? z : true;
                } else {
                    z = true;
                }
            }
        }
    }

    public final boolean isEmpty() {
        return a().isEmpty();
    }

    public boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        return a().keySet().remove(((Entry) obj).getKey());
    }

    public final boolean removeAll(Collection collection) {
        try {
            collection = amws.a((Set) this, (Collection) amqw.a((Object) collection));
            return collection;
        } catch (UnsupportedOperationException unused) {
            return amws.a((Set) this, collection.iterator());
        }
    }

    public final boolean retainAll(Collection collection) {
        try {
            collection = super.retainAll((Collection) amqw.a((Object) collection));
            return collection;
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet(amvr.b(collection.size()));
            for (Object next : collection) {
                if (contains(next)) {
                    hashSet.add(((Entry) next).getKey());
                }
            }
            return a().keySet().retainAll(hashSet);
        }
    }
}
