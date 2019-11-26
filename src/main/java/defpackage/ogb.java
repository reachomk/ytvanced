package defpackage;

import java.util.Arrays;

/* renamed from: ogb */
public final class ogb {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public ogb(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ogb ogb = (ogb) obj;
            return this.a == ogb.a && this.c == ogb.c && this.d == ogb.d && Arrays.equals(this.b, ogb.b);
        }
    }

    public final int hashCode() {
        return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }
}
