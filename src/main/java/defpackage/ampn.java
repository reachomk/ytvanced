package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ampn */
abstract class ampn implements Iterator {
    public int a = 2;
    private Object b;

    protected ampn() {
    }

    public abstract Object a();

    public final boolean hasNext() {
        amqw.b(this.a != 4);
        int i = this.a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            return true;
        } else {
            if (i2 != 2) {
                this.a = 4;
                this.b = a();
                if (this.a != 3) {
                    this.a = 1;
                    return true;
                }
            }
            return false;
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.a = 2;
            Object obj = this.b;
            this.b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
