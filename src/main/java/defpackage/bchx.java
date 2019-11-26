package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bchx */
final class bchx implements Iterator {
    private final int a;
    private int b;
    private boolean c;
    private final /* synthetic */ bchv d;

    public final boolean hasNext() {
        int i = this.b;
        while (i < this.a && this.d.a(i) == null) {
            i++;
        }
        if (i < this.a) {
            return true;
        }
        a();
        return false;
    }

    public final Object next() {
        int i;
        while (true) {
            i = this.b;
            if (i >= this.a || this.d.a(i) != null) {
                i = this.b;
            } else {
                this.b++;
            }
        }
        i = this.b;
        if (i < this.a) {
            bchv bchv = this.d;
            this.b = i + 1;
            return bchv.a(i);
        }
        a();
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final void a() {
        if (!this.c) {
            this.c = true;
            bchv bchv = this.d;
            int i = bchv.b - 1;
            bchv.b = i;
            if (i <= 0 && bchv.d) {
                bchv.d = false;
                i = bchv.a.size();
                while (true) {
                    i--;
                    if (i < 0) {
                        return;
                    }
                    if (bchv.a.get(i) == null) {
                        bchv.a.remove(i);
                    }
                }
            }
        }
    }

    /* synthetic */ bchx(bchv bchv) {
        this.d = bchv;
        bchv.b++;
        this.a = bchv.a.size();
    }
}
