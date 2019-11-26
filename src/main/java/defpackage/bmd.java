package defpackage;

/* renamed from: bmd */
public final class bmd {
    public final String a;
    public final String b;
    public final double c;
    public final int d;
    public final double e;
    public final double f;
    public final int g;
    public final int h;
    public final double i;
    public final boolean j;
    public final int k;

    public final int hashCode() {
        double hashCode = (double) (((this.a.hashCode() * 31) + this.b.hashCode()) * 31);
        double d = this.c;
        Double.isNaN(hashCode);
        int i = ((int) (hashCode + d)) * 31;
        int i2 = this.k;
        int i3 = i2 - 1;
        if (i2 != 0) {
            i2 = this.d;
            long doubleToLongBits = Double.doubleToLongBits(this.e);
            return ((((((i + i3) * 31) + i2) * 31) + ((int) ((doubleToLongBits >>> 32) ^ doubleToLongBits))) * 31) + this.g;
        }
        throw null;
    }

    public bmd(String str, String str2, double d, int i, int i2, double d2, double d3, int i3, int i4, double d4, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = d;
        this.k = i;
        this.d = i2;
        this.e = d2;
        this.f = d3;
        this.g = i3;
        this.h = i4;
        this.i = d4;
        this.j = z;
    }
}
