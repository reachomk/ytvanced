package defpackage;

import java.util.Iterator;

/* renamed from: rhw */
final class rhw implements Iterator {
    private final Iterator a = this.b.a.iterator();
    private final /* synthetic */ rhu b;

    rhw(rhu rhu) {
        this.b = rhu;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return (String) this.a.next();
    }
}
