package defpackage;

import java.util.Arrays;

/* renamed from: oqa */
public final class oqa {
    public static final oqa a = new oqa(new long[0]);
    public final int b = 0;
    public final long[] c;
    public final oqd[] d;
    public final long e;
    public final long f;

    private oqa(long... jArr) {
        this.c = Arrays.copyOf(jArr, 0);
        this.d = new oqd[0];
        this.e = 0;
        this.f = -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oqa oqa = (oqa) obj;
            return this.f == oqa.f && Arrays.equals(this.c, oqa.c) && Arrays.equals(this.d, oqa.d);
        }
    }

    public final int hashCode() {
        return (((((int) this.f) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
    }
}
