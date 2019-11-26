package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: amxc */
class amxc extends amxf implements Collection {
    public static final long serialVersionUID = 0;

    /* Access modifiers changed, original: 0000 */
    public Collection a() {
        return (Collection) this.a;
    }

    public final boolean add(Object obj) {
        boolean add;
        synchronized (this.b) {
            add = a().add(obj);
        }
        return add;
    }

    public final boolean addAll(Collection collection) {
        boolean addAll;
        synchronized (this.b) {
            addAll = a().addAll(collection);
        }
        return addAll;
    }

    public final void clear() {
        synchronized (this.b) {
            a().clear();
        }
    }

    public boolean contains(Object obj) {
        boolean contains;
        synchronized (this.b) {
            contains = a().contains(obj);
        }
        return contains;
    }

    public boolean containsAll(Collection collection) {
        boolean containsAll;
        synchronized (this.b) {
            containsAll = a().containsAll(collection);
        }
        return containsAll;
    }

    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.b) {
            isEmpty = a().isEmpty();
        }
        return isEmpty;
    }

    public Iterator iterator() {
        return a().iterator();
    }

    public boolean remove(Object obj) {
        boolean remove;
        synchronized (this.b) {
            remove = a().remove(obj);
        }
        return remove;
    }

    public boolean removeAll(Collection collection) {
        boolean removeAll;
        synchronized (this.b) {
            removeAll = a().removeAll(collection);
        }
        return removeAll;
    }

    public boolean retainAll(Collection collection) {
        boolean retainAll;
        synchronized (this.b) {
            retainAll = a().retainAll(collection);
        }
        return retainAll;
    }

    public final int size() {
        int size;
        synchronized (this.b) {
            size = a().size();
        }
        return size;
    }

    public Object[] toArray() {
        Object[] toArray;
        synchronized (this.b) {
            toArray = a().toArray();
        }
        return toArray;
    }

    public Object[] toArray(Object[] objArr) {
        synchronized (this.b) {
            objArr = a().toArray(objArr);
        }
        return objArr;
    }

    /* synthetic */ amxc(Collection collection, Object obj) {
        super(collection, obj);
    }
}
