package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: amsu */
final class amsu extends AbstractCollection {
    public final Collection a;
    public final amqv b;

    amsu(Collection collection, amqv amqv) {
        this.a = collection;
        this.b = amqv;
    }

    public final boolean add(Object obj) {
        amqw.a(this.b.a(obj));
        return this.a.add(obj);
    }

    public final boolean addAll(Collection collection) {
        for (Object a : collection) {
            amqw.a(this.b.a(a));
        }
        return this.a.addAll(collection);
    }

    public final void clear() {
        Collection collection = this.a;
        Object obj = this.b;
        if ((collection instanceof RandomAccess) && (collection instanceof List)) {
            amux.a((List) collection, (amqv) amqw.a(obj));
            return;
        }
        Iterator it = collection.iterator();
        amqw.a(obj);
        while (it.hasNext()) {
            if (obj.a(it.next())) {
                it.remove();
            }
        }
    }

    public final boolean contains(Object obj) {
        return amsr.a(this.a, obj) ? this.b.a(obj) : false;
    }

    public final boolean containsAll(Collection collection) {
        return amsr.a((Collection) this, collection);
    }

    public final boolean isEmpty() {
        return amux.b(this.a, this.b) ^ 1;
    }

    public final Iterator iterator() {
        return amve.a(this.a.iterator(), this.b);
    }

    public final boolean remove(Object obj) {
        return contains(obj) && this.a.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        Iterator it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.a(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        Iterator it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.a(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        int i = 0;
        for (Object a : this.a) {
            if (this.b.a(a)) {
                i++;
            }
        }
        return i;
    }

    public final Object[] toArray() {
        return amvj.a(iterator()).toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        return amvj.a(iterator()).toArray(objArr);
    }
}
