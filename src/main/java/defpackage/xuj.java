package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: xuj */
final class xuj implements Iterator {
    private int a = 0;
    private int b;
    private xuh c;
    private xuh d;
    private Object e;
    private final xuk f;
    private final /* synthetic */ xuc g;

    public xuj(xuc xuc, xuk xuk) {
        this.g = xuc;
        this.f = xuk;
        this.b = xuc.b;
    }

    public final boolean hasNext() {
        xuh xuh = this.d;
        if (xuh == null || (this.e == null && !xuh.b)) {
            while (true) {
                xuh = this.d;
                if (xuh == null) {
                    do {
                        int i = this.a;
                        xuh[] xuhArr = this.g.a;
                        if (i >= xuhArr.length) {
                            break;
                        }
                        this.a = i + 1;
                        xuh = xuhArr[i];
                        this.d = xuh;
                    } while (xuh == null);
                    xuh = this.d;
                    if (xuh == null) {
                        return false;
                    }
                }
                this.e = xuh.get();
                if (this.e != null) {
                    break;
                }
                xuh = this.d;
                if (xuh.b) {
                    break;
                }
                this.d = xuh.d;
            }
        }
        return true;
    }

    public final Object next() {
        if (this.b != this.g.b) {
            throw new ConcurrentModificationException();
        } else if (hasNext()) {
            this.c = this.d;
            xuh xuh = this.c;
            this.d = xuh.d;
            Object a = this.f.a(xuh);
            this.e = null;
            return a;
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void remove() {
        if (this.b == this.g.b) {
            xuh xuh = this.c;
            if (xuh != null) {
                this.g.a(xuh);
                this.c = null;
                this.b++;
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
