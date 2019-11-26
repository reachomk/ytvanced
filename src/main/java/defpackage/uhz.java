package defpackage;

import java.util.Arrays;

/* renamed from: uhz */
public final class uhz {
    private static final Object[] b = new Object[0];
    public final Object[] a;
    private final int c;

    uhz(Object... objArr) {
        this.a = objArr;
        this.c = Arrays.hashCode(objArr);
    }

    public final int hashCode() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uhz) {
            uhz uhz = (uhz) obj;
            if (this.c == uhz.c && Arrays.equals(this.a, uhz.a)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return Arrays.toString(this.a);
    }

    static {
        uhz uhz = new uhz(b);
    }
}
