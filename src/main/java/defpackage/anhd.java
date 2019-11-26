package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: anhd */
final class anhd extends AbstractList implements Serializable, RandomAccess {
    public static final long serialVersionUID = 0;
    public final int[] a;
    public final int b;
    public final int c;

    anhd(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public final boolean isEmpty() {
        return false;
    }

    private anhd(int[] iArr, int i, int i2) {
        this.a = iArr;
        this.b = i;
        this.c = i2;
    }

    public final int size() {
        return this.c - this.b;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && anhe.a(this.a, ((Integer) obj).intValue(), this.b, this.c) != -1;
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int a = anhe.a(this.a, ((Integer) obj).intValue(), this.b, this.c);
            if (a >= 0) {
                return a - this.b;
            }
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.a;
            int intValue = ((Integer) obj).intValue();
            int i = this.b;
            int i2 = this.c - 1;
            while (i2 >= i) {
                if (iArr[i2] == intValue) {
                    break;
                }
                i2--;
            }
            i2 = -1;
            if (i2 >= 0) {
                return i2 - this.b;
            }
        }
        return -1;
    }

    public final List subList(int i, int i2) {
        amqw.a(i, i2, size());
        if (i == i2) {
            return Collections.emptyList();
        }
        int[] iArr = this.a;
        int i3 = this.b;
        return new anhd(iArr, i + i3, i3 + i2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof anhd)) {
            return super.equals(obj);
        }
        anhd anhd = (anhd) obj;
        int size = size();
        if (anhd.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (this.a[this.b + i] != anhd.a[anhd.b + i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.b; i2 < this.c; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(size() * 5);
        stringBuilder.append('[');
        stringBuilder.append(this.a[this.b]);
        int i = this.b;
        while (true) {
            i++;
            if (i < this.c) {
                stringBuilder.append(", ");
                stringBuilder.append(this.a[i]);
            } else {
                stringBuilder.append(']');
                return stringBuilder.toString();
            }
        }
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        obj = (Integer) obj;
        amqw.a(i, size());
        int[] iArr = this.a;
        int i2 = this.b + i;
        i = iArr[i2];
        iArr[i2] = ((Integer) amqw.a(obj)).intValue();
        return Integer.valueOf(i);
    }

    public final /* synthetic */ Object get(int i) {
        amqw.a(i, size());
        return Integer.valueOf(this.a[this.b + i]);
    }
}
