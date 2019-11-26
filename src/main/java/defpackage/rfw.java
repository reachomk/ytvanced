package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: rfw */
final class rfw extends rcw implements RandomAccess, rfi, rgt {
    public static final rfw b;
    private long[] c;
    private int d;

    rfw() {
        this(new long[10], 0);
    }

    private rfw(long[] jArr, int i) {
        this.c = jArr;
        this.d = i;
    }

    /* Access modifiers changed, original: protected|final */
    public final void removeRange(int i, int i2) {
        c();
        if (i2 >= i) {
            long[] jArr = this.c;
            System.arraycopy(jArr, i2, jArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfw)) {
            return super.equals(obj);
        }
        rfw rfw = (rfw) obj;
        if (this.d != rfw.d) {
            return false;
        }
        long[] jArr = rfw.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + rfc.a(this.c[i2]);
        }
        return i;
    }

    public final long b(int i) {
        c(i);
        return this.c[i];
    }

    public final int size() {
        return this.d;
    }

    public final void a(long j) {
        a(this.d, j);
    }

    private final void a(int i, long j) {
        c();
        if (i >= 0) {
            int i2 = this.d;
            if (i <= i2) {
                long[] jArr = this.c;
                if (i2 < jArr.length) {
                    System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
                } else {
                    long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(jArr, 0, jArr2, 0, i);
                    System.arraycopy(this.c, i, jArr2, i + 1, this.d - i);
                    this.c = jArr2;
                }
                this.c[i] = j;
                this.d++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(d(i));
    }

    public final boolean addAll(Collection collection) {
        c();
        rfc.a((Object) collection);
        if (!(collection instanceof rfw)) {
            return super.addAll(collection);
        }
        rfw rfw = (rfw) collection;
        int i = rfw.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            i2 += i;
            long[] jArr = this.c;
            if (i2 > jArr.length) {
                this.c = Arrays.copyOf(jArr, i2);
            }
            System.arraycopy(rfw.c, 0, this.c, this.d, rfw.d);
            this.d = i2;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Long.valueOf(this.c[i]))) {
                long[] jArr = this.c;
                System.arraycopy(jArr, i + 1, jArr, i, this.d - i);
                this.d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void c(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(d(i));
        }
    }

    private final String d(int i) {
        int i2 = this.d;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        c();
        c(i);
        long[] jArr = this.c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Long) obj).longValue());
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(b(i));
    }

    static {
        rfw rfw = new rfw();
        b = rfw;
        rfw.b();
    }
}
