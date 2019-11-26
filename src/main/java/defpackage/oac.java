package defpackage;

/* renamed from: oac */
final class oac {
    public final ook a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;

    oac(ook ook, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.a = ook;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oac oac = (oac) obj;
            return this.b == oac.b && this.c == oac.c && this.d == oac.d && this.e == oac.e && this.f == oac.f && this.g == oac.g && ozp.a(this.a, oac.a);
        }
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + this.f) * 31) + this.g;
    }
}
