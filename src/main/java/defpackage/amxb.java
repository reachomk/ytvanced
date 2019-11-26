package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: amxb */
class amxb extends amxc implements List {
    public static final long serialVersionUID = 0;

    amxb(List list, Object obj) {
        super(list, obj);
    }

    private final List b() {
        return (List) super.a();
    }

    public final void add(int i, Object obj) {
        synchronized (this.b) {
            b().add(i, obj);
        }
    }

    public final boolean addAll(int i, Collection collection) {
        boolean addAll;
        synchronized (this.b) {
            addAll = b().addAll(i, collection);
        }
        return addAll;
    }

    public final Object get(int i) {
        Object obj;
        synchronized (this.b) {
            obj = b().get(i);
        }
        return obj;
    }

    public final int indexOf(Object obj) {
        int indexOf;
        synchronized (this.b) {
            indexOf = b().indexOf(obj);
        }
        return indexOf;
    }

    public final int lastIndexOf(Object obj) {
        int lastIndexOf;
        synchronized (this.b) {
            lastIndexOf = b().lastIndexOf(obj);
        }
        return lastIndexOf;
    }

    public final ListIterator listIterator() {
        return b().listIterator();
    }

    public final ListIterator listIterator(int i) {
        return b().listIterator(i);
    }

    public final Object remove(int i) {
        Object remove;
        synchronized (this.b) {
            remove = b().remove(i);
        }
        return remove;
    }

    public final Object set(int i, Object obj) {
        Object obj2;
        synchronized (this.b) {
            obj2 = b().set(i, obj);
        }
        return obj2;
    }

    public final List subList(int i, int i2) {
        List a;
        synchronized (this.b) {
            a = amwt.a(b().subList(i, i2), this.b);
        }
        return a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        boolean equals;
        synchronized (this.b) {
            equals = b().equals(obj);
        }
        return equals;
    }

    public final int hashCode() {
        int hashCode;
        synchronized (this.b) {
            hashCode = b().hashCode();
        }
        return hashCode;
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Collection a() {
        return b();
    }
}
