package defpackage;

import java.nio.ByteBuffer;

/* renamed from: banj */
public final class banj {
    public static final banj h = new banj(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final banj i = new banj(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final banj j = new banj(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final banj k = new banj(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    private final double l;
    private final double m;

    public banj(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.a = d5;
        this.b = d6;
        this.c = d7;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.l = d8;
        this.m = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            banj banj = (banj) obj;
            return Double.compare(banj.d, this.d) == 0 && Double.compare(banj.e, this.e) == 0 && Double.compare(banj.f, this.f) == 0 && Double.compare(banj.g, this.g) == 0 && Double.compare(banj.l, this.l) == 0 && Double.compare(banj.m, this.m) == 0 && Double.compare(banj.a, this.a) == 0 && Double.compare(banj.b, this.b) == 0 && Double.compare(banj.c, this.c) == 0;
        }
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.l);
        long doubleToLongBits9 = Double.doubleToLongBits(this.m);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4))) * 31) + ((int) ((doubleToLongBits5 >>> 32) ^ doubleToLongBits5))) * 31) + ((int) ((doubleToLongBits6 >>> 32) ^ doubleToLongBits6))) * 31) + ((int) ((doubleToLongBits7 >>> 32) ^ doubleToLongBits7))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(h)) {
            return "Rotate 0°";
        }
        if (equals(i)) {
            return "Rotate 90°";
        }
        if (equals(j)) {
            return "Rotate 180°";
        }
        if (equals(k)) {
            return "Rotate 270°";
        }
        double d = this.a;
        double d2 = this.b;
        double d3 = this.c;
        double d4 = this.d;
        double d5 = this.e;
        double d6 = this.f;
        double d7 = this.g;
        double d8 = this.l;
        double d9 = this.m;
        double d10 = d7;
        StringBuilder stringBuilder = new StringBuilder(260);
        stringBuilder.append("Matrix{u=");
        stringBuilder.append(d);
        stringBuilder.append(", v=");
        stringBuilder.append(d2);
        stringBuilder.append(", w=");
        stringBuilder.append(d3);
        stringBuilder.append(", a=");
        stringBuilder.append(d4);
        stringBuilder.append(", b=");
        stringBuilder.append(d5);
        stringBuilder.append(", c=");
        stringBuilder.append(d6);
        stringBuilder.append(", d=");
        stringBuilder.append(d10);
        stringBuilder.append(", tx=");
        stringBuilder.append(d8);
        stringBuilder.append(", ty=");
        stringBuilder.append(d9);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static banj a(ByteBuffer byteBuffer) {
        double g = cio.g(byteBuffer);
        double g2 = cio.g(byteBuffer);
        double h = cio.h(byteBuffer);
        return new banj(g, g2, cio.g(byteBuffer), cio.g(byteBuffer), h, cio.h(byteBuffer), cio.h(byteBuffer), cio.g(byteBuffer), cio.g(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        cin.a(byteBuffer, this.d);
        cin.a(byteBuffer, this.e);
        cin.b(byteBuffer, this.a);
        cin.a(byteBuffer, this.f);
        cin.a(byteBuffer, this.g);
        cin.b(byteBuffer, this.b);
        cin.a(byteBuffer, this.l);
        cin.a(byteBuffer, this.m);
        cin.b(byteBuffer, this.c);
    }
}
