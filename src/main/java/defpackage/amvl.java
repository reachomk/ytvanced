package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: amvl */
class amvl extends AbstractList {
    public final List a;

    amvl(List list) {
        this.a = (List) amqw.a((Object) list);
    }

    private final int b(int i) {
        int size = size();
        amqw.a(i, size);
        return (size - 1) - i;
    }

    public final int a(int i) {
        int size = size();
        amqw.b(i, size);
        return size - i;
    }

    public final void add(int i, Object obj) {
        this.a.add(a(i), obj);
    }

    public final void clear() {
        this.a.clear();
    }

    public final Object remove(int i) {
        return this.a.remove(b(i));
    }

    /* Access modifiers changed, original: protected|final */
    public final void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    public final Object set(int i, Object obj) {
        return this.a.set(b(i), obj);
    }

    public final Object get(int i) {
        return this.a.get(b(i));
    }

    public final int size() {
        return this.a.size();
    }

    public final List subList(int i, int i2) {
        amqw.a(i, i2, size());
        return amvj.a(this.a.subList(a(i2), a(i)));
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final ListIterator listIterator(int i) {
        return new amvo(this, this.a.listIterator(a(i)));
    }
}
