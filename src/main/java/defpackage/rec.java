package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: rec */
final class rec extends rcw implements RandomAccess, rfi, rgt {
    public static final rec b;
    private double[] c;
    private int d;

    rec() {
        this(new double[10], 0);
    }

    private rec(double[] dArr, int i) {
        this.c = dArr;
        this.d = i;
    }

    /* Access modifiers changed, original: protected|final */
    public final void removeRange(int i, int i2) {
        c();
        if (i2 >= i) {
            double[] dArr = this.c;
            System.arraycopy(dArr, i2, dArr, i, this.d - i2);
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
        if (!(obj instanceof rec)) {
            return super.equals(obj);
        }
        rec rec = (rec) obj;
        if (this.d != rec.d) {
            return false;
        }
        double[] dArr = rec.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != dArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + rfc.a(Double.doubleToLongBits(this.c[i2]));
        }
        return i;
    }

    public final int size() {
        return this.d;
    }

    public final void a(double d) {
        a(this.d, d);
    }

    private final void a(int i, double d) {
        c();
        if (i >= 0) {
            int i2 = this.d;
            if (i <= i2) {
                double[] dArr = this.c;
                if (i2 < dArr.length) {
                    System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
                } else {
                    double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(dArr, 0, dArr2, 0, i);
                    System.arraycopy(this.c, i, dArr2, i + 1, this.d - i);
                    this.c = dArr2;
                }
                this.c[i] = d;
                this.d++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(c(i));
    }

    public final boolean addAll(Collection collection) {
        c();
        rfc.a((Object) collection);
        if (!(collection instanceof rec)) {
            return super.addAll(collection);
        }
        rec rec = (rec) collection;
        int i = rec.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            i2 += i;
            double[] dArr = this.c;
            if (i2 > dArr.length) {
                this.c = Arrays.copyOf(dArr, i2);
            }
            System.arraycopy(rec.c, 0, this.c, this.d, rec.d);
            this.d = i2;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Double.valueOf(this.c[i]))) {
                double[] dArr = this.c;
                System.arraycopy(dArr, i + 1, dArr, i, this.d - i);
                this.d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void b(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(c(i));
        }
    }

    private final String c(int i) {
        int i2 = this.d;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        c();
        b(i);
        double[] dArr = this.c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Double) obj).doubleValue());
    }

    public final /* synthetic */ Object get(int i) {
        b(i);
        return Double.valueOf(this.c[i]);
    }

    static {
        rec rec = new rec();
        b = rec;
        rec.b();
    }
}
