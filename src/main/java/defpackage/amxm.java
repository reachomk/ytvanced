package defpackage;

import java.util.ListIterator;

/* renamed from: amxm */
abstract class amxm extends amxj implements ListIterator {
    amxm(ListIterator listIterator) {
        super(listIterator);
    }

    private final ListIterator a() {
        return (ListIterator) this.b;
    }

    public final boolean hasPrevious() {
        return a().hasPrevious();
    }

    public final Object previous() {
        return a(a().previous());
    }

    public final int nextIndex() {
        return a().nextIndex();
    }

    public final int previousIndex() {
        return a().previousIndex();
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }
}
