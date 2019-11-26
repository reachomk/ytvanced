package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: uiu */
public class uiu implements Iterator {
    private final int[] a;
    private final int b;
    private int c;

    public uiu(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public uiu(int[] iArr, int i, int i2) {
        this.a = (int[]) uhy.a((Object) iArr);
        int length = iArr.length;
        this.c = uhy.b(i, length);
        this.b = uhy.b(i + i2, length);
    }

    public final boolean hasNext() {
        return this.c < this.b;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        if (hasNext()) {
            int[] iArr = this.a;
            int i = this.c;
            this.c = i + 1;
            return Integer.valueOf(iArr[i]);
        }
        throw new NoSuchElementException();
    }
}
