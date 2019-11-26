package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: bbxb */
public final class bbxb implements bbpd {
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

    public bbxb(int i) {
        i = bbzc.a(Math.max(8, i));
        int i2 = i - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i + 1);
        this.f = atomicReferenceArray;
        this.e = i2;
        this.c = Math.min(i / 4, a);
        this.h = atomicReferenceArray;
        this.g = i2;
        this.d = (long) (i2 - 1);
        a(0);
    }

    public final boolean a(Object obj) {
        if (obj != null) {
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
                atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
                atomicReferenceArray.lazySet(i2, j);
                a(j2);
                return true;
            }
            this.d = j2 - 1;
            return a(atomicReferenceArray, obj, j, i2);
        }
        throw new NullPointerException("Null is not a valid element");
    }

    private final boolean a(AtomicReferenceArray atomicReferenceArray, Object obj, long j, int i) {
        atomicReferenceArray.lazySet(i, obj);
        a(j + 1);
        return true;
    }

    public final Object bI_() {
        AtomicReferenceArray atomicReferenceArray = this.h;
        long j = this.i.get();
        int i = this.g;
        int i2 = ((int) j) & i;
        Object obj = atomicReferenceArray.get(i2);
        Object obj2 = j;
        if (obj == null) {
            if (obj2 != null) {
                return null;
            }
        } else if (obj != obj2) {
            atomicReferenceArray.lazySet(i2, null);
            b(j + 1);
            return obj;
        }
        i++;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i);
        atomicReferenceArray.lazySet(i, null);
        this.h = atomicReferenceArray2;
        Object obj3 = atomicReferenceArray2.get(i2);
        if (obj3 != null) {
            atomicReferenceArray2.lazySet(i2, null);
            b(j + 1);
        }
        return obj3;
    }

    public final void e() {
        while (true) {
            if (bI_() == null && b()) {
                return;
            }
        }
    }

    public final boolean b() {
        return this.b.get() == this.i.get();
    }

    private final void a(long j) {
        this.b.lazySet(j);
    }

    private final void b(long j) {
        this.i.lazySet(j);
    }
}
