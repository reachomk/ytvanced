package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: bdcu */
public final class bdcu extends bdct {
    private static final Integer c = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private final AtomicLong d = new AtomicLong();
    private long e;
    private final AtomicLong f = new AtomicLong();
    private final int g;

    public bdcu(int i) {
        super(i);
        this.g = Math.min(i / 4, c.intValue());
    }

    public final boolean offer(Object obj) {
        if (obj != null) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            int i = this.b;
            long j = this.d.get();
            int i2 = ((int) j) & i;
            if (j >= this.e) {
                long j2 = ((long) this.g) + j;
                if (atomicReferenceArray.get(i & ((int) j2)) == null) {
                    this.e = j2;
                } else if (atomicReferenceArray.get(i2) != null) {
                    return false;
                }
            }
            atomicReferenceArray.lazySet(i2, obj);
            this.d.lazySet(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final Object poll() {
        long j = this.f.get();
        int a = a(j);
        AtomicReferenceArray atomicReferenceArray = this.a;
        Object obj = atomicReferenceArray.get(a);
        if (obj == null) {
            return null;
        }
        atomicReferenceArray.lazySet(a, null);
        this.f.lazySet(j + 1);
        return obj;
    }

    public final Object peek() {
        return this.a.get(a(this.f.get()));
    }

    public final int size() {
        long a = a();
        while (true) {
            long b = b();
            long a2 = a();
            if (a == a2) {
                return (int) (b - a2);
            }
            a = a2;
        }
    }

    public final boolean isEmpty() {
        return b() == a();
    }

    private final long a() {
        return this.f.get();
    }

    private final long b() {
        return this.d.get();
    }

    public final /* synthetic */ void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final /* synthetic */ Iterator iterator() {
        throw new UnsupportedOperationException();
    }
}
