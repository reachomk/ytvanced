package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bdcs */
abstract class bdcs extends AbstractQueue {
    public final AtomicReference a = new AtomicReference();
    private final AtomicReference b = new AtomicReference();

    private final bdcv b() {
        return (bdcv) this.a.get();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bdcv bdcv) {
        this.a.lazySet(bdcv);
    }

    private final bdcv c() {
        return (bdcv) this.b.get();
    }

    /* Access modifiers changed, original: protected|final */
    public final bdcv a() {
        return (bdcv) this.b.get();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(bdcv bdcv) {
        this.b.lazySet(bdcv);
    }

    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        bdcv c = c();
        bdcv b = b();
        int i = 0;
        while (c != b && i < Integer.MAX_VALUE) {
            bdcv b2;
            do {
                b2 = c.b();
            } while (b2 == null);
            i++;
            c = b2;
        }
        return i;
    }

    public final boolean isEmpty() {
        return c() == b();
    }
}
