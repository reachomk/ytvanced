package defpackage;

import java.util.Arrays;

/* renamed from: clb */
public final class clb {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int[] f = new int[]{255, 255, 255, 255};

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            clb clb = (clb) obj;
            return this.b == clb.b && this.d == clb.d && this.c == clb.c && this.e == clb.e && this.a == clb.a && Arrays.equals(this.f, clb.f);
        }
    }

    public final int hashCode() {
        int i = ((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31;
        int[] iArr = this.f;
        return i + (iArr != null ? Arrays.hashCode(iArr) : 0);
    }
}
