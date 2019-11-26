package defpackage;

/* renamed from: bcry */
public final class bcry extends bcrp {
    public static final long serialVersionUID = -3205227092378684157L;
    private final int c = 100;

    public bcry(bcpx bcpx, bcpw bcpw) {
        super(bcpx, bcpw);
    }

    public final long a(long j, int i) {
        return this.b.a(j, ((long) i) * ((long) this.c));
    }

    public final long a(long j, long j2) {
        return this.b.a(j, bcrr.a(j2, this.c));
    }

    public final long d() {
        return this.b.d() * ((long) this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bcry) {
            bcry bcry = (bcry) obj;
            if (this.b.equals(bcry.b) && this.a == bcry.a && this.c == bcry.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = (long) this.c;
        return (((int) (j ^ (j >>> 32))) + this.a.hashCode()) + this.b.hashCode();
    }
}
