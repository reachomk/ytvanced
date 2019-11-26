package defpackage;

import java.util.Arrays;

/* renamed from: epq */
public final class epq {
    public final int a;
    public final int b;

    private epq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static epq a(int i) {
        return new epq(i, 1);
    }

    public static epq b(int i) {
        return new epq(i, 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof epq) {
            epq epq = (epq) obj;
            if (this.a == epq.a && this.b == epq.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }
}
