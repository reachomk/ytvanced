package defpackage;

/* renamed from: zka */
public final class zka {
    public final double a;
    public final double b;
    public final double c;
    public final double d;

    public zka(double d, double d2, double d3, double d4) {
        boolean z = true;
        amqw.a(d >= 0.0d);
        amqw.a(d2 >= 0.0d);
        amqw.a(d3 >= 0.0d);
        amqw.a(d4 >= 0.0d);
        amqw.a(d + d2 < 1.0d);
        if (d3 + d4 >= 1.0d) {
            z = false;
        }
        amqw.a(z);
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public final boolean a() {
        return (this.a == 0.0d && this.b == 0.0d && this.c == 0.0d && this.d == 0.0d) ? false : true;
    }
}
