package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: tlt */
public final class tlt implements Iterator {
    private final tlq a;
    private int b = -1;

    public tlt(tlq tlq) {
        this.a = tlq;
    }

    public final boolean hasNext() {
        return this.b < this.a.b() + -1;
    }

    public final Object next() {
        int i;
        if (hasNext()) {
            tlq tlq = this.a;
            i = this.b + 1;
            this.b = i;
            return tlq.a(i);
        }
        i = this.b;
        StringBuilder stringBuilder = new StringBuilder(46);
        stringBuilder.append("Cannot advance the iterator beyond ");
        stringBuilder.append(i);
        throw new NoSuchElementException(stringBuilder.toString());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
