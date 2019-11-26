package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: bdcx */
public final class bdcx extends AtomicReferenceArray implements Queue {
    public static final long serialVersionUID = 6210984603741293445L;
    private final int a;
    private final int b;
    private final AtomicLong c = new AtomicLong();
    private final AtomicLong d = new AtomicLong();

    public bdcx(int i) {
        super(bddg.a(i));
        int length = length();
        this.a = length - 1;
        this.b = length - i;
    }

    public final boolean offer(Object obj) {
        if (obj != null) {
            long j = this.c.get();
            int i = this.a;
            if (get(((int) (((long) this.b) + j)) & i) != null) {
                return false;
            }
            this.c.lazySet(1 + j);
            lazySet(((int) j) & i, obj);
            return true;
        }
        throw new NullPointerException();
    }

    public final Object poll() {
        long j = this.d.get();
        int i = ((int) j) & this.a;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        this.d.lazySet(j + 1);
        lazySet(i, null);
        return obj;
    }

    public final Object peek() {
        return get(this.a & ((int) this.d.get()));
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final boolean isEmpty() {
        return this.c == this.d;
    }

    public final int size() {
        long j = this.d.get();
        while (true) {
            long j2 = this.c.get();
            long j3 = this.d.get();
            if (j == j3) {
                return (int) (j2 - j3);
            }
            j = j3;
        }
    }

    public final boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean containsAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Object remove() {
        throw new UnsupportedOperationException();
    }

    public final Object element() {
        throw new UnsupportedOperationException();
    }
}
