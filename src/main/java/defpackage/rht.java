package defpackage;

import java.util.ListIterator;

/* renamed from: rht */
final class rht implements ListIterator {
    private final ListIterator a = this.c.a.listIterator(this.b);
    private final /* synthetic */ int b;
    private final /* synthetic */ rhu c;

    rht(rhu rhu, int i) {
        this.c = rhu;
        this.b = i;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    public final int nextIndex() {
        return this.a.nextIndex();
    }

    public final int previousIndex() {
        return this.a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object previous() {
        return (String) this.a.previous();
    }

    public final /* synthetic */ Object next() {
        return (String) this.a.next();
    }
}
