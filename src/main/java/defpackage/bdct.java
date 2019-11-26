package defpackage;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: bdct */
abstract class bdct extends AbstractQueue {
    public final AtomicReferenceArray a;
    public final int b;

    public bdct(int i) {
        i = bddg.a(i);
        this.b = i - 1;
        this.a = new AtomicReferenceArray(i);
    }

    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(long j) {
        return this.b & ((int) j);
    }
}
