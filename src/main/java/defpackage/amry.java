package defpackage;

import java.util.NoSuchElementException;

/* renamed from: amry */
abstract class amry extends amxn {
    private final int a;
    private int b;

    protected amry(int i) {
        this(i, 0);
    }

    public abstract Object a(int i);

    protected amry(int i, int i2) {
        amqw.b(i2, i);
        this.a = i;
        this.b = i2;
    }

    public final boolean hasNext() {
        return this.b < this.a;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.b;
            this.b = i + 1;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.b;
    }

    public final boolean hasPrevious() {
        return this.b > 0;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.b - 1;
            this.b = i;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.b - 1;
    }
}
