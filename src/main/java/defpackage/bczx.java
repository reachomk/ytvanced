package defpackage;

import java.util.NoSuchElementException;

/* renamed from: bczx */
final class bczx extends bcup {
    private final bcum a;
    private Object b;
    private int c;

    bczx(bcum bcum) {
        this.a = bcum;
    }

    public final void e_(Object obj) {
        int i = this.c;
        if (i == 0) {
            this.c = 1;
            this.b = obj;
        } else if (i == 1) {
            this.c = 2;
            this.a.a(new IndexOutOfBoundsException("The upstream produced more than one value"));
        }
    }

    public final void a(Throwable th) {
        if (this.c == 2) {
            bdeh.a(th);
            return;
        }
        this.b = null;
        this.a.a(th);
    }

    public final void bM_() {
        int i = this.c;
        if (i == 0) {
            this.a.a(new NoSuchElementException());
        } else if (i == 1) {
            this.c = 2;
            Object obj = this.b;
            this.b = null;
            this.a.a(obj);
        }
    }
}
