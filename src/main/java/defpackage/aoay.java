package defpackage;

import java.util.Iterator;

/* renamed from: aoay */
final class aoay implements Iterator {
    private final Iterator a = this.b.a.iterator();
    private final /* synthetic */ aoaw b;

    aoay(aoaw aoaw) {
        this.b = aoaw;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.a.next();
    }
}
