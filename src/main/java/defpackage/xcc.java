package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: xcc */
public final class xcc implements Iterator {
    private final Iterator a;
    private Object b;

    public xcc(Iterator it) {
        this.a = (Iterator) amqw.a((Object) it);
        b();
    }

    private final void b() {
        this.b = this.a.hasNext() ? this.a.next() : null;
    }

    public final boolean hasNext() {
        return this.b != null;
    }

    public final Object a() {
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final Object next() {
        Object obj = this.b;
        if (obj != null) {
            b();
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
