package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: bdcw */
public final class bdcw implements Queue {
    private static final int a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object j = new Object();
    private final AtomicLong b = new AtomicLong();
    private final int c;
    private long d;
    private final int e;
    private AtomicReferenceArray f;
    private final int g;
    private AtomicReferenceArray h;
    private final AtomicLong i = new AtomicLong();

    public bdcw(int i) {
        i = bddg.a(i);
        int i2 = i - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i + 1);
        this.f = atomicReferenceArray;
        this.e = i2;
        this.c = Math.min(i / 4, a);
        this.h = atomicReferenceArray;
        this.g = i2;
        this.d = (long) (i2 - 1);
    }

    public final boolean offer(Object obj) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        long j = this.b.get();
        int i = this.e;
        int i2 = ((int) j) & i;
        if (j < this.d) {
            return a(atomicReferenceArray, obj, j, i2);
        }
        long j2 = ((long) this.c) + j;
        if (atomicReferenceArray.get(((int) j2) & i) != null) {
            j2 = 1 + j;
            if (atomicReferenceArray.get(((int) j2) & i) == null) {
                return a(atomicReferenceArray, obj, j, i2);
            }
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
            this.f = atomicReferenceArray2;
            this.d = (j + ((long) i)) - 1;
            atomicReferenceArray2.lazySet(i2, obj);
            bdcw.a(atomicReferenceArray, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, j);
            a(j2);
            return true;
        }
        this.d = j2 - 1;
        return a(atomicReferenceArray, obj, j, i2);
    }

    private final boolean a(AtomicReferenceArray atomicReferenceArray, Object obj, long j, int i) {
        atomicReferenceArray.lazySet(i, obj);
        a(j + 1);
        return true;
    }

    private static void a(AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2) {
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
    }

    private static AtomicReferenceArray a(AtomicReferenceArray atomicReferenceArray) {
        return (AtomicReferenceArray) atomicReferenceArray.get(atomicReferenceArray.length() - 1);
    }

    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.h;
        long c = c();
        int i = ((int) c) & this.g;
        Object obj = atomicReferenceArray.get(i);
        Object obj2 = j;
        if (obj == null) {
            if (obj2 != null) {
                return null;
            }
        } else if (obj != obj2) {
            atomicReferenceArray.lazySet(i, null);
            b(c + 1);
            return obj;
        }
        atomicReferenceArray = bdcw.a(atomicReferenceArray);
        this.h = atomicReferenceArray;
        obj = atomicReferenceArray.get(i);
        if (obj == null) {
            return null;
        }
        atomicReferenceArray.lazySet(i, null);
        b(c + 1);
        return obj;
    }

    public final Object peek() {
        AtomicReferenceArray atomicReferenceArray = this.h;
        int c = this.g & ((int) c());
        Object obj = atomicReferenceArray.get(c);
        if (obj != j) {
            return obj;
        }
        atomicReferenceArray = bdcw.a(atomicReferenceArray);
        this.h = atomicReferenceArray;
        return atomicReferenceArray.get(c);
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final int size() {
        long b = b();
        while (true) {
            long a = a();
            long b2 = b();
            if (b == b2) {
                return (int) (a - b2);
            }
            b = b2;
        }
    }

    public final boolean isEmpty() {
        return a() == b();
    }

    private final long a() {
        return this.b.get();
    }

    private final long b() {
        return this.i.get();
    }

    private final long c() {
        return this.i.get();
    }

    private final void a(long j) {
        this.b.lazySet(j);
    }

    private final void b(long j) {
        this.i.lazySet(j);
    }

    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
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

    public final boolean a(Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        long a = a();
        int i = this.e;
        long j = 2 + a;
        int i2;
        if (atomicReferenceArray.get(((int) j) & i) == null) {
            i2 = ((int) a) & i;
            atomicReferenceArray.lazySet(i2 + 1, obj2);
            atomicReferenceArray.lazySet(i2, obj);
            a(j);
        } else {
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
            this.f = atomicReferenceArray2;
            i2 = ((int) a) & i;
            atomicReferenceArray2.lazySet(i2 + 1, obj2);
            atomicReferenceArray2.lazySet(i2, obj);
            bdcw.a(atomicReferenceArray, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i2, j);
            a(j);
        }
        return true;
    }
}
