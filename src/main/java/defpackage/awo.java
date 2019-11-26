package defpackage;

/* renamed from: awo */
public final class awo {
    public double a = Math.sqrt(1500.0d);
    public double b = 0.5d;
    public boolean c = false;
    public double d;
    public double e;
    private double f;
    private double g;
    private double h;
    private double i = Double.MAX_VALUE;
    private final awj j = new awj();

    public awo(float f) {
        this.i = (double) f;
    }

    public final awo a(float f) {
        this.i = (double) f;
        return this;
    }

    public final float a() {
        return (float) this.i;
    }

    /* Access modifiers changed, original: final */
    public final awj a(double d, double d2, long j) {
        double d3;
        double d4;
        double d5;
        double pow;
        awj awj;
        if (!this.c) {
            if (this.i != Double.MAX_VALUE) {
                d3 = this.b;
                if (d3 > 1.0d) {
                    d4 = this.a;
                    this.f = ((-d3) * d4) + (d4 * Math.sqrt((d3 * d3) - 4.0d));
                    d3 = this.b;
                    d4 = this.a;
                    this.g = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 4.0d));
                } else if (d3 >= 0.0d && d3 < 1.0d) {
                    this.h = this.a * Math.sqrt(1.0d - (d3 * d3));
                }
                this.c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        d3 = (double) j;
        Double.isNaN(d3);
        d3 /= 1000.0d;
        d4 = d - this.i;
        double d6 = this.b;
        double d7;
        double pow2;
        double d8;
        if (d6 > 1.0d) {
            d5 = this.g;
            d6 = ((d5 * d4) - d2) / (d5 - this.f);
            d4 -= d6;
            d5 = (Math.pow(2.718281828459045d, d5 * d3) * d4) + (Math.pow(2.718281828459045d, this.f * d3) * d6);
            d7 = this.g;
            pow2 = Math.pow(2.718281828459045d, d7 * d3);
            d8 = this.f;
            d4 = (d4 * d7) * pow2;
            d6 *= d8;
            pow = Math.pow(2.718281828459045d, d8 * d3);
        } else if (d6 != 1.0d) {
            d8 = this.h;
            d7 = this.a;
            double d9 = (1.0d / d8) * (((d6 * d7) * d4) + d2);
            d6 = Math.pow(2.718281828459045d, ((-d6) * d7) * d3) * ((Math.cos(this.h * d3) * d4) + (Math.sin(this.h * d3) * d9));
            d8 = this.a;
            d7 = this.b;
            d2 = d9;
            d5 = Math.pow(2.718281828459045d, ((-d7) * d8) * d3);
            pow2 = this.h;
            double sin = Math.sin(pow2 * d3);
            d = d5;
            d5 = this.h;
            d4 = (((-d8) * d6) * d7) + (d * ((((-pow2) * d4) * sin) + ((d5 * d2) * Math.cos(d5 * d3))));
            d5 = d6;
            awj = this.j;
            awj.a = (float) (d5 + this.i);
            awj.b = (float) d4;
            return awj;
        } else {
            d5 = this.a;
            d6 = d2 + (d5 * d4);
            d4 += d6 * d3;
            d5 = Math.pow(2.718281828459045d, (-d5) * d3) * d4;
            pow2 = -this.a;
            d4 = (d4 * Math.pow(2.718281828459045d, (-this.a) * d3)) * pow2;
            pow = Math.pow(2.718281828459045d, pow2 * d3);
        }
        d4 += d6 * pow;
        awj = this.j;
        awj.a = (float) (d5 + this.i);
        awj.b = (float) d4;
        return awj;
    }
}
