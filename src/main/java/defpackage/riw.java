package defpackage;

import java.util.Arrays;

/* renamed from: riw */
final class riw {
    public final int a;
    public final byte[] b;

    riw(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof riw) {
            riw riw = (riw) obj;
            return this.a == riw.a && Arrays.equals(this.b, riw.b);
        }
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + Arrays.hashCode(this.b);
    }
}
