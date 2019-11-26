package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: amvn */
final class amvn extends AbstractList implements Serializable, RandomAccess {
    public static final long serialVersionUID = 0;
    public final amqd a;
    private final List b;

    amvn(List list, amqd amqd) {
        this.b = (List) amqw.a((Object) list);
        this.a = (amqd) amqw.a((Object) amqd);
    }

    public final void clear() {
        this.b.clear();
    }

    public final Object get(int i) {
        return this.a.a(this.b.get(i));
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final ListIterator listIterator(int i) {
        return new amvq(this, this.b.listIterator(i));
    }

    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    public final Object remove(int i) {
        return this.a.a(this.b.remove(i));
    }

    public final int size() {
        return this.b.size();
    }
}
