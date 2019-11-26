package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: amwv */
final class amwv extends amxh {
    public static final long serialVersionUID = 0;

    amwv(Set set, Object obj) {
        super(set, obj);
    }

    public final Iterator iterator() {
        return new amwy(this, super.iterator());
    }

    public final Object[] toArray() {
        Object[] a;
        synchronized (this.b) {
            Iterable b = a();
            a = amwd.a(b, new Object[b.size()]);
        }
        return a;
    }

    public final Object[] toArray(Object[] objArr) {
        synchronized (this.b) {
            Iterable b = a();
            int size = b.size();
            if (objArr.length < size) {
                objArr = amwf.a(objArr, size);
            }
            amwd.a(b, objArr);
            if (objArr.length > size) {
                objArr[size] = null;
            }
        }
        return objArr;
    }

    public final boolean contains(Object obj) {
        boolean contains;
        synchronized (this.b) {
            contains = obj instanceof Entry ? a().contains(amvr.a((Entry) obj)) : false;
        }
        return contains;
    }

    public final boolean containsAll(Collection collection) {
        boolean a;
        synchronized (this.b) {
            a = amsr.a(a(), collection);
        }
        return a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        boolean a;
        synchronized (this.b) {
            a = amws.a(a(), obj);
        }
        return a;
    }

    public final boolean remove(Object obj) {
        boolean remove;
        synchronized (this.b) {
            remove = obj instanceof Entry ? a().remove(amvr.a((Entry) obj)) : false;
        }
        return remove;
    }

    public final boolean removeAll(Collection collection) {
        boolean a;
        synchronized (this.b) {
            a = amve.a(a().iterator(), collection);
        }
        return a;
    }

    public final boolean retainAll(Collection collection) {
        boolean z;
        synchronized (this.b) {
            Iterator it = a().iterator();
            amqw.a((Object) collection);
            z = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }
}
