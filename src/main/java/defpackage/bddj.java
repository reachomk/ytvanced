package defpackage;

/* renamed from: bddj */
public final class bddj extends bddm {
    public bddj(int i) {
        super(i);
    }

    public final boolean offer(Object obj) {
        if (obj != null) {
            Object[] objArr = this.a;
            long j = this.producerIndex;
            long a = a(j);
            if (bdde.a(objArr, a) != null) {
                return false;
            }
            bdde.a(objArr, a, obj);
            b(j + 1);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    public final Object poll() {
        long j = this.consumerIndex;
        long a = a(j);
        Object[] objArr = this.a;
        Object a2 = bdde.a(objArr, a);
        if (a2 == null) {
            return null;
        }
        bdde.a(objArr, a, null);
        c(j + 1);
        return a2;
    }

    public final Object peek() {
        return bdde.a(this.a, a(this.consumerIndex));
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

    private final void b(long j) {
        bddx.a.putOrderedLong(this, c, j);
    }

    private final void c(long j) {
        bddx.a.putOrderedLong(this, b, j);
    }

    private final long a() {
        return bddx.a.getLongVolatile(this, c);
    }

    private final long b() {
        return bddx.a.getLongVolatile(this, b);
    }
}
