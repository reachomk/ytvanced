package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: aoaf */
final class aoaf implements Iterator {
    aoaf() {
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
