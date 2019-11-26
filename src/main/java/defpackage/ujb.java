package defpackage;

/* renamed from: ujb */
public final class ujb implements ujc {
    public final long a;
    public final long b;
    public final double c;

    public ujb(long j, long j2) {
        uhy.a(j < j2);
        this.a = j;
        this.b = j2;
        this.c = (double) (j2 - j);
    }

    public final long b(float f) {
        double d = (double) this.a;
        double d2 = this.c;
        double d3 = (double) f;
        Double.isNaN(d3);
        d2 *= d3;
        Double.isNaN(d);
        return Math.round(d + d2);
    }

    public final float a(long j) {
        double d = this.c;
        if (d == 0.0d) {
            return 0.0f;
        }
        double d2 = (double) (j - this.a);
        Double.isNaN(d2);
        return (float) (d2 / d);
    }

    public final long c(float f) {
        double d = this.c;
        double d2 = (double) f;
        Double.isNaN(d2);
        return Math.round(d * d2);
    }
}
