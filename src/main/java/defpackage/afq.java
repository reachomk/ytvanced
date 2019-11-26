package defpackage;

/* renamed from: afq */
final class afq {
    public static afq a;
    public long b;
    public long c;
    public int d;

    afq() {
    }

    public final void a(long j, double d, double d2) {
        float f = ((float) (-946728000000L + j)) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = (double) f2;
        double sin = Math.sin(d3) * 0.03341960161924362d;
        Double.isNaN(d3);
        sin = ((((sin + d3) + (Math.sin((double) (f2 + f2)) * 3.4906598739326E-4d)) + (Math.sin((double) (f2 * 3.0f)) * 5.236000106378924E-6d)) + 1.796593063d) + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double d5 = (double) (f - 4738.253f);
        Double.isNaN(d5);
        d5 = (double) (((float) Math.round(d5 - d4)) + 9.0E-4f);
        Double.isNaN(d5);
        d5 = ((d5 + d4) + (Math.sin(d3) * 0.0053d)) + (Math.sin(sin + sin) * -0.0069d);
        d3 = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        sin = 0.01745329238474369d * d;
        d4 = (Math.sin(-0.10471975803375244d) - (Math.sin(sin) * Math.sin(d3))) / (Math.cos(sin) * Math.cos(d3));
        if (d4 >= 1.0d) {
            this.d = 1;
            this.b = -1;
            this.c = -1;
        } else if (d4 > -1.0d) {
            double acos = (double) ((float) (Math.acos(d4) / 6.283185307179586d));
            Double.isNaN(acos);
            this.b = Math.round((d5 + acos) * 8.64E7d) + 946728000000L;
            Double.isNaN(acos);
            long round = Math.round((d5 - acos) * 8.64E7d) + 946728000000L;
            this.c = round;
            if (round >= j || this.b <= j) {
                this.d = 1;
            } else {
                this.d = 0;
            }
        } else {
            this.d = 0;
            this.b = -1;
            this.c = -1;
        }
    }
}
