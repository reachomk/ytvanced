package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: amsz */
abstract class amsz implements Iterator {
    private int a;
    private int b;
    private int c = -1;
    private final /* synthetic */ amsw d;

    public abstract Object a(int i);

    public final boolean hasNext() {
        return this.b >= 0;
    }

    public final Object next() {
        a();
        if (hasNext()) {
            int i = this.b;
            this.c = i;
            Object a = a(i);
            this.b = this.d.b(this.b);
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        a();
        amss.a(this.c >= 0);
        this.a++;
        this.d.a(this.c);
        this.b--;
        this.c = -1;
    }

    private final void a() {
        if (this.d.c != this.a) {
            throw new ConcurrentModificationException();
        }
    }

    /* synthetic */ amsz(amsw amsw) {
        this.d = amsw;
        amsw = this.d;
        this.a = amsw.c;
        this.b = amsw.a();
    }
}
