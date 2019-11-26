package defpackage;

/* renamed from: oap */
public final class oap {
    public static final oap a = new oap(0, 0);
    public static final oap b = a;
    public final long c;
    public final long d;

    public oap(long j, long j2) {
        boolean z = true;
        oxz.a(j >= 0);
        if (j2 < 0) {
            z = false;
        }
        oxz.a(z);
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oap oap = (oap) obj;
            return this.c == oap.c && this.d == oap.d;
        }
    }

    public final int hashCode() {
        return (((int) this.c) * 31) + ((int) this.d);
    }

    static {
        oap oap = new oap(Long.MAX_VALUE, Long.MAX_VALUE);
        oap = new oap(Long.MAX_VALUE, 0);
        oap = new oap(0, Long.MAX_VALUE);
    }
}
