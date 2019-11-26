package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: zs */
final class zs implements Iterator {
    private final int a;
    private int b;
    private int c;
    private boolean d = false;
    private final /* synthetic */ zt e;

    zs(zt ztVar, int i) {
        this.e = ztVar;
        this.a = i;
        this.b = ztVar.a();
    }

    public final boolean hasNext() {
        return this.c < this.b;
    }

    public final Object next() {
        if (hasNext()) {
            Object a = this.e.a(this.c, this.a);
            this.c++;
            this.d = true;
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.d) {
            int i = this.c - 1;
            this.c = i;
            this.b--;
            this.d = false;
            this.e.a(i);
            return;
        }
        throw new IllegalStateException();
    }
}
