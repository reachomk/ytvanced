package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: amsh */
class amsh implements Iterator {
    public final Iterator a;
    private final Collection b = this.c.b;
    private final /* synthetic */ amsi c;

    amsh(amsi amsi) {
        Iterator listIterator;
        this.c = amsi;
        Collection collection = amsi.b;
        if (collection instanceof List) {
            listIterator = ((List) collection).listIterator();
        } else {
            listIterator = collection.iterator();
        }
        this.a = listIterator;
    }

    amsh(amsi amsi, Iterator it) {
        this.c = amsi;
        this.a = it;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.c.a();
        if (this.c.b != this.b) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    public final Object next() {
        a();
        return this.a.next();
    }

    public final void remove() {
        this.a.remove();
        this.c.d.b = this.c.d.b - 1;
        this.c.b();
    }
}
