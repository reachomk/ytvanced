package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: amsi */
class amsi extends AbstractCollection {
    public final Object a;
    public Collection b;
    public final amsi c;
    public final /* synthetic */ amrz d;
    private final Collection e;

    amsi(amrz amrz, Object obj, Collection collection, amsi amsi) {
        this.d = amrz;
        this.a = obj;
        this.b = collection;
        this.c = amsi;
        this.e = amsi != null ? amsi.b : null;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        amsi amsi = this.c;
        if (amsi != null) {
            amsi.a();
            if (this.c.b != this.e) {
                throw new ConcurrentModificationException();
            }
        } else if (this.b.isEmpty()) {
            Collection collection = (Collection) this.d.a.get(this.a);
            if (collection != null) {
                this.b = collection;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        amsi amsi = this.c;
        if (amsi != null) {
            amsi.b();
        } else if (this.b.isEmpty()) {
            this.d.a.remove(this.a);
        }
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        amsi amsi = this.c;
        if (amsi != null) {
            amsi.c();
        } else {
            this.d.a.put(this.a, this.b);
        }
    }

    public final int size() {
        a();
        return this.b.size();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        a();
        return this.b.equals(obj);
    }

    public final int hashCode() {
        a();
        return this.b.hashCode();
    }

    public final String toString() {
        a();
        return this.b.toString();
    }

    public final Iterator iterator() {
        a();
        return new amsh(this);
    }

    public final boolean add(Object obj) {
        a();
        boolean isEmpty = this.b.isEmpty();
        boolean add = this.b.add(obj);
        if (!add) {
            return add;
        }
        this.d.b = this.d.b + 1;
        if (!isEmpty) {
            return add;
        }
        c();
        return true;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.b.addAll(collection);
        if (addAll) {
            amrz.a(this.d, this.b.size() - size);
            if (size == 0) {
                c();
                addAll = true;
            }
        }
        return addAll;
    }

    public final boolean contains(Object obj) {
        a();
        return this.b.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        a();
        return this.b.containsAll(collection);
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.b.clear();
            amrz.b(this.d, size);
            b();
        }
    }

    public final boolean remove(Object obj) {
        a();
        boolean remove = this.b.remove(obj);
        if (remove) {
            this.d.b = this.d.b - 1;
            b();
        }
        return remove;
    }

    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.b.removeAll(collection);
        if (removeAll) {
            amrz.a(this.d, this.b.size() - size);
            b();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection collection) {
        amqw.a((Object) collection);
        int size = size();
        boolean retainAll = this.b.retainAll(collection);
        if (retainAll) {
            amrz.a(this.d, this.b.size() - size);
            b();
        }
        return retainAll;
    }
}
