package defpackage;

import java.util.Iterator;

/* renamed from: bdde */
public abstract class bdde extends bddh {
    private static final int b = Integer.getInteger("sparse.shift", 0).intValue();
    private static final long c = ((long) (bddx.a.arrayBaseOffset(Object[].class) + (32 << (d - b))));
    private static final int d;
    public final Object[] a;
    private final long e;

    public bdde(int i) {
        i = bddg.a(i);
        this.e = (long) (i - 1);
        this.a = new Object[((i << b) + 64)];
    }

    /* Access modifiers changed, original: protected|final */
    public final long a(long j) {
        return c + ((j & this.e) << d);
    }

    protected static void a(Object[] objArr, long j, Object obj) {
        bddx.a.putOrderedObject(objArr, j, obj);
    }

    protected static Object a(Object[] objArr, long j) {
        return bddx.a.getObjectVolatile(objArr, j);
    }

    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    static {
        int arrayIndexScale = bddx.a.arrayIndexScale(Object[].class);
        if (arrayIndexScale == 4) {
            d = b + 2;
        } else if (arrayIndexScale == 8) {
            d = b + 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
    }
}
