package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: anxt */
final class anxt extends anvj implements anxz, anzp, RandomAccess {
    public static final anxt b;
    private int[] c;
    private int d;

    anxt() {
        this(new int[10], 0);
    }

    private anxt(int[] iArr, int i) {
        this.c = iArr;
        this.d = i;
    }

    /* Access modifiers changed, original: protected|final */
    public final void removeRange(int i, int i2) {
        c();
        if (i2 >= i) {
            int[] iArr = this.c;
            System.arraycopy(iArr, i2, iArr, i, this.d - i2);
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
        if (!(obj instanceof anxt)) {
            return super.equals(obj);
        }
        anxt anxt = (anxt) obj;
        if (this.d != anxt.d) {
            return false;
        }
        int[] iArr = anxt.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    /* renamed from: b */
    public final anxz a(int i) {
        if (i >= this.d) {
            return new anxt(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    public final int c(int i) {
        e(i);
        return this.c[i];
    }

    public final int size() {
        return this.d;
    }

    public final void d(int i) {
        a(this.d, i);
    }

    private final void a(int i, int i2) {
        c();
        if (i >= 0) {
            int i3 = this.d;
            if (i <= i3) {
                int[] iArr = this.c;
                if (i3 < iArr.length) {
                    System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
                } else {
                    int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    System.arraycopy(this.c, i, iArr2, i + 1, this.d - i);
                    this.c = iArr2;
                }
                this.c[i] = i2;
                this.d++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(f(i));
    }

    public final boolean addAll(Collection collection) {
        c();
        anxw.a((Object) collection);
        if (!(collection instanceof anxt)) {
            return super.addAll(collection);
        }
        anxt anxt = (anxt) collection;
        int i = anxt.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            i2 += i;
            int[] iArr = this.c;
            if (i2 > iArr.length) {
                this.c = Arrays.copyOf(iArr, i2);
            }
            System.arraycopy(anxt.c, 0, this.c, this.d, anxt.d);
            this.d = i2;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Integer.valueOf(this.c[i]))) {
                int[] iArr = this.c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.d - i) - 1);
                this.d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void e(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(f(i));
        }
    }

    private final String f(int i) {
        int i2 = this.d;
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
        e(i);
        int[] iArr = this.c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Integer) obj).intValue());
    }

    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(c(i));
    }

    static {
        anxt anxt = new anxt(new int[0], 0);
        b = anxt;
        anxt.b();
    }
}
