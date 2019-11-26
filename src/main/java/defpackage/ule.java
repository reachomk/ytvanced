package defpackage;

import java.util.Iterator;

/* renamed from: ule */
public final class ule implements Iterator {
    private final int a;
    private int b = 0;

    public ule(int i) {
        this.a = i;
    }

    public final boolean hasNext() {
        return this.b < this.a;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        Integer valueOf = Integer.valueOf(this.b);
        this.b++;
        return valueOf;
    }
}
