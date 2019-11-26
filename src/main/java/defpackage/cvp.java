package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: cvp */
final class cvp implements Iterator {
    private int a = -1;
    private boolean b;
    private final /* synthetic */ cvq c;

    public cvp(cvq cvq) {
        this.c = cvq;
    }

    public final boolean hasNext() {
        return this.a + 1 < this.c.size();
    }

    public final Object next() {
        if (hasNext()) {
            this.b = false;
            int i = this.a + 1;
            this.a = i;
            return this.c.b(i);
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.b) {
            throw new IllegalStateException();
        }
        this.c.a(this.a);
        this.b = true;
        this.a--;
    }
}
