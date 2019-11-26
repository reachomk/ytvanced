package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* renamed from: amsw */
final class amsw extends AbstractMap implements Serializable {
    public transient Object[] a;
    public transient Object[] b;
    public transient int c;
    public transient int d;
    private transient int[] e;
    private transient long[] f;
    private transient Set g;
    private transient Set h;
    private transient Collection i;

    amsw() {
        c(3);
    }

    private static int a(long j) {
        return (int) (j >>> 32);
    }

    private static long a(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    amsw(byte b) {
        c(12);
    }

    private final void c(int i) {
        amqw.a(true, (Object) "Expected size must be non-negative");
        this.c = Math.max(1, i);
    }

    private final boolean b() {
        return this.e == null;
    }

    private static int[] d(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private final int c() {
        return this.e.length - 1;
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        if (b()) {
            amqw.b(b(), (Object) "Arrays already allocated");
            i = this.c;
            this.e = amsw.d(amud.b(i));
            long[] jArr = new long[i];
            Arrays.fill(jArr, -1);
            this.f = jArr;
            this.a = new Object[i];
            this.b = new Object[i];
        }
        long[] jArr2 = this.f;
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        int a = amud.a(obj);
        int c = c() & a;
        int i2 = this.d;
        int[] iArr = this.e;
        int i3 = iArr[c];
        if (i3 == -1) {
            iArr[c] = i2;
        } else {
            while (true) {
                long j = jArr2[i3];
                if (amsw.a(j) == a && amqq.a(obj, objArr[i3])) {
                    obj = objArr2[i3];
                    objArr2[i3] = obj2;
                    return obj;
                }
                c = (int) j;
                if (c == -1) {
                    jArr2[i3] = amsw.a(j, i2);
                    break;
                }
                i3 = c;
            }
        }
        i = Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE) {
            int i4 = i2 + 1;
            int length = this.f.length;
            if (i4 > length) {
                int max = Math.max(1, length >>> 1) + length;
                if (max >= 0) {
                    i = max;
                }
                if (i != length) {
                    this.a = Arrays.copyOf(this.a, i);
                    this.b = Arrays.copyOf(this.b, i);
                    long[] jArr3 = this.f;
                    max = jArr3.length;
                    jArr3 = Arrays.copyOf(jArr3, i);
                    if (i > max) {
                        Arrays.fill(jArr3, max, i, -1);
                    }
                    this.f = jArr3;
                }
            }
            this.f[i2] = (((long) a) << 32) | 4294967295L;
            this.a[i2] = obj;
            this.b[i2] = obj2;
            this.d = i4;
            int length2 = this.e.length;
            if (((double) i2) > ((double) length2) && length2 < 1073741824) {
                int[] d = amsw.d(length2 + length2);
                long[] jArr4 = this.f;
                i = d.length - 1;
                for (int i5 = 0; i5 < this.d; i5++) {
                    int a2 = amsw.a(jArr4[i5]);
                    i4 = a2 & i;
                    a = d[i4];
                    d[i4] = i5;
                    jArr4[i5] = (((long) a2) << 32) | (((long) a) & 4294967295L);
                }
                this.e = d;
            }
            this.c++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    public final int a(Object obj) {
        if (!b()) {
            int a = amud.a(obj);
            int i = this.e[c() & a];
            while (i != -1) {
                long j = this.f[i];
                if (amsw.a(j) == a && amqq.a(obj, this.a[i])) {
                    return i;
                }
                i = (int) j;
            }
        }
        return -1;
    }

    public final boolean containsKey(Object obj) {
        return a(obj) != -1;
    }

    public final Object get(Object obj) {
        int a = a(obj);
        return a != -1 ? this.b[a] : null;
    }

    public final Object remove(Object obj) {
        return !b() ? a(obj, amud.a(obj)) : null;
    }

    private final Object a(Object obj, int i) {
        int c = c() & i;
        int i2 = this.e[c];
        if (i2 != -1) {
            int i3 = -1;
            while (true) {
                if (amsw.a(this.f[i2]) != i || !amqq.a(obj, this.a[i2])) {
                    i3 = (int) this.f[i2];
                    if (i3 == -1) {
                        break;
                    }
                    int i4 = i3;
                    i3 = i2;
                    i2 = i4;
                } else {
                    long[] jArr;
                    Object obj2 = this.b[i2];
                    if (i3 == -1) {
                        this.e[c] = (int) this.f[i2];
                    } else {
                        jArr = this.f;
                        jArr[i3] = amsw.a(jArr[i3], (int) jArr[i2]);
                    }
                    i3 = this.d - 1;
                    if (i2 >= i3) {
                        this.a[i2] = null;
                        this.b[i2] = null;
                        this.f[i2] = -1;
                    } else {
                        Object[] objArr = this.a;
                        objArr[i2] = objArr[i3];
                        Object[] objArr2 = this.b;
                        objArr2[i2] = objArr2[i3];
                        objArr[i3] = null;
                        objArr2[i3] = null;
                        long[] jArr2 = this.f;
                        long j = jArr2[i3];
                        jArr2[i2] = j;
                        jArr2[i3] = -1;
                        int a = amsw.a(j) & c();
                        int[] iArr = this.e;
                        c = iArr[a];
                        if (c == i3) {
                            iArr[a] = i2;
                        } else {
                            while (true) {
                                jArr = this.f;
                                j = jArr[c];
                                i = (int) j;
                                if (i == i3) {
                                    break;
                                }
                                c = i;
                            }
                            jArr[c] = amsw.a(j, i2);
                        }
                    }
                    this.d--;
                    this.c++;
                    return obj2;
                }
            }
        }
        return null;
    }

    public final Object a(int i) {
        return a(this.a[i], amsw.a(this.f[i]));
    }

    /* Access modifiers changed, original: final */
    public final int a() {
        return isEmpty() ? -1 : 0;
    }

    /* Access modifiers changed, original: final */
    public final int b(int i) {
        i++;
        return i >= this.d ? -1 : i;
    }

    public final Set keySet() {
        Set set = this.g;
        if (set != null) {
            return set;
        }
        amtc amtc = new amtc(this);
        this.g = amtc;
        return amtc;
    }

    public final Set entrySet() {
        Set set = this.h;
        if (set != null) {
            return set;
        }
        amta amta = new amta(this);
        this.h = amta;
        return amta;
    }

    public final int size() {
        return this.d;
    }

    public final boolean isEmpty() {
        return this.d == 0;
    }

    public final boolean containsValue(Object obj) {
        for (int i = 0; i < this.d; i++) {
            if (amqq.a(obj, this.b[i])) {
                return true;
            }
        }
        return false;
    }

    public final Collection values() {
        Collection collection = this.i;
        if (collection != null) {
            return collection;
        }
        amte amte = new amte(this);
        this.i = amte;
        return amte;
    }

    public final void clear() {
        if (!b()) {
            this.c++;
            Arrays.fill(this.a, 0, this.d, null);
            Arrays.fill(this.b, 0, this.d, null);
            Arrays.fill(this.e, -1);
            Arrays.fill(this.f, 0, this.d, -1);
            this.d = 0;
        }
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.d);
        int a = a();
        while (a >= 0) {
            objectOutputStream.writeObject(this.a[a]);
            objectOutputStream.writeObject(this.b[a]);
            a = b(a);
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            c(readInt);
            for (int i = 0; i < readInt; i++) {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(25);
        stringBuilder.append("Invalid size: ");
        stringBuilder.append(readInt);
        throw new InvalidObjectException(stringBuilder.toString());
    }
}
