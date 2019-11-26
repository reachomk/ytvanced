package defpackage;

/* renamed from: bcrw */
public final class bcrw extends bcrn {
    public static final long serialVersionUID = -8346152187724495365L;
    private final long b;

    public bcrw(bcpw bcpw, long j) {
        super(bcpw);
        this.b = j;
    }

    public final boolean c() {
        return true;
    }

    public final long d() {
        return this.b;
    }

    public final long a(long j, int i) {
        return bcrr.a(j, ((long) i) * this.b);
    }

    public final long a(long j, long j2) {
        long j3 = this.b;
        long j4 = 0;
        if (j3 == 1) {
            j4 = j2;
        } else if (j2 == 1) {
            j4 = j3;
        } else if (!(j2 == 0 || j3 == 0)) {
            long j5 = j2 * j3;
            if (j5 / j3 != j2 || ((j2 == Long.MIN_VALUE && j3 == -1) || (j3 == Long.MIN_VALUE && j2 == -1))) {
                StringBuilder stringBuilder = new StringBuilder(76);
                stringBuilder.append("Multiplication overflows a long: ");
                stringBuilder.append(j2);
                stringBuilder.append(" * ");
                stringBuilder.append(j3);
                throw new ArithmeticException(stringBuilder.toString());
            }
            j4 = j5;
        }
        return bcrr.a(j, j4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bcrw) {
            bcrw bcrw = (bcrw) obj;
            return this.a == bcrw.a && this.b == bcrw.b;
        }
    }

    public final int hashCode() {
        long j = this.b;
        return ((int) (j ^ (j >>> 32))) + this.a.hashCode();
    }
}
