package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: rez */
final class rez extends rcw implements RandomAccess, rfi, rgt {
    private int[] b;
    private int c;

    rez() {
        this(new int[10], 0);
    }

    private rez(int[] iArr, int i) {
        this.b = iArr;
        this.c = i;
    }

    /* Access modifiers changed, original: protected|final */
    public final void removeRange(int i, int i2) {
        c();
        if (i2 >= i) {
            int[] iArr = this.b;
            System.arraycopy(iArr, i2, iArr, i, this.c - i2);
            this.c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rez)) {
            return super.equals(obj);
        }
        rez rez = (rez) obj;
        if (this.c != rez.c) {
            return false;
        }
        int[] iArr = rez.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    public final int b(int i) {
        d(i);
        return this.b[i];
    }

    public final int size() {
        return this.c;
    }

    public final void c(int i) {
        a(this.c, i);
    }

    private final void a(int i, int i2) {
        c();
        if (i >= 0) {
            int i3 = this.c;
            if (i <= i3) {
                int[] iArr = this.b;
                if (i3 < iArr.length) {
                    System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
                } else {
                    int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    System.arraycopy(this.b, i, iArr2, i + 1, this.c - i);
                    this.b = iArr2;
                }
                this.b[i] = i2;
                this.c++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(e(i));
    }

    public final boolean addAll(Collection collection) {
        c();
        rfc.a((Object) collection);
        if (!(collection instanceof rez)) {
            return super.addAll(collection);
        }
        rez rez = (rez) collection;
        int i = rez.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 >= i) {
            i2 += i;
            int[] iArr = this.b;
            if (i2 > iArr.length) {
                this.b = Arrays.copyOf(iArr, i2);
            }
            System.arraycopy(rez.b, 0, this.b, this.c, rez.c);
            this.c = i2;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Integer.valueOf(this.b[i]))) {
                int[] iArr = this.b;
                System.arraycopy(iArr, i + 1, iArr, i, this.c - i);
                this.c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void d(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(e(i));
        }
    }

    private final String e(int i) {
        int i2 = this.c;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        d(i);
        int[] iArr = this.b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Integer) obj).intValue());
    }

    public final /* synthetic */ rfi a(int i) {
        if (i >= this.c) {
            return new rez(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(b(i));
    }

    static {
        new rez().b();
    }
}
