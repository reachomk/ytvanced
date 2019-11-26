package defpackage;

import java.util.Iterator;

/* renamed from: bddr */
public final class bddr extends bddt {
    private static final int g = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final long h;
    private static final long i;
    private static final long j = ((long) bddx.a.arrayBaseOffset(Object[].class));
    private static final int k;
    private static final Object l = new Object();

    public bddr(int i) {
        i = bddg.a(i);
        long j = (long) (i - 1);
        Object[] objArr = new Object[(i + 1)];
        this.f = objArr;
        this.e = j;
        this.c = Math.min(i / 4, g);
        this.b = objArr;
        this.a = j;
        this.d = j - 1;
        a(0);
    }

    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    public final boolean offer(Object obj) {
        Object obj2 = obj;
        if (obj2 != null) {
            Object[] objArr = this.f;
            long j = this.producerIndex;
            long j2 = this.e;
            long a = bddr.a(j, j2);
            if (j < this.d) {
                return a(objArr, obj, j, a);
            }
            long j3 = ((long) this.c) + j;
            if (bddr.a(objArr, bddr.a(j3, j2)) == null) {
                this.d = j3 - 1;
                return a(objArr, obj, j, a);
            }
            j3 = 1 + j;
            if (bddr.a(objArr, bddr.a(j3, j2)) != null) {
                return a(objArr, obj, j, a);
            }
            int length = objArr.length;
            Object[] objArr2 = new Object[length];
            this.f = objArr2;
            this.d = (j + j2) - 1;
            bddr.a(objArr2, a, obj2);
            bddr.a(objArr, bddr.c((long) (length - 1)), objArr2);
            bddr.a(objArr, a, l);
            a(j3);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    private final boolean a(Object[] objArr, Object obj, long j, long j2) {
        bddr.a(objArr, j2, obj);
        a(j + 1);
        return true;
    }

    private static Object[] a(Object[] objArr) {
        return (Object[]) bddr.a(objArr, bddr.c((long) (objArr.length - 1)));
    }

    public final Object poll() {
        Object[] objArr = this.b;
        long j = this.consumerIndex;
        long j2 = this.a;
        long a = bddr.a(j, j2);
        Object a2 = bddr.a(objArr, a);
        Object obj = l;
        if (a2 == null) {
            if (obj != null) {
                return null;
            }
        } else if (a2 != obj) {
            bddr.a(objArr, a, null);
            b(j + 1);
            return a2;
        }
        objArr = bddr.a(objArr);
        this.b = objArr;
        j2 = bddr.a(j, j2);
        Object a3 = bddr.a(objArr, j2);
        if (a3 == null) {
            return null;
        }
        bddr.a(objArr, j2, null);
        b(j + 1);
        return a3;
    }

    public final Object peek() {
        Object[] objArr = this.b;
        long j = this.consumerIndex;
        long j2 = this.a;
        Object a = bddr.a(objArr, bddr.a(j, j2));
        if (a != l) {
            return a;
        }
        objArr = bddr.a(objArr);
        this.b = objArr;
        return bddr.a(objArr, bddr.a(j, j2));
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

    private final long a() {
        return bddx.a.getLongVolatile(this, h);
    }

    private final long b() {
        return bddx.a.getLongVolatile(this, i);
    }

    private final void a(long j) {
        bddx.a.putOrderedLong(this, h, j);
    }

    private final void b(long j) {
        bddx.a.putOrderedLong(this, i, j);
    }

    private static long a(long j, long j2) {
        return bddr.c(j & j2);
    }

    private static long c(long j) {
        return j + (j << k);
    }

    private static void a(Object[] objArr, long j, Object obj) {
        bddx.a.putOrderedObject(objArr, j, obj);
    }

    private static Object a(Object[] objArr, long j) {
        return bddx.a.getObjectVolatile(objArr, j);
    }

    static {
        InternalError internalError;
        int arrayIndexScale = bddx.a.arrayIndexScale(Object[].class);
        if (arrayIndexScale == 4) {
            k = 2;
        } else if (arrayIndexScale == 8) {
            k = 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
        try {
            h = bddx.a.objectFieldOffset(bddu.class.getDeclaredField("producerIndex"));
            try {
                i = bddx.a.objectFieldOffset(bddt.class.getDeclaredField("consumerIndex"));
            } catch (NoSuchFieldException e) {
                internalError = new InternalError();
                internalError.initCause(e);
                throw internalError;
            }
        } catch (NoSuchFieldException e2) {
            internalError = new InternalError();
            internalError.initCause(e2);
            throw internalError;
        }
    }
}
