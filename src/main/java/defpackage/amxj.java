package defpackage;

import java.util.Iterator;

/* renamed from: amxj */
abstract class amxj implements Iterator {
    public final Iterator b;

    amxj(Iterator it) {
        this.b = (Iterator) amqw.a((Object) it);
    }

    public abstract Object a(Object obj);

    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final Object next() {
        return a(this.b.next());
    }

    public final void remove() {
        this.b.remove();
    }
}
