package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: pxx */
public final class pxx implements Iterator {
    private final pxt a;
    private int b = -1;

    public pxx(pxt pxt) {
        this.a = (pxt) pzr.a((Object) pxt);
    }

    public final boolean hasNext() {
        return this.b < this.a.a() + -1;
    }

    public final Object next() {
        int i;
        if (hasNext()) {
            pxt pxt = this.a;
            i = this.b + 1;
            this.b = i;
            return pxt.a(i);
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
