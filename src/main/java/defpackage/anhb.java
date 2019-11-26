package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: anhb */
public final class anhb implements Serializable {
    private static final anhb b = new anhb(new int[0]);
    public final int a;
    private final int[] c;

    public anhb(int[] iArr) {
        int length = iArr.length;
        this.c = iArr;
        this.a = length;
    }

    private final boolean a() {
        return this.a == 0;
    }

    public final int a(int i) {
        amqw.a(i, this.a);
        return this.c[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anhb) {
            anhb anhb = (anhb) obj;
            if (this.a == anhb.a) {
                for (int i = 0; i < this.a; i++) {
                    if (a(i) != anhb.a(i)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.a; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    public final String toString() {
        if (a()) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder(this.a * 5);
        stringBuilder.append('[');
        stringBuilder.append(this.c[0]);
        for (int i = 1; i < this.a; i++) {
            stringBuilder.append(", ");
            stringBuilder.append(this.c[i]);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: final */
    public final Object writeReplace() {
        int i = this.a;
        int[] iArr = this.c;
        return i < iArr.length ? new anhb(Arrays.copyOfRange(iArr, 0, i)) : this;
    }

    /* Access modifiers changed, original: final */
    public final Object readResolve() {
        return a() ? b : this;
    }
}
