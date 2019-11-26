package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: rhg */
final class rhg implements Iterator {
    rhg() {
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
