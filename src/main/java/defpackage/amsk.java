package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: amsk */
class amsk extends amsi implements List {
    public final /* synthetic */ amrz d;

    amsk(amrz amrz, Object obj, List list, amsi amsi) {
        this.d = amrz;
        super(amrz, obj, list, amsi);
    }

    /* Access modifiers changed, original: final */
    public final List d() {
        return (List) this.b;
    }

    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = d().addAll(i, collection);
        if (addAll) {
            amrz.a(this.d, this.b.size() - size);
            if (size == 0) {
                c();
                addAll = true;
            }
        }
        return addAll;
    }

    public final Object get(int i) {
        a();
        return d().get(i);
    }

    public final Object set(int i, Object obj) {
        a();
        return d().set(i, obj);
    }

    public final void add(int i, Object obj) {
        a();
        boolean isEmpty = this.b.isEmpty();
        d().add(i, obj);
        this.d.b = this.d.b + 1;
        if (isEmpty) {
            c();
        }
    }

    public final Object remove(int i) {
        a();
        Object remove = d().remove(i);
        this.d.b = this.d.b - 1;
        b();
        return remove;
    }

    public final int indexOf(Object obj) {
        a();
        return d().indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        a();
        return d().lastIndexOf(obj);
    }

    public final ListIterator listIterator() {
        a();
        return new amsj(this);
    }

    public final ListIterator listIterator(int i) {
        a();
        return new amsj(this, i);
    }

    public final List subList(int i, int i2) {
        a();
        amrz amrz = this.d;
        Object obj = this.a;
        List subList = d().subList(i, i2);
        amsi amsi = this.c;
        if (amsi == null) {
            amsi = this;
        }
        return amrz.a(obj, subList, amsi);
    }
}
