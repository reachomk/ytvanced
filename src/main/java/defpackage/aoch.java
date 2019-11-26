package defpackage;

import java.util.Arrays;

/* renamed from: aoch */
final class aoch {
    public final int a;
    public final byte[] b;

    aoch(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aoch) {
            aoch aoch = (aoch) obj;
            return this.a == aoch.a && Arrays.equals(this.b, aoch.b);
        }
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.b);
    }
}
