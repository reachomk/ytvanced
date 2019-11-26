package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: bbsw */
final class bbsw implements Iterator {
    private Object a;
    private final /* synthetic */ bbst b;

    bbsw(bbst bbst) {
        this.b = bbst;
    }

    public final boolean hasNext() {
        this.a = this.b.a;
        return bbyy.b(this.a) ^ 1;
    }

    public final Object next() {
        try {
            Object obj;
            if (this.a == null) {
                obj = this.b.a;
            }
            if (bbyy.b(this.a)) {
                throw new NoSuchElementException();
            } else if (bbyy.c(this.a)) {
                throw bbyw.a(bbyy.e(this.a));
            } else {
                obj = bbyy.d(this.a);
                this.a = null;
                return obj;
            }
        } finally {
            this.a = null;
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Read only iterator");
    }
}
