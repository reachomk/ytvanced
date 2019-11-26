package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: amue */
final class amue implements Iterator {
    private int a;
    private int b = -1;
    private int c;
    private int d;
    private final /* synthetic */ amub e;

    amue(amub amub) {
        this.e = amub;
        amtt amtt = this.e.a;
        this.a = amtt.e;
        this.c = amtt.d;
        this.d = amtt.c;
    }

    private final void a() {
        if (this.e.a.d != this.c) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        a();
        return this.a != -2 && this.d > 0;
    }

    public final Object next() {
        if (hasNext()) {
            Object a = this.e.a(this.a);
            int i = this.a;
            this.b = i;
            this.a = this.e.a.f[i];
            this.d--;
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        a();
        amss.a(this.b != -1);
        amtt amtt = this.e.a;
        int i = this.b;
        amtt.a(i, amud.a(amtt.a[i]));
        int i2 = this.a;
        amtt amtt2 = this.e.a;
        if (i2 == amtt2.c) {
            this.a = this.b;
        }
        this.b = -1;
        this.c = amtt2.d;
    }
}
