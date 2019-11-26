package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: nxu */
public final class nxu {
    public final byte[] a;
    public final int b;
    public final int c;

    public nxu(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nxu) {
            nxu nxu = (nxu) obj;
            if (Arrays.equals(this.a, nxu.a) && this.b == nxu.b && this.c == nxu.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }
}
