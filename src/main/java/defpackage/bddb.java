package defpackage;

import java.util.Iterator;

/* renamed from: bddb */
abstract class bddb extends bdda {
    bddb() {
    }

    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        bdcv a = a();
        bdcv b = b();
        int i = 0;
        while (a != b && i < Integer.MAX_VALUE) {
            bdcv b2;
            do {
                b2 = a.b();
            } while (b2 == null);
            i++;
            a = b2;
        }
        return i;
    }

    public final boolean isEmpty() {
        return a() == b();
    }
}
