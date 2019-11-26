package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: anxk */
final class anxk extends anvj implements anya, anzp, RandomAccess {
    public static final anxk b;
    private float[] c;
    private int d;

    anxk() {
        this(new float[10], 0);
    }

    private anxk(float[] fArr, int i) {
        this.c = fArr;
        this.d = i;
    }

    /* Access modifiers changed, original: protected|final */
    public final void removeRange(int i, int i2) {
        c();
        if (i2 >= i) {
            float[] fArr = this.c;
            System.arraycopy(fArr, i2, fArr, i, this.d - i2);
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
        if (!(obj instanceof anxk)) {
            return super.equals(obj);
        }
        anxk anxk = (anxk) obj;
        if (this.d != anxk.d) {
            return false;
        }
        float[] fArr = anxk.c;
        for (int i = 0; i < this.d; i++) {
            if (Float.floatToIntBits(this.c[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.c[i2]);
        }
        return i;
    }

    /* renamed from: b */
    public final anya a(int i) {
        if (i >= this.d) {
            return new anxk(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    public final float c(int i) {
        d(i);
        return this.c[i];
    }

    public final int size() {
        return this.d;
    }

    public final void a(float f) {
        a(this.d, f);
    }

    private final void a(int i, float f) {
        c();
        if (i >= 0) {
            int i2 = this.d;
            if (i <= i2) {
                float[] fArr = this.c;
                if (i2 < fArr.length) {
                    System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
                } else {
                    float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
                    System.arraycopy(fArr, 0, fArr2, 0, i);
                    System.arraycopy(this.c, i, fArr2, i + 1, this.d - i);
                    this.c = fArr2;
                }
                this.c[i] = f;
                this.d++;
                this.modCount++;
                return;
            }
        }
        throw new IndexOutOfBoundsException(e(i));
    }

    public final boolean addAll(Collection collection) {
        c();
        anxw.a((Object) collection);
        if (!(collection instanceof anxk)) {
            return super.addAll(collection);
        }
        anxk anxk = (anxk) collection;
        int i = anxk.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            i2 += i;
            float[] fArr = this.c;
            if (i2 > fArr.length) {
                this.c = Arrays.copyOf(fArr, i2);
            }
            System.arraycopy(anxk.c, 0, this.c, this.d, anxk.d);
            this.d = i2;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean remove(Object obj) {
        c();
        for (int i = 0; i < this.d; i++) {
            if (obj.equals(Float.valueOf(this.c[i]))) {
                float[] fArr = this.c;
                System.arraycopy(fArr, i + 1, fArr, i, (this.d - i) - 1);
                this.d--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    private final void d(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(e(i));
        }
    }

    private final String e(int i) {
        int i2 = this.d;
        StringBuilder stringBuilder = new StringBuilder(35);
        stringBuilder.append("Index:");
        stringBuilder.append(i);
        stringBuilder.append(", Size:");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        c();
        d(i);
        float[] fArr = this.c;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        a(i, ((Float) obj).floatValue());
    }

    public final /* synthetic */ Object get(int i) {
        return Float.valueOf(c(i));
    }

    static {
        anxk anxk = new anxk(new float[0], 0);
        b = anxk;
        anxk.b();
    }
}
